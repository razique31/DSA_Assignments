import java.util.*;
public class MaxMin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        int maxOccur = 1;
        int minOccur = 1;
        int maxPosition = 0;
        int minPosition = 0;

        for (int  i = 1; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
                maxOccur = 1;
                maxPosition = i;
            } else if (arr[i] == max) {
                maxOccur++;
            }
            if(arr[i] < min){
                min = arr[i];
                minOccur = 1;
                minPosition = i;
            } else if (arr[i] == min){
                minOccur++;
                minPosition = i;
            }
        }
        System.out.printf("Maximum element of Array is %d and occurs %d times.", max,maxOccur);
        System.out.printf("%nMinimum element of Array is %d and occurs %d times.", min,minOccur);
        System.out.printf("%nFirst occurrence of maximum element is at position %d.",maxPosition);
        System.out.printf("%nLast occurrence of minimum element is at position %d.",minPosition);
        sc.close();
    }
}
