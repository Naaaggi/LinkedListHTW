package Exercise2.lists;


public class DoublyLinkedList<T> implements IListable<T> {

    private Node head = null;
    private Node tail = null;

    private class Node {
        T data;
        Node next;
        Node prev;
    }



    @Override
    public int size() {
        int counter = 0;
        Node temp = head;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }
        return counter;
    }

    @Override
    public boolean isEmpty() {
        return this.head == null && this.tail == null;
    }
    @Override
    public void add(T data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.prev = null;

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;
        }
    }
    @Override
    public void addFirst(T data) {
        Node node = new Node();
        node.data = data;
        node.prev = null;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            head = node;
            head.next = temp;
            temp.prev = head;
        }
    }
    @Override
    public void addLast(T data) {
        this.add(data);
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
            node.prev = prev;
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
            head.next = temp;
            head.prev = null;
            return;
        }
        Node prev = head;
        for (int i = 0; i < index-1; i++) {
            prev = prev.next;
        }
        if(prev.next.next == null){
            prev.next = node;
            node.prev = prev;
        }
        else{
            temp = prev.next.next;
            prev.next = node;
            node.next = temp;
            temp.prev = node;
        }
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
    public void remove(int index) {
        if ((head == null) || (index < 0) || (index >= size())) {
            return;
        }
        Node prev = head;
        for (int i = 0; i < index-1; i++) {
            prev = prev.next;
        }
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next.prev = prev;
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
    public void clear() {
        this.head = null;
        this.tail = null;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("List: " + System.lineSeparator());

        for(Node temp = this.head; temp != null; temp = temp.next) {
            builder.append(" " + temp.data + System.lineSeparator());
        }

        return builder.toString();
    }

}
