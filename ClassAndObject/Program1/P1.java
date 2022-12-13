// 1.	Write a program to create simple calculator for addition, subtraction, division, multiplication,
// modulus, factorial, gcd, lcm, power, square root, cube root using class and object?
public class P1 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(1,2,3,4,5);
        c.findFactorial(5);
        c.findSqrt(25);
        c.findCbrt(27);
        c.findPower(2, 3);
        c.div(10, 2);
        c.modulus(10, 3);
        c.sub(10, 2, 3);
        c.mul(2, 3, 4);
        c.findGcd(10, 15);
        c.findLcm(10, 15);
        
    }
    
}
