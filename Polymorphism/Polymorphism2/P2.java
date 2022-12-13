// Write program to display following pattern using method overloading and constructor
// overloading?
// Odd number based pyramid starts from value n received from user

//       n+1
//     n+3 n+6
//   n+5 n+10 n+15
// n+7 n+14 n+21 n+28
// even number based pyramid starts from value n received from user

//         n+2
//       n+4 n+6
//     n+6 n+10 n+14
//  n+8 n+14 n+20 n+26
// user defined character suppose entered character is k

//      k
//     k k
//    k k k
//   k k k k
public class P2 {
    int num;
    char ch;
    public P2(int num) {
        this.num = num;
        if(num%2==0){

        }

    }
    public P2(char ch) {
        this.ch = ch;
    }
    public static void main(String[] args) {
        Pyramid p = new Pyramid(6);
        Pyramid pm = new Pyramid('k');
        Pyramid pd = new Pyramid(3);
    }

   
    
}
