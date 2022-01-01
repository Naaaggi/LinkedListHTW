package Exercise2.commands.impl;

import Exercise2.App;
import Exercise2.commands.ICommand;
import Exercise2.console.IConsole;
import Exercise2.data.Student;
import Exercise2.lists.IListable;

public class RemoveAllCMD implements ICommand {
    final private IConsole console;
    private final IListable<Student> SingleList;
    private final IListable<Student> DoubleList;

    public RemoveAllCMD(IConsole console, IListable<Student> singleList, IListable<Student> doubleList) {
        this.console = console;
        this.SingleList = singleList;
        this.DoubleList = doubleList;
    }
    @Override
    public void execute() {
        if(App.getIfSingleList())
            SingleList.clear();
        else
            DoubleList.clear();
        System.out.println("Removed all the students from the list. The list is now clear.");

    }


    @Override
    public String toString() {
        return "Removes all of the Students from this list.";}

}