import java.util.*;
public class pract
{ 
    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next= null;
        }
    }
    Node head;
    // add- first , last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode; 
    }

    // add last

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;

    }

    public void printlist(){
        Node currNode = head;
     while(currNode.next != null){
        System.out.print(currNode.data);
            currNode = currNode.next;
        }   
        System.out.println("Null");
    }
    public static void main(String args[]){
        pract list = new pract();
        //
        list.addFirst("b");
        list.addFirst("       a                ->");

        list.printlist();

    }
    
}