
// Write a program to give information about any number such as whether it is even odd, prime or
// not prime, or positive or negative, palindrome or not using class and object?
public class FindNumberInfo {
    public FindNumberInfo(int n){
        System.out.println("Number: " + n);
        isEven(n);
        isPositive(n);
        isPalindrome(n);
        isPrime(n);
        System.out.println("================================");
    }
    public void isEven(int n){
        if(n % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public void isPositive(int n){
        if(n > 0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
    }
    public void isPalindrome(int n){
        int temp = n;
        int rev = 0;
        while(temp != 0){
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        if(rev == n){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    public void isPrime(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }

}
