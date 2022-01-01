package Exercise2.commands;

import Exercise2.commands.impl.*;
import Exercise2.console.IConsole;
import Exercise2.data.Student;
import Exercise2.lists.DoublyLinkedList;
import Exercise2.lists.IListable;
import Exercise2.lists.SinglyLinkedList;


import java.util.LinkedList;

public class CommandFactory {

    final private IConsole console;
    IListable<Student> SingleList = new SinglyLinkedList<>();
    IListable<Student> DoubleList = new DoublyLinkedList<>();

    public CommandFactory(IConsole console, IListable<Student> list) {
        super();
        this.console = console;
        this.DoubleList = list;
    }
    public LinkedList<ICommand> returnsCommands() {
        LinkedList<ICommand> cmds = new LinkedList<ICommand>();
        cmds.add(new ExitProgramCmd());
        cmds.add(new AddLastCmd(console, SingleList, DoubleList));
        cmds.add(new InsertStudentAtPositionCMD(console, SingleList, DoubleList));
        cmds.add(new InsertStudentAtBeginningCMD(console, SingleList, DoubleList));
        cmds.add(new AppendListCMD(console, SingleList, DoubleList));
        cmds.add(new ReturnsStudentatPosition(console, SingleList, DoubleList));
        cmds.add(new PrintAllStudentsCMD(SingleList, DoubleList));
        cmds.add(new ReturnNumberCMD(SingleList, DoubleList));
        cmds.add(new RemoveFromPositionCMD(console, SingleList, DoubleList));
        cmds.add(new RemoveAllCMD(console, SingleList, DoubleList));
        cmds.add(new SearchCMD(console, SingleList, DoubleList));
        cmds.add(new SortCMD(console, SingleList, DoubleList));

        return cmds;
    }
    public LinkedList<ICommand> returnsListOption() {
        LinkedList<ICommand> cmds = new LinkedList<ICommand>();

        cmds.add(new ExitProgramCmd());
        cmds.add(new SinglelistOption(console));
        cmds.add(new DoublylistOption());

        return cmds;
    }


}