import java.util.*;

public class SumOfColumn {
    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for(int i = 0; i<m.length; i++){
            sum += m[i][columnIndex];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int column = sc.nextInt();
        double[][] m = new double [row][column];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<row; i++){
            for (int j = 0; j<column; j++){
                m[i][j] = sc.nextDouble();
            }
        }
        for (int j = 0; j<column; j++){
            double sum = sumColumn(m,j);
            System.out.printf("Sum of the elements at column %d is %s %n",j,sum);
        }
        sc.close();
    }
}
