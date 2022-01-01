package Exercise2.commands.impl;

import Exercise2.App;
import Exercise2.commands.ICommand;
import Exercise2.console.IConsole;
import Exercise2.data.Student;
import Exercise2.lists.IListable;

public class AddLastCmd implements ICommand {
    final private IConsole console;
    private final IListable<Student> SingleList;
    private final IListable<Student> DoubleList;

    public AddLastCmd(IConsole console, IListable<Student> singleList, IListable<Student> doubleList) {
        this.console = console;
        this.SingleList = singleList;
        this.DoubleList = doubleList;
    }
    @Override
    public void execute() {
        String prename = console.readString("Please enter prename: ");
        String surname = console.readString("Please enter surname: ");
        int matriculationNumber = console.readInteger("Please enter course number: ");
        int course = console.readInteger("Please enter matriculation number: ");
        Student student = new Student(prename, surname, matriculationNumber, course);
        if(App.getIfSingleList())
            SingleList.addLast(student);
        else
            DoubleList.addLast(student);
        System.out.println("The Student " + prename + " got added to the list.");

    }

    @Override
    public String toString() {
        return "Add Student to the end of this list.";
    }
}