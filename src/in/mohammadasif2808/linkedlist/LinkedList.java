package in.mohammadasif2808.linkedlist;

/**
 *
 * @author mohammad asif
 * @Email: mohammadasif2808@gmail.com
 * @Date: Jan 29, 2024
 * @Time: 4:06:30 PM
 */

//A Linked List class holds the head of the linked list
//this can hold all the methods which operate on the list
public class LinkedList<T extends Comparable<T>> implements Cloneable {
    
    private Node<T> head = null;
    
    public LinkedList(){
        
    }
    
    //traverse Linked List O(N)
    public void traverseList(){
        if ( head == null) {
            System.out.println("List is empty");
        } else {
            Node<T> curr = head;
            while(curr !=null){
                System.out.print(curr.getData());
                if (curr.getNext() != null) { 
                System.out.print("-->"); 
                }
                curr = curr.getNext();
            }
        }
    }
    
    
    //count nodes in Linked List O(N)
    //The most efficient way of doing this is by holding a counter which you increment each time you add an element and
    //decrement each time you delete and element
    public int countNode(){
        if(head == null) {
            return 0;
        } else {
            Node<T> curr = head;
            int count =0;
            while(curr!=null) {
                curr = curr.getNext();
                count++;
            }
            return count;
        }
    }
    
    //insert at the beginning O(1)
    
    //insert at the end O(N)
    public void addNode(T data){
        if(head == null){
            head = new Node<T>(data);
        } else {
            Node<T> curr = head;
            while(curr.getNext() != null){
                curr= curr.getNext();
            }
            curr.setNext(new Node<T>(data));
        }
    }
    
    
    //delete a random element O(N)
    
}
