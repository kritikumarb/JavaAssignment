// Write a program to determinant and inverse of a 3X3 matrics?

public class Program6 {
    public static void main(String[] args) {
        int[][] arr = { { 1000, 2, 3 }, { 4, 5, 2 }, { 7, 8, 9 } };
        int[][] inverse = new int[3][3];
        int determinant = findMatrixDeterminant(arr);
        findMatrixInverse(arr, inverse, determinant);
    }

    public static int findMatrixDeterminant(int[][] arr) {
        int determinant = 0;
        for (int i = 0; i < arr.length; i++) {
            determinant = determinant + (arr[0][i]
                    * (arr[1][(i + 1) % 3] * arr[2][(i + 2) % 3] - arr[1][(i + 2) % 3] * arr[2][(i + 1) % 3]));
        }
        System.out.println("Determinant of the matrix is: " + determinant);
        return determinant;
    }

    public static void findMatrixInverse(int[][] arr , int[][] inverse , int det){
        System.out.println("\nInverse of matrix is:");
        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr[0].length; ++j){
                inverse[i][j] = arr[i][j]/det;
            }
        }
        for(int i = 0; i < inverse.length; ++i) {
            for(int j = 0; j < inverse[0].length; ++j){
                System.out.print(inverse[i][j] + " ");
            }
            System.out.println();
        }
    }
}
