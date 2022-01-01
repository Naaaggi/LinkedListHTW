package Exercise2.lists;

public interface IListable<T> {
    void add(T data);
    void addLast(T data);
    void addFirst(T data);
    void insert(int index, T data);
    void set(int index, T data);
    void remove(int index);
    void clear();
    T get(int index);
    int size();
    boolean isEmpty();
    void print();
}



