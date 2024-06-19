import java.util.Scanner;

public class HA5 {
    public static int rowWithMostOnesIndex(int[][] a){
        int rowIndex = -1;
        int maxOnesCount = 0;
        for (int i = 0; i<a.length; i++){
            int counter = 0;
            for(int j = 0; j<a[i].length; j++){
                if(a[i][j] == 1){
                    counter++;
                }
            }
            if(counter>maxOnesCount){
                maxOnesCount = counter;
                rowIndex = i;
            }
        }
        return rowIndex;
    }
    public static int columnWithMostOnesIndex(int[][] a){
        int columnIndex = -1;
        int maxOnesCount = 0;
        for (int j = 0; j<a[0].length; j++){
            int counter = 0;
            for(int i = 0; i<a.length; i++){
                if(a[i][j] == 1){
                    counter++;
                }
            }
            if(counter>maxOnesCount){
                maxOnesCount = counter;
                columnIndex = j;
            }
        }
        return columnIndex;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of array: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns of array: ");
        int columns = sc.nextInt();
        int[][] a = new int[rows][columns];

        System.out.println("Enter the elements of array a: ");
        for (int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                a[i][j] = (int)(Math.random()*2);
            }
        }
        for (int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("The largest row index: "+rowWithMostOnesIndex(a));
        System.out.println("The largest column index: "+columnWithMostOnesIndex(a));
        sc.close();
    }
}
