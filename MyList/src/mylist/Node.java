package mylist;

public class Node {
    
    private String value;
    protected Node next;
    
    public Node(){
        value = null;
    }
    
    public Node(String newVal, Node nextV){
        value = newVal;
        next = nextV;
    }
    
    public void setValue(String input){
        value = input;
    }
    
    public String getValue(){
        return value;
    } 
}
