// Write a program to check whether a number or string is palindrome or not using method
// overloading?
public class P6 {
    public static boolean isPalindrome(String str){
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        if(str.equals(rev)){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isPalindrome(int num){
        int rev = 0;
        int temp = num;
        while(temp!=0){
            int rem = temp%10;
            rev = rev*10 + rem;
            temp = temp/10;
        }
        if(num==rev){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome(12321));
    }
}
