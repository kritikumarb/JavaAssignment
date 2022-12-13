
import java.util.Scanner;
// Write a program to find area and perimeter of circle,square,rectangle and triangle using method
// overloading?
public class findAreaPeri {
    private int length;
    private int breadth;
    private int radius;
    private int side;
    private int base;
    private int height;
    private int area;
    private int perimeter;
    private double pi = 3.14;
    Scanner sc = new Scanner(System.in);
    
    public void findAreaPeri(int length, int breadth) {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
        System.out.println("Area of the rectangle is " + area);
        System.out.println("Perimeter of the rectangle is " + perimeter);
    }
    public void findAreaPeri(int radius , double pi) {
        area = (int) (pi * radius * radius);
        perimeter = (int) (2 * pi * radius);
        System.out.println("Area of the circle is " + area);
        System.out.println("Perimeter of the circle is " + perimeter);
    }
    public void findAreaPeri(int side, int base, int height) {
        area = (int) (0.5 * base * height);
        perimeter = side + base + height;
        System.out.println("Area of the triangle is " + area);
        System.out.println("Perimeter of the triangle is " + perimeter);
    }
    public void findAreaPeri(int side) {
        area = side * side;
        perimeter = 4 * side;
        System.out.println("Area of the square is " + area);
        System.out.println("Perimeter of the square is " + perimeter);
    }
    

}
