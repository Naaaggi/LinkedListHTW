package Exercise2.commands.impl;

import Exercise2.App;
import Exercise2.commands.ICommand;
import Exercise2.console.IConsole;
import Exercise2.data.Student;
import Exercise2.lists.IListable;

public class PrintAllStudentsCMD implements ICommand {

    private final IListable<Student> SingleList;
    private final IListable<Student> DoubleList;

    public PrintAllStudentsCMD(IListable<Student> singleList, IListable<Student> doubleList) {
        this.SingleList = singleList;
        this.DoubleList = doubleList;
    }

    @Override
    public void execute() {
        if(App.getIfSingleList())
            SingleList.print();
        else
            DoubleList.print();
    }

    @Override
    public String toString() {
        return "Print all students to console from list.";
    }
}