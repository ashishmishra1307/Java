import java.util.*;

public class DeletionLL{

public static class LL {
    private Node head;
    private Node tail;
    public int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
    
        size++;
    }

    public void display(){
        
        Node temp = new node(int value);

        wh
    }

}

private static class Node{ 
    private int value;
    private Node next;

    public Node(int value){
        this.value=value;
    }

    public Node(int value,Node next){
        this.value=value;
        this.next=next;
    }
}


public static void main(String args[]) {
    LL list = new LL();

    list.insertFirst(6);
    list.insertFirst(45);

    
}

}