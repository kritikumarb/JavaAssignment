// Write a program to find area and perimeter of rectangle using class and object?
public class Rectangle {
    int length;
    int breadth;
    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public void findArea(){
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
    public void findPerimeter(){
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter: " + perimeter);
    }
    
}
