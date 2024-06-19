import java.util.*;

public class HA1 {
    public static boolean checkArithmetic(int a, int b, int c){
        if (a + b == c){
            return true;
        } else if(a == b - c){
            return true;
        } else if (a * b == c){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (checkArithmetic(a,b,c)){
            System.out.println("The three integers can be used in a correct arithmetic formula");
        } else {
            System.out.println("The three integers cannot be used in a correct arithmetic formula");
        }
        sc.close();
    }
}
