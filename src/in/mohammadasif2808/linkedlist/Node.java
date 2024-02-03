package in.mohammadasif2808.linkedlist;

/**
 *
 * @author mohammad asif
 * @Email: mohammadasif2808@gmail.com
 * @Date: Jan 29, 2024
 * @Time: 1:54:49 PM
 */

/**
 * A single generic node in the linked list.
 *
 * @param <T> The actual data in each node in the linked list.
 */
public class Node<T extends Comparable<T>> {

    private T data;
    private Node<T> next;

    public Node(T data, Node<T> next) {
        this.data = data;
        setNext(null);
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
    
}
