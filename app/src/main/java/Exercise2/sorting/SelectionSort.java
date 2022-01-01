package Exercise2.sorting;

import Exercise2.lists.IListable;

import java.util.List;

public class SelectionSort<T> extends Exercise2.sorting.Swap<T> implements Exercise2.sorting.Sortable<T> {

    @Override
    public void sort(IListable<T> list, Exercise2.sorting.Comparator<T> comp) {
        int minimum = 0;
        for (int i = 0; i < list.size(); i++) {
            minimum = i;
            for (int e = i + 1; e < list.size(); e++) {
                if (comp.compare(list.get(e), list.get(minimum)) < 0) {
                    minimum = e;
                }
            }
            swap(list, i, minimum);
        }
    }

}