// Write a program to sort 10 numbers in the array using following sorting algorithm and method
// overloading?
// a) merge sort
// b) quick sort
// c) heap sort

import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {
        int[] arr = {9 , 8 ,7,6,5,4,3,2,1 , 10};
        int[] arr2 = {9 , 8 ,7,6,5,4,3,2,1 , 10};
        int[] arr3 = {9 , 8 ,7,6,5,4,3,2,1 , 10};
        Sort s = new Sort(arr, "mergesort");
        Sort s1 = new Sort(arr2, "quicksort");
        Sort s2 = new Sort(arr3, "heapsort");

    }
    public void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
