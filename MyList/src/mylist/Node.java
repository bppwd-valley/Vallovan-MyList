package mylist;

public class Node {
    
    private String value;
    protected Node next;
    
    public Node(){
        value = null;
    }
    
    public Node(String newVal){
        value = newVal;
        next = new Node();
    }
    
    public void setValue(String input){
        value = input;
    }
    
    public String getValue(){
        return value;
    } 
}
