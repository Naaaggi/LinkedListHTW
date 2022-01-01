package Exercise2.commands.impl;

import Exercise2.App;
import Exercise2.commands.ICommand;
import Exercise2.console.IConsole;
import Exercise2.data.Student;
import Exercise2.lists.IListable;

public class InsertStudentAtPositionCMD implements ICommand {
    final private IConsole console;
    private final IListable<Student> SingleList;
    private final IListable<Student> DoubleList;

    public InsertStudentAtPositionCMD(IConsole console, IListable<Student> singleList, IListable<Student> doubleList) {
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
        int i = console.readInteger("Please enter the index: ");
        if(i==0) {
            if (App.getIfSingleList())
                SingleList.addFirst(student);

            else
                DoubleList.addFirst(student);
        } else {
        if(App.getIfSingleList())
            SingleList.insert(i, student);
        else
            DoubleList.insert(i, student);
    }
        System.out.println("Student added at the index " + i +" .");

    }

    @Override
    public String toString() {
        return "Inserts the Student at the specified position in this list.";
    }
}