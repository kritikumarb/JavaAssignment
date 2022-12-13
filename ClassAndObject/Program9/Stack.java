// Write a program to implement stack and perform following using class and object?

// a) create an stack of size 10 using array
// b) insert 10 elements into stack using push and isfull method
// c) find factorial of difference between largest and smallest
// element of stack
// d) search any user defined element in stack using peak method
// e) delete 3 elements from stack using pop and isempty method
// f) display remaining element of stack
public class Stack {
    int[] arr = new int[10];
    int top = -1;
    public void push(int num){
        if(isFull()){
            System.out.println("Stack is full");
        }else{
            top++;
            arr[top] = num;
        }
    }
    public void display(){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public void findFactorial(){
        int max = arr[0];
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int diff = max - min;
        int fact = 1;
        for(int i=1;i<=diff;i++){
            fact = fact * i;
        }
        System.out.println("Factorial of difference between largest and smallest element of stack is " + fact);
    }
    public boolean isFull(){
        if(top == arr.length-1){
            return true;
        }else{
            return false;
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            top--;
        }
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
    public void search(int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == num){
                System.out.println("Element found at index " + i);
            }
        }
    }
}
