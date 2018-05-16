package mylist;

public class MyList {
    
    Node head;
    
    public MyList() {
        head = null;
    }
    
    public void addLast(String value){
        if (head == null){
            head = new Node(value, null);
        }
        else {
            Node tmp = head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = new Node(value, null);
        }
    }
    
    public void print(){
        Node tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
            System.out.println(tmp.getValue());
        }
    }
    
    public void insertAt(int index, String newVal){
        Node tmp = head;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        tmp.next = new Node(newVal, tmp.next);
    }
    
    public void insertAfter(String target, String newVal){
        Node tmp = head;
        while(!tmp.getValue().equals(target)){
            tmp = tmp.next;
        }
        tmp.next = new Node(newVal, tmp.next);
    }
    
    public void insertBefore(String target, String newVal){
        Node tmp = head;
        while(!tmp.next.getValue().equals(target)){
            tmp = tmp.next;
        }
        tmp.next = new Node(newVal, tmp.next);
    }
    
    public void remove(int index){
        Node tmp = head;
        for(int i = 0; i <index; i++){
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;
    }
    
    public void addFirst(String value){
        Node tmp = head;
        tmp.next = new Node(value, tmp.next);
    }
    
    public String get(int index){
        Node tmp = head;
        for(int i = 0; i <index+1; i++){
            tmp = tmp.next;
        }
        return tmp.getValue();
    } 
    
    public String getFirst(){
        Node tmp = head;
        tmp = tmp.next;
        if (head == null){
            return "List is empty";
        }
        return tmp.getValue();
    }
    
    public String getLast(){
        Node tmp = head;
        tmp = tmp.next;
        if (head == null){
            return "List is empty";
        }
        while(tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.getValue();
    }
    
    public boolean contains(String target){
        Node tmp = head;
        while(tmp.next != null){
            if(tmp.getValue().equals(target)){
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }
    
    @Override
    public String toString(){
        Node tmp = head;
        String toS = "{ ";
        while(tmp != null){
            if(tmp.next != null)
                toS += tmp.getValue() + ", ";
            else
                toS += tmp.getValue();
            tmp = tmp.next;
        }
        return toS + " }";
    }
}
