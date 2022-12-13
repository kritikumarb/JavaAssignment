// 1.	Write a program to create simple calculator for addition, subtraction, division, multiplication,
// modulus, factorial, gcd, lcm, power, square root, cube root using class and object?
public class Calculator {

    public void add(int...num){
        int sum = 0;
        for(int i: num){
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
    public void findFactorial(int num1){
        int fact = 1;
        for(int i = 1; i <= num1; i++){
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }
    public void findSqrt(int num1){
        double sqrt = Math.sqrt(num1);
        System.out.println("Square Root: " + sqrt);
    }
    public void findCbrt(int num1){
        double cbrt = Math.cbrt(num1);
        System.out.println("Cube Root: " + cbrt);
    }
    public void findPower(int num1 , int n){
        int power = 1;
        for(int i = 1; i <= n; i++){
            power *= num1;
        }
        System.out.println("Power: " + power);
    }
    public void div(int num1 , int num2){
        int div = num1 / num2;
        System.out.println("Division: " + div);
    }
    public void modulus(int num1 , int num2){
        int mod = num1 % num2;
        System.out.println("Modulus: " + mod);
    }
    public void sub (int...num){
        int diff = num[0];
        for(int i = 1; i < num.length; i++){
            diff -= num[i];
        }
        System.out.println("Difference: " + diff);
    }
    public void mul(int...num){
        int product = 1;
        for(int i: num){
            product *= i;
        }
        System.out.println("Product: " + product);
    }
    public void findGcd(int...num){
        int gcd = 1;
        for(int i = 1; i <= num[0] && i <= num[1]; i++){
            if(num[0] % i == 0 && num[1] % i == 0){
                gcd = i;
            }
        }
        System.out.println("GCD: " + gcd);
    }
    
    public void findLcm(int...num){
        int lcm = (num[0] > num[1]) ? num[0] : num[1];
        while(true){
            if(lcm % num[0] == 0 && lcm % num[1] == 0){
                System.out.println("LCM: " + lcm);
                break;
            }
            lcm++;
        }
    }
}
