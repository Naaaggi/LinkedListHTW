package Exercise2.sorting;

import Exercise2.lists.IListable;

import java.util.List;

public interface Sortable<T> {
    public void sort(IListable<T> list, Comparator<T> comp);
}