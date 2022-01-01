package Exercise2.commands.impl;

import Exercise2.App;
import Exercise2.commands.ICommand;
import Exercise2.console.IConsole;
import Exercise2.data.Student;
import Exercise2.lists.IListable;

public class ReturnsStudentatPosition implements ICommand {
    final private IConsole console;
    private final IListable<Student> SingleList;
    private final IListable<Student> DoubleList;

    public ReturnsStudentatPosition(IConsole console, IListable<Student> singleList, IListable<Student> doubleList) {
        this.console = console;
        this.SingleList = singleList;
        this.DoubleList = doubleList;
    }
    @Override
    public void execute() {
        if(App.getIfSingleList())
            System.out.println(SingleList.get(console.readInteger("Please enter the index: ")));
        else
            System.out.println(DoubleList.get(console.readInteger("Please enter the index: ")));
    }

    @Override
    public String toString() {
        return "Returns the Student at the specified position in this list.";
    }
}