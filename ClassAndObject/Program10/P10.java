// Write a program to implement queue and perform following using class and object?

// a) create an queue of size 10 using array
// b) insert 10 elements into queue using insert method
// c) replace even numbers available in queue with nearest prime numbers

// d) display number of odd and prime numbers.
// e) delete 3 elements from queue using delete method
// f) display remaining element of queue.
public class P10 {
    public static void main(String[] args) {
        Queue obj = new Queue();
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(5);
        obj.insert(6);
        obj.insert(7);
        obj.insert(8);
        obj.insert(9);
        obj.insert(10);
        obj.display();
        obj.replaceEvenWithPrime();
        obj.display();
        obj.displayOddAndPrime();
        obj.delete();
        obj.delete();
        obj.delete();
        obj.display(); 
    }   
}
