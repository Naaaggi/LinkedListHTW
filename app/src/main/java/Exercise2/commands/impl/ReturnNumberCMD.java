package Exercise2.commands.impl;

import Exercise2.App;
import Exercise2.commands.ICommand;
import Exercise2.console.IConsole;
import Exercise2.data.Student;
import Exercise2.lists.IListable;

public class ReturnNumberCMD implements ICommand {
    private final IListable<Student> SingleList;
    private final IListable<Student> DoubleList;

    public ReturnNumberCMD(IListable<Student> singleList, IListable<Student> doubleList) {
        this.SingleList = singleList;
        this.DoubleList = doubleList;
    }

    @Override
    public void execute() {
        if(App.getIfSingleList())
            System.out.println("The list contains " + SingleList.size() + " elements.");
        else
            System.out.println("The list contains " + DoubleList.size() + " elements.");
    }

    @Override
    public String toString() {
        return "Returns the number of Students in this list.";}
}