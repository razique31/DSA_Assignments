package Assignment_7;
import java.util.*;
class Queue{
    int rear = -1;
    int front = -1;
    int size = 0;
    int arr[];
    Queue(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        arr = new int[n];
        sc.close();
    }
    boolean isEmpty(){
        return size == 0;
    }
    boolean isFull(){
        return size == arr.length;
    }
    void enqueue(int item){
        if (size == arr.length){
            System.out.println("Queue is full");
            return;
        }
        if (front == -1){
            front = rear = 0;
            arr[rear] = item;
        } else {
            arr[++rear] = item;
        }
        size++;
    }
    void dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return;
        } else {
            int temp = arr[front];
            System.out.println("Item removed: "+temp);
            front++;
            size--;
        }
    }
    void display(){
        if (isEmpty()){
            System.out.println("Queue is Empty.");
            return;
        } else {
            for (int i = front; i <= rear; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

public class QueueArray {
    public static void main(String[] args){
        Queue q = new Queue();
        System.out.println("size: "+q.size);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.display();
        System.out.println("size: "+q.size);
        q.dequeue();
        q.display();
        System.out.println("size: "+q.size);
    }
}
