// Write a program to implement stack and perform following using class and object?

// a) create an stack of size 10 using array
// b) insert 10 elements into stack using push and isfull method
// c) find factorial of difference between largest and smallest
// element of stack
// d) search any user defined element in stack using peak method
// e) delete 3 elements from stack using pop and isempty method
// f) display remaining element of stack
public class P9 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.push(80);
        s.push(90);
        s.push(100);
        s.display();
        s.findFactorial();
        s.pop();
        s.pop();
        s.pop();
        s.display();
    }
}
