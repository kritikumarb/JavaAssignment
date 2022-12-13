// Write a program to find transpose of a 3X4 matrics?
import java.util.Scanner;
public class Program7 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        int row = arr.length;
        int column = arr[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        findMatrixTranspose(arr,row,column);

    }
    public static void findMatrixTranspose(int[][] matrix, int row, int column){
        int[][] transpose = new int[column][row];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length ; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
