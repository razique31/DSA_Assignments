import java.util.*;
public class StackArray {
    public static final int MAX = 10;
    public static boolean isEmpty(int top){
        if(top == -1){
            return true;
        } 
        else{
            return false;
        }  
    }
    public static boolean isFull(int top){
        if(top == MAX-1){
            return true;
        } else {
            return false;
        }
    }
    public static int push(int arr[], int top, Scanner sc){
        if(isFull(top)){
            System.out.println("Overflow");
        } else {
            System.out.println("Enter data: ");
            int data = sc.nextInt();
            arr[++top] = data;
        }
        return top;
    }
    public static int pop(int arr[], int top){
        if(isEmpty(top)){
            System.out.println("Underflow");
        } else {
            System.out.println("Popped: "+arr[top--]);
        }
        return top;
    }
    public static void display(int arr[], int top){
        if(isEmpty(top)){
            System.out.println("Stack is Empty");
        } else {
            System.out.print("Stack Elements: ");
            for (int i = 0; i <= top; i++){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int stack[] = new int[MAX];
        int top = -1;
        System.out.println("**** MENU ****");
        System.out.println("0: Exit");
        System.out.println("1: Push");
        System.out.println("2: Pop");
        System.out.println("3: Display");
        while(true){
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    sc.close();
                    System.exit(0);
                    break;
                case 1: 
                    top = push(stack,top, sc);
                    break;
                case 2:
                    top = pop(stack,top);
                    break;
                case 3: 
                    display(stack,top);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
