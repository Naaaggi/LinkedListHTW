package Exercise2.commands.impl;

import Exercise2.App;
import Exercise2.commands.ICommand;
import Exercise2.console.IConsole;
import Exercise2.comparator.CourseComparator;
import Exercise2.comparator.MatNumberComparator;
import Exercise2.data.Student;
import Exercise2.lists.IListable;
import Exercise2.sorting.BubbleSort;
import Exercise2.sorting.Comparator;
import Exercise2.sorting.SelectionSort;
import Exercise2.sorting.Sortable;

public class SortCMD implements ICommand {
    final private IConsole console;
    private final IListable<Student> SingleList;
    private final IListable<Student> DoubleList;
    boolean ifBubbleSort;
    boolean ifbyCourseSort;

    public SortCMD(IConsole console, IListable<Student> singleList, IListable<Student> doubleList) {
        this.console = console;
        this.SingleList = singleList;
        this.DoubleList = doubleList;
    }

    @Override
    public void execute() {
        while (true) {
            System.out.println("Select a sorting method for sorting:\n" +
                    " 1. Bubblesort?\n" +
                    " 2. Selectionsort?\n" +
                    "\n0. Exit\n");
            switch (console.readInteger("Please enter a number for an option:")) {
                case 1:
                    ifBubbleSort = true;
                    sortByCriteriaMenu();
                    break;
                case 2:
                    ifBubbleSort = false;
                    sortByCriteriaMenu();
                    break;
                case 0:
                    return;
            }
            break;
        }
    }

    public void sortByCriteriaMenu(){
        while (true) {
            System.out.println("Select a sorting method for sorting:\n" +
                    " 1. Sort by course?\n" +
                    " 2. Sort by matriculation number?\n" +
                    "\n0. Exit\n");
            switch (console.readInteger("Please enter a number for an option:")) {
                case 1:
                    ifbyCourseSort = true;
                    sort();
                    System.out.println("List sorted by course.");
                    if(App.getIfSingleList())
                        SingleList.print();
                    else
                        DoubleList.print();
                    break;
                case 2:
                    ifbyCourseSort = false;
                    sort();
                    System.out.println("List sorted by matriculation number.");
                    if(App.getIfSingleList())
                        SingleList.print();
                    else
                        DoubleList.print();
                    break;
                case 0:
                    return;
            }
            break;
        }
    }

    private void sort() {
        if(ifBubbleSort && App.getIfSingleList() && ifbyCourseSort)
            sort(new BubbleSort<>(), this.SingleList, new CourseComparator());
        if(ifBubbleSort && App.getIfSingleList()  && !ifbyCourseSort)
            sort(new BubbleSort<>(), this.SingleList, new MatNumberComparator());
        if(!ifBubbleSort && App.getIfSingleList() && ifbyCourseSort)
            sort(new SelectionSort<>(), this.SingleList, new CourseComparator());
        if(!ifBubbleSort && App.getIfSingleList() && !ifbyCourseSort)
            sort(new SelectionSort<>(), this.SingleList, new MatNumberComparator());
        if(ifBubbleSort && !App.getIfSingleList() && ifbyCourseSort)
            sort(new BubbleSort<>(), this.DoubleList, new CourseComparator());
        if(ifBubbleSort && !App.getIfSingleList() && !ifbyCourseSort)
            sort(new BubbleSort<>(), this.DoubleList, new MatNumberComparator());
        if(!ifBubbleSort && !App.getIfSingleList() && ifbyCourseSort)
            sort(new SelectionSort<>(), this.DoubleList, new CourseComparator());
        if(!ifBubbleSort && !App.getIfSingleList() && !ifbyCourseSort)
            sort(new SelectionSort<>(), this.DoubleList, new MatNumberComparator());
    }

    private static <T> void sort(Sortable<T> algorithm, IListable<T> list, Comparator<T> comp) {
        algorithm.sort(list, comp);
    }

    @Override
    public String toString(){
        return "Sort list by different properties.";
    }

}