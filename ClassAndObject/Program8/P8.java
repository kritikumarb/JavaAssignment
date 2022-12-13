// Write a program to search for a user defined number in array of 20 numbers using linear search
// and binary search using class and object? Allow user to choose searching method.
import java.util.Scanner;
public class P8 {
    
    public static void main(String[] args) {
        int[] arr = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 numbers : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be searched");
        int num = sc.nextInt();
        System.out.println("Enter 1 for linear search and 2 for binary search");
        int choice = sc.nextInt();
        
        SearchByUser s = new SearchByUser(arr, num);
        if(choice == 1){
            s.linearSearch();
        }else{
            s.binarySearch();
        }
    }
}

