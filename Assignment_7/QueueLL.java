package Assignment_7;
class Node{
    int data;
    Node next;
    Node (int data){
        this.data = data;
        next = null;
    }
}
class Queue2{
    Node head = null;
    Node tail = null;
    int size = 0;

    boolean isEmpty(){
        return head == null && tail == null;
    }
    void enqueue(int data){
        Node newNode = new Node(data);
        if (isEmpty()){
            head = tail = newNode;
        } else {
        tail.next = newNode;
        tail = newNode;
    }
        size++;
    }
    void dequeue(){
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        } 
        
        int front = head.data;
        System.out.println("Removed item: "+front);
        if (head == tail){
            tail = null;
        }
        head = head.next;
        size--;
        return;
    }
    void display(){
        Node temp = head;
        if (isEmpty()){
            System.out.println("Queue is empty.");
            return;
        }
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class QueueLL {
    public static void main(String[] args){
        Queue2 q = new Queue2();
        q.display();
        System.out.println("Size: "+q.size);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.display();
        System.out.println("Size: "+q.size);
        q.dequeue();
        System.out.println("Size: "+q.size);
        q.display();
    }
}
