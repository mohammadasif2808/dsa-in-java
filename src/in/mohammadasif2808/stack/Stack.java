package in.mohammadasif2808.stack;

import in.mohammadasif2808.stack.exceptions.StackOverflowException;
import in.mohammadasif2808.stack.exceptions.StackUnderflowExceptions;

/**
 *
 * @author mohammad asif
 * @Email: mohammadasif2808@gmail.com
 * @Date: Feb 3, 2024
 * @Time: 9:05:52 AM
 */
public class Stack<T> {
    private static int MAX_SIZE = 40;
    
    private int size =0;
    
    private Element<T> top;
    
    public void push(T data) throws StackOverflowException{
        if (size == MAX_SIZE){
            throw new StackOverflowException();
        }
        
        Element ele = new Element(data, top);
        top = ele;
        size++;
    }
    
    public T pop() throws StackUnderflowExceptions {
        if (size ==0) {
            throw new StackUnderflowExceptions();
        }
        
        T data = top.getData();
        top = top.getNext();
        size--;
        
        return data;
    } 
    
    public T peek() throws StackUnderflowExceptions {
        if(size ==0) {
            throw new StackUnderflowExceptions();
        }
        
        return top.getData();
    }
}
