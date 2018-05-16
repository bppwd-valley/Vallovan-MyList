package mylist;

public class Node<T> {
    
    private T value;
    protected Node next;
    
    public Node(T newVal, Node nextV){
        value = newVal;
        next = nextV;
    }
    
    public void setValue(T input){
        value = input;
    }
    
    public T getValue(){
        return value;
    } 
}
