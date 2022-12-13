// Write a program to find average and also find total no. of odd, even, prime and palindrome
// number available in an array of 30 user defined numbers?
import java.util.Scanner;
public class P1 {   
    public static void main(String[] args) {
        int[] arr = new int[30];
        System.out.println("Enter 30 elements : ");
        
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Average : "+findAverage(arr));
        System.out.println("Odd : "+oddCount(arr));
        System.out.println("Even : "+ evenCount(arr));
        System.out.println("Prime : "+primeCount(arr));
        System.out.println("Palindrome : "+palindromeCount(arr));
    }
    public static int primeCount(int[] arr){
        int c=0;
        for(int i:arr){
            if(isPrime(i)){
                c++;
            }
        }
        return c;
    }
    public static boolean isPrime(int num){
        boolean c = true;
        for(int i=2;i<num;i++){
            if(num%i == 0){
                c=false;
                break;
            }
        }
        return c;
    }
    public static int palindromeCount(int[] arr){
        int c=0;
        for(int i: arr){
            if(isPalindrome(i)){
                c++;
            }
        }
        return c;
    }
    public static boolean isPalindrome(int num){
        int num1 = num;
        int num2 = 0;
        while(num > 0){
            num2 = num%10;
            num = num/10;
        }
        return num1==num2;
    }
    public static int oddCount(int[] arr){
        int c = 0;
        for(int i: arr){
            if(i%2==1){
                c++;
            }
        }
        return c;
    }
    public static int evenCount(int[] arr){
        int c = 0;
        for(int i: arr){
            if(i%2==0){
                c++;
            }
        }
        return c;
    }
    public static double findAverage(int[] arr){
        int sum = 0;
        for(int i: arr){
            sum += i;
        }
        return sum/arr.length;
    }
}
