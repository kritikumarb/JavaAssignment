
// Write a program to find summation, subtraction and multiplication of two 3X4 matrices?
import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        System.out.println("Enter First Matrix (3*4) : ");

        int[][] arr1 = new int[3][4];
        int[][] arr2 = new int[3][4];
        int[][] sum = new int[3][4];
        int[][] sub = new int[3][4];
        int[][] mul = new int[3][4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Second Matrix (3*4) : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println(" First Matrix is : ");
        printMatrix(arr1);
        System.out.println(" Second Matrix is : ");
        printMatrix(arr2);
        matrixSum(arr1, arr2, sum);
        matrixSub(arr1, arr2, sub);
        matrixMul(arr1, arr2, mul);
    }

    public static void matrixMul(int[][] a , int[][] b , int[][] c){
        System.out.println("Matrix Multiplication is : ");
        for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
                c[i][j]=0;      
                for(int k=0;k<3;k++){ 
                    c[i][j]+=a[i][k]*b[k][j];   
                }
            }    
        }
        printMatrix(c);
    }

    public static void matrixSum(int[][] arr1, int[][] arr2, int[][] sum) {
        System.out.println("Addition Of Matrix is : ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        printMatrix(sum);
    }

    public static void matrixSub(int[][] arr1, int[][] arr2, int[][] sub) {
        System.out.println("Subtraction Of Matrix is : ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                sub[i][j] = arr1[i][j] - arr2[i][j];
            }
        }
        printMatrix(sub);
    }

    public static void printMatrix(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
