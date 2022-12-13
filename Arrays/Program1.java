//1) Write a program to find average and also find total no. of odd, even, prime and palindrome
//number available in an array of 30 user defined numbers?

import java.util.Scanner;

class Program1{
    public static void main(String[] args) {
        int evenCount=0 , oddCount=0 , primeCount=0 , palindromeCount=0 ,sum=0;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[30];
        for(int i=0;i<30;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(arr[i]%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
            if(isPrime(arr[i])){
                primeCount++;
            }
            if(isPalindrome(arr[i])){
                palindromeCount++;
            }
        }
        System.out.println("Average : "+sum/30);
        System.out.println("Even : "+evenCount);
        System.out.println("Odd : "+oddCount);
        System.out.println("Prime : "+primeCount);
        System.out.println("Palindrome : "+palindromeCount);


    }

    public static boolean isPrime(int a){
        for(int i=2;i<a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(int a){
        int temp = a;
        int x = 0;
        while(a>0){
            x = (x*10)+(a%10);
            a = a/10;
        }
        if(temp == x){
            return true;
        }
        return false;
    }
}