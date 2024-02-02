package in.mohammadasif2808.linkedlist;

/**
 *
 * @author mohammad asif
 * @Email: mohammadasif2808@gmail.com
 * @Date: Feb 2, 2024
 * @Time: 10:08:15 AM
 */
public class LinkedListPlayground {
    public static void main(String[] args) {
        LinkedList<Integer> n = new LinkedList<>();
        n.addNode(3);
        n.addNode(4);
        n.addNode(5);
        n.addNode(10);
        
        System.out.println("Printing "+ n.countNode() +" node of Linked List");
        n.traverseList();
        
        

        
    }
}
