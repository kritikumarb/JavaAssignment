
import java.util.Scanner;
// Write a program to find area and perimeter of circle,square,rectangle and triangle using method
// overloading?
public class P1 {
    public static void main(String[] args) {

        findAreaPeri obj = new findAreaPeri();
        obj.findAreaPeri(5, 6);
        obj.findAreaPeri(5, 3.14);
        obj.findAreaPeri(5, 6, 7);
        obj.findAreaPeri(5);

    }
}
