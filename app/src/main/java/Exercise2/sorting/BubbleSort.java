package Exercise2.sorting;

import Exercise2.lists.IListable;

import java.util.List;

public class BubbleSort<T> extends Exercise2.sorting.Swap<T> implements Exercise2.sorting.Sortable<T> {

    @Override
    public void sort(IListable<T> list, Comparator<T> comp) {
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i; j++) {
                if (comp.compare(list.get(j), list.get(j + 1)) > 0) {
                    swap(list, j, j + 1);
                }
            }
        }
    }
}