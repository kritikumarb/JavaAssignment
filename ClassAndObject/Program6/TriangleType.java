// Write a program to display type of triangle using sides of triangle?
public class TriangleType {
    int a , b , c;
    public TriangleType(int a , int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void findType(){
        if(a == b && b == c){
            System.out.println("Equilateral Triangle");
        }else if(a == b || b == c || a == c){
            System.out.println("Isosceles Triangle");
        }else{
            System.out.println("Scalene Triangle");
        }
    }
    
}
