package Exercise2.lists;

public class SinglyLinkedList<T> implements IListable<T> {

    private Node head = null;

    private class Node {
        T data;
        Node next;
    }

    @Override
    public void add(T data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    @Override
    public void addFirst(T data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            head = node;
            head.next = temp;
        }
    }

    @Override
    public void addLast(T data) {
        add(data);
    }

    @Override
    public void insert(int index, T data) {
        Node node = new Node();
        node.data = data;
        Node temp = new Node();
        if (head == null) {
            head = node;
        } else {
            Node prev = head;
            for (int i = 0; i < index-1; i++) {
                prev = prev.next;
            }
            temp = prev.next;
            prev.next = node;
            node.next = temp;
        }
    }

    @Override
    public void set(int index, T data) {
        Node node = new Node();
        Node temp = new Node();
        node.data = data;
        if ((head == null) || (index == 0)) {
            temp = head.next;
            head = node;
            node.next = temp;
            return;
        }
        Node prev = head;
        for (int i = 0; i < index-1; i++) {
            prev = prev.next;
        }
        temp = prev.next.next;
        prev.next = node;
        node.next = temp;
    }

    @Override
    public void remove(int index) {
        if ((head == null) || (index < 0) || (index >= size())) {
            return;
        }
        Node prev = head;
        for (int i = 0; i < index-1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }

    @Override
    public T get(int index) {
        if ((head == null) || (index < 0) || (index >= size())) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    @Override
    public int size() {
        Node temp = head;
        int counter = 0;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }
        return counter;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("List:" + System.lineSeparator());
        Node temp = head;
        while (temp != null) {
            builder.append(" " + temp.data + System.lineSeparator());
            temp = temp.next;
        }
        return builder.toString();
    }

    @Override
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

}

