public class Singlylinked {
public static class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size =0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null ){
            tail = head;
        }

        size += 1;
    }
// insertion at last 

        public void insertLat(int val){
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size++;

        }

        // insert at any place 

        public void insertval(int val,int index){
            Node temp = head;
            for(int i=1;i<index;i++){
                temp = temp.next;
            }
            Node node = new Node(val,temp.next);
            temp.next = node;
            size++;
        }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
    } 
 }

    private  static class Node {
        private int value;
        private Node next;

       public Node(int value){
        this.value=value;
       } 

       public Node(int value,Node next){
        this.value=value;
        this.next = next;
       } 

    }
   

    public static void main(String args[]){
            LL list = new LL();
            list.insertFirst(2);
            list.insertFirst(5);
            list.insertFirst(1);

            list.insertLat(45);
            list.insertLat(23);

            list.display();
         

    }


      }