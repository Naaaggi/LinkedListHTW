package Exercise2.commands.impl;

import Exercise2.App;
import Exercise2.commands.ICommand;
import Exercise2.console.IConsole;
import Exercise2.data.Student;
import Exercise2.lists.IListable;

public class RemoveFromPositionCMD implements ICommand {
    final private IConsole console;
    private final IListable<Student> SingleList;
    private final IListable<Student> DoubleList;

    public RemoveFromPositionCMD(IConsole console, IListable<Student> singleList, IListable<Student> doubleList) {
        this.console = console;
        this.SingleList = singleList;
        this.DoubleList = doubleList;
    }
    @Override
    public void execute() {
        int i = console.readInteger("Please enter the index: ");
        if(App.getIfSingleList())
            SingleList.remove(i);
        else
            DoubleList.remove(i);
        System.out.println("The student at the index " + i + " got removed from the list.");
        System.out.println("The new list is: ");

        if(App.getIfSingleList())
            SingleList.print();
        else
            DoubleList.print();

    }


    @Override
    public String toString() {
        return "Removes the Student at the specified position in this list.";}
}
