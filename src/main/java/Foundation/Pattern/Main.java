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
}

