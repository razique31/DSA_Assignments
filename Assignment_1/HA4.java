import java.util.Scanner;

public class HA4 {
    public static double[][] addMatrix(double[][] a, double[][] b){
        int rows = a.length;
        int columns = a[0].length;
        double[][] result = new double[rows][columns];
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<b.length; j++){
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of array: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns of array: ");
        int columns = sc.nextInt();
        double[][] a = new double[rows][columns];
        double[][] b = new double[rows][columns];
        double[][] result;

        System.out.println("Enter the elements of array a: ");
        for (int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                a[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Enter the elements of array b: ");
        for (int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                b[i][j] = sc.nextDouble();
            }
        }
        System.out.println("The result is: ");
        result = addMatrix(a,b);
        for (int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
