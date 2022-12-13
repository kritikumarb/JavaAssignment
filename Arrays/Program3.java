// 3) Write a program to sort 10 numbers in ascending order and find the sum of product of 2nd
// smallest and 3rd largest number?


import java.util.Arrays;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<10;i++){
            arr[i] = Integer.parseInt(sc.next());
            
        }
        
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[i]){
                    swap(arr , i , j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Product Of 2nd and 3rd "+ arr[1]*arr[7]);
    }
    public static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
}
