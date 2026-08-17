package Foundation.Pattern;

import java.util.Scanner;

public class Main {


    // check the given number is special or not
    // factorial  addition == number means special
    // 145 -> 1! + 4! + 5! = 145...........
    /*
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check it is special or not");
        int n = sc.nextInt();
        int r;
        int sum =0;
        int temp = n;

        while (temp > 0){
            r = temp%10;
            sum += find_factorial(r);
            temp = temp/10;
        }

        if(sum == n){
            System.out.println("its a special number...");
        }else {
            System.out.println("its not a special number..");
        }

     */

    /*

    // 1 to 200000 special number....
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("the special number between 1 to 200000 are...");

        for (int i = 1; i <= 200000; i++) {
            int temp = i;
            int sum = 0;
            int r;

            while (temp > 0) {
                r = temp % 10;
                sum += find_factorial(r);
                temp = temp / 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }


    static int find_factorial(int n) {
        int fact = 1;

        if (n == 1) {
            return fact;
        } else {
            for (int i = n; i > 0; i--) {
                fact = fact * i;
            }
        }
        return fact;
    }

     */


    /*
    // print this pattern...
    // 1
    // 12
    // 123
    static void main() {
        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

     */



    /*
    // 1
    // 22
    // 333
    static void main() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
     */


    /*
    // 1
    // 23
    // 456
    static void main() {
        int count = 0;
        for (int i = 1; i <= 3 ; i++) {
            for (int j = 1; j <=i ; j++) {
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }

     */


    /*
     //     1
     //    12
     //   123
    static void main() {
        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <= 3-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
     */


    /*
    //  1
    //  21
    //  321

    static void main() {
        for (int i = 1; i <= 3 ; i++) {
            for (int j = i; j >=1 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
     */


    /*
    //  321
    //  32
    //  3

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int n = sc.nextInt();

        for (int i = n; i > 0 ; i--) {
            for (int j = i; j > 0 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

     */


    /*

    //    1
    //   121
    //  12321
    // 1234321

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows ");
        int n = sc.nextInt();

        for (int i = 1; i <=4 ; i++) {
            //print blanck  space
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            // print ascending number
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            // print desceding part..
            for (int j = i-1; j >=1 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

     */
    /*
    //           0
                101
               21012
              3210123

     */

    /*
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            // print spaces
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            // print 1st part
            for (int k = i-1; k >= 0 ; k--) {
                System.out.print(k);
            }
            // print 2nd part
            for (int l =1; l <= i-1 ; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }


/*
     */
    //    1
    //   121
    //  12321
    // 1234321
    //  12321
    //   121
    //    1
/*
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int n = sc.nextInt();

        // upper part
        for (int i = 1; i <= n  ; i++) {

            // space
            for (int j = 1; j <=n-i; j++) {
                System.out.print("_");
            }

            // left side
            for (int k = 1; k <=i ; k++) {
                System.out.print(k);
            }

            // right side
            for (int l = i-1; l>=1 ; l--) {
                System.out.print(l);
            }
            System.out.println();
        }

        // lower part
        for (int i = 1; i<=n-1 ; i++) {

            // print blank space
            for (int j = 1; j<= i ; j++) {
                System.out.print("_");
            }

            // print num
            for (int k = 1; k <= n-i ; k++) {
                System.out.print(k);
            }

            // print right side
            for (int j = n-i-1; j>=1 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

 */


    /*

    //    *
    //   * *
    //  * * *
    // * * * *

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {

            // print space
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }

            // print *
            for (int k = 1; k <=i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

     */

}

