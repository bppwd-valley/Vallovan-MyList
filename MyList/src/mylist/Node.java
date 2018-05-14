package mylist;

public class Node {
    
    private String value;
    private Node next;
    
    public Node(){
        value = null;
    }
    
    public Node(String newValue){
        value = newValue;
        next = new Node();
    }
    
    public String getValue(){
        return value;
    }
    
}
