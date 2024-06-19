import java.util.Scanner;

public class HA2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        System.out.println("Enter your lines: ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextLine();
        }
        System.out.println("After reversing the lines are: ");
        for (int j = n-1; j>=0; j--){
            System.out.println(arr[j]);
        }
        sc.close();
    }
}
