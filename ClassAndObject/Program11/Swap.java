// Write a program to swap two numbers without using 3rd variable and with using 3rd variable using class and object?
public class Swap {
    public void swapWithoutThirdVariable(int a, int b){
        System.out.println("Before swapping a = " + a + " and b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping a = " + a + " and b = " + b);
    }
    public void swapWithThirdVariable(int a, int b){
        System.out.println("Before swapping a = " + a + " and b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping a = " + a + " and b = " + b);
    }
}
