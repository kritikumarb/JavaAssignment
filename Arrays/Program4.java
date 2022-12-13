// 4) Write a program to sort 10 numbers in descending order and average of 3rd largest and 4th
// smallest number in an array of 10 user defined numbers?

import java.util.Arrays;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<10;i++){
            arr[i] = Integer.parseInt(sc.next());
            
        }
        
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                if(arr[j] > arr[i]){
                    swap(arr , i , j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum Of 2nd and 3rd ");
    }
    public static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
}
