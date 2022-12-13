public class Pyramid {
    
    public Pyramid(int num) {
        if (num % 2 == 0) {
            evenPyramid(num);
        } else {
            oddPyramid(num);
        }
    }
    public Pyramid(char ch) {
        charPyramid(ch);
    }
    
    public void oddPyramid(int num) {
        int n = num;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(n + 1 + " ");
                n += 2;
            }
            System.out.println();
        }
    }

    public void evenPyramid(int num) {
        int n = num;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(n + 2 + " ");
                n += 4;
            }
            System.out.println();
        }
    }

    public void charPyramid(char ch) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
