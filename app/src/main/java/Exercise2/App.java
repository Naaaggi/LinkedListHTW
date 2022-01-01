/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercise2;

import Exercise2.commands.CommandFactory;
import Exercise2.commands.ICommand;
import Exercise2.console.IConsole;
import Exercise2.console.impl.Console;
import Exercise2.data.Student;
import Exercise2.lists.DoublyLinkedList;
import Exercise2.lists.IListable;
import Exercise2.lists.SinglyLinkedList;

import java.util.LinkedList;
public class App {
    private static boolean IfSingleList;


    private static boolean exitSubMenu;

    public static void main(String[] args) {

        IListable<Student> list = new SinglyLinkedList<>();
        IConsole console = new Console();
        CommandFactory factory = new CommandFactory(console, list);
        LinkedList<ICommand> listOptions = factory.returnsListOption();
        LinkedList<ICommand> cmds = factory.returnsCommands();
        cli(listOptions, console);
        cli(cmds, console);
    }

    public static void setIfSingleList(boolean ifSingleList) {
        IfSingleList = ifSingleList;
    }

    public static boolean getIfSingleList() {
        return IfSingleList;
    }

    public static void setExitSubMenu(boolean exitSubMenu) {
        App.exitSubMenu = exitSubMenu;
    }

    private static void cli(LinkedList<ICommand> cmds, IConsole console) {
        App.setExitSubMenu(false);
        do {
            printCommandLineMenu(cmds);
            ICommand cmd = selectAnOption(cmds, console);
            cmd.execute();
        } while (!App.exitSubMenu);
    }

    private static ICommand selectAnOption(LinkedList<ICommand> cmds, IConsole console) {
        do {
            int selectedOption = console.readInteger("Please enter an option: ");
            if (isValidOption(selectedOption, 0, cmds.size())) {
                return cmds.get(selectedOption);
            }
        } while (true);
    }

    private static boolean isValidOption(int index, int min, int max) {
        return index >= min && index < max;
    }

    private static void printCommandLineMenu(LinkedList<ICommand> cmds) {
        System.out.println("Console-Application: Exercise-2               <Mohamed Neji> <Ghazouani> <579181>\n");
        for (int i = 1; i < cmds.size(); i++) {
            System.out.println(i + ". " + cmds.get(i));
        }
        System.out.println("\n0. " + cmds.get(0) + "\n");
    }
}



