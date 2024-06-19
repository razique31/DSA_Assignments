import java.util.Scanner;

public class HA3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        System.out.println("Enter the elements of array a: ");
        for (int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of array b: ");
        for (int i = 0; i<n; i++){
            b[i] = sc.nextInt();
        }
        for (int i = 0; i<n; i++){
            c[i] = a[i]*b[i];
            System.out.printf("c[%d] = %d%n",i,c[i]);
        }
        sc.close();
    }
}
