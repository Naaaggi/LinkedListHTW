package Exercise2.comparator;

import Exercise2.data.*;
import Exercise2.sorting.Comparator;

public class CourseComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getCourse() - o2.getCourse();
    }

}