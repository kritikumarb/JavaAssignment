// Write a program to find area and perimeter of triangle having 3 sides using class and object?
public class Triangle {
    int a , b , c;
    public Triangle(int a , int b  , int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void findArea(){
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area: " + area);
    }
    public void findPerimeter(){
        int perimeter = a + b + c;
        System.out.println("Perimeter: " + perimeter);
    }
}
