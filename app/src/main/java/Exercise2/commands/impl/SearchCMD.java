package Exercise2.commands.impl;

import Exercise2.App;
import Exercise2.commands.ICommand;
import Exercise2.console.IConsole;
import Exercise2.data.Student;
import Exercise2.lists.IListable;
import java.util.Scanner;


public class SearchCMD implements ICommand {
    private final IListable<Student> SingleList;
    private final IListable<Student> DoubleList;
    final private IConsole console;

    public SearchCMD(IConsole console, IListable<Student> singleList, IListable<Student> doubleList) {
        this.SingleList = singleList;
        this.DoubleList = doubleList;
        this.console = console;

    }

    @Override
    public void execute() {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Select a property to search for the student:\n" +
                    " 1. Search by prename?\n" +
                    " 2. Search by surname?\n" +
                    " 3. Search by course number?\n" +
                    " 4. Search by matriculation number?\n"+
                    "\n0. Exit\n");
            switch (console.readInteger("Please enter a number for an option: ")){
                case 1:
                    if(App.getIfSingleList())
                    {

                            System.out.print("Please enter the specified prename: ");
                            String a = scan.next();
                            int j=0;
                            for (int i = 0; i < this.SingleList.size(); i++) {
                        if (a.equals(this.SingleList.get(i).getPrename()))
                        {
                            j++;
                            System.out.println("Student no. " + (i + 1) + ", Prename : " +
                                    this.SingleList.get(i).getPrename() + ", Surname : " +
                                    this.SingleList.get(i).getSurname() + ", Course : " + this.SingleList.get(i).getCourse() +
                                    " Matriculation Number : " + this.SingleList.get(i).getMatriculationNumber());

                        } }
                        if (j==0)
                        {
                            System.out.println("No student with the given prename.");

                        }
                    }
                    else
                    {

                        System.out.print("Please enter the specified prename: ");
                        String a = scan.next();
                        int j=0;
                        for (int i = 0; i < this.DoubleList.size(); i++) {
                            if (a.equals(this.DoubleList.get(i).getPrename()))
                            {
                                j++;
                                System.out.println("Student no. " + (i + 1) + ", Prename : " +
                                        this.DoubleList.get(i).getPrename() + ", Surname : " +
                                        this.DoubleList.get(i).getSurname() + ", Course : " + this.DoubleList.get(i).getCourse() +
                                        " Matriculation Number : " + this.DoubleList.get(i).getMatriculationNumber());

                            } }
                        if (j==0)
                        {
                            System.out.println("No student with the given prename");

                        }
                    }
                    break;
                case 2:
                    if(App.getIfSingleList())
                    {

                        System.out.print("Please enter the specified surname: ");
                        String a = scan.next();
                        int j=0;
                        for (int i = 0; i < this.SingleList.size(); i++) {
                            if (a.equals(this.SingleList.get(i).getSurname()))
                            {
                                j++;
                                System.out.println("Student no. " + (i + 1) + ", Prename : " +
                                        this.SingleList.get(i).getPrename() + ", Surname : " +
                                        this.SingleList.get(i).getSurname() + ", Course : " + this.SingleList.get(i).getCourse() +
                                        " Matriculation Number : " + this.SingleList.get(i).getMatriculationNumber());

                            } }
                        if (j==0)
                        {
                            System.out.println("No student with the given surname.");

                        }
                    }
                    else
                    {

                        System.out.print("Please enter the specified surname: ");
                        String a = scan.next();
                        int j=0;
                        for (int i = 0; i < this.DoubleList.size(); i++) {
                            if (a.equals(this.DoubleList.get(i).getSurname()))
                            {
                                j++;
                                System.out.println("Student no. " + (i + 1) + ", Prename : " +
                                        this.DoubleList.get(i).getPrename() + ", Surname : " +
                                        this.DoubleList.get(i).getSurname() + ", Course : " + this.DoubleList.get(i).getCourse() +
                                        " Matriculation Number : " + this.DoubleList.get(i).getMatriculationNumber());

                            } }
                        if (j==0)
                        {
                            System.out.println("No student with the given surname.");

                        }
                    }
                    break;
                case 3:
                    if(App.getIfSingleList())
                    {

                        System.out.print("Please enter the specified course: ");
                        int a = scan.nextInt();
                        int j=0;
                        for (int i = 0; i < this.SingleList.size(); i++) {
                            if (a == (this.SingleList.get(i).getCourse()))
                            {
                                j++;
                                System.out.println("Student no. " + (i + 1) + ", Prename : " +
                                        this.SingleList.get(i).getPrename() + ", Surname : " +
                                        this.SingleList.get(i).getSurname() + ", Course : " + this.SingleList.get(i).getCourse() +
                                        " Matriculation Number : " + this.SingleList.get(i).getMatriculationNumber());

                            } }
                        if (j==0)
                        {
                            System.out.println("No student with the given course.");

                        }
                    }
                    else
                    {

                        System.out.print("Please enter the specified course: ");
                        int a = scan.nextInt();
                        int j=0;
                        for (int i = 0; i < this.DoubleList.size(); i++) {
                            if (a == (this.DoubleList.get(i).getCourse()))
                            {
                                j++;
                                System.out.println("Student no. " + (i + 1) + ", Prename : " +
                                        this.DoubleList.get(i).getPrename() + ", Surname : " +
                                        this.DoubleList.get(i).getSurname() + ", Course : " + this.DoubleList.get(i).getCourse() +
                                        " Matriculation Number : " + this.DoubleList.get(i).getMatriculationNumber());

                            } }
                        if (j==0)
                        {
                            System.out.println("No student with the given course.");

                        }
                    }
                    break;
                case 4:
                    if(App.getIfSingleList())
                    {

                        System.out.print("Please enter the specified matriculation number: ");
                        int a = scan.nextInt();
                        int j=0;
                        for (int i = 0; i < this.SingleList.size(); i++) {
                            if (a == (this.SingleList.get(i).getMatriculationNumber()))
                            {
                                j++;
                                System.out.println("Student no. " + (i + 1) + ", Prename : " +
                                        this.SingleList.get(i).getPrename() + ", Surname : " +
                                        this.SingleList.get(i).getSurname() + ", Course : " + this.SingleList.get(i).getCourse() +
                                        " Matriculation Number : " + this.SingleList.get(i).getMatriculationNumber());

                            } }
                        if (j==0)
                        {
                            System.out.println("No student with the given matriculation number.");

                        }
                    }
                    else
                    {

                        System.out.print("Please enter the specified matriculation number: ");
                        int a = scan.nextInt();
                        int j=0;
                        for (int i = 0; i < this.DoubleList.size(); i++) {
                            if (a == (this.DoubleList.get(i).getMatriculationNumber()))
                            {
                                j++;
                                System.out.println("Student no. " + (i + 1) + ", Prename : " +
                                        this.DoubleList.get(i).getPrename() + ", Surname : " +
                                        this.DoubleList.get(i).getSurname() + ", Course : " + this.DoubleList.get(i).getCourse() +
                                        " Matriculation Number : " + this.DoubleList.get(i).getMatriculationNumber());

                            } }
                        if (j==0)
                        {
                            System.out.println("No student with the given matriculation number.");

                        }
                    }
                    break;
                case 0:
                    return;
            }
            break;
        }
    }

    @Override
    public String toString() { return "Search for student(s) by different characteristics.";}
}