package Foundation.Basic_if_else;



/*
Basic Task


Q1. Accept 2 number from user and find remainder.
Q2. Accept 2 number from user and find quotient
Q3. Accept a number from user and do no. % 2 and print remainder
5%21   4%20
Q4. Accept 2 number from user in byte data type and do sum of it.
Q5. Accept 2-character form user and do sum of it.
Q6. Accept 2 float value from user and find product of it.
Q7. Accept 2 string from user and concate it.
Q8. Accept a number and print square of a number.
Q10 Accept a number and use bitwise ‘ & 1’ observe the result eg.
int a=no &1


Q1. Accept a number from user and print next number using one variable a=5;  ++a
Q2. Accept a number from user and print previous number
Q3. Accept a character from user and print next character
Q4. Accept a character from user and print previous character
Q5. Accept a name from user and print it 5 time
Q6. Accept 2 number from user and swap it.  Minimum 3 answer
Q7. Accept a character from user and add 32 in it and print new character
Eg input A +32 output a
Q8. Accept a character from user and subtract 32 in it and print new character eg. a-32A


 */

import java.util.Scanner;

public class basic_task_day_1 {

    /*
    static void main() {
        // Q.1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 number :");
        int a = sc.nextInt();

        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();

        int ans = a%b;
        System.out.println(ans);

    }

     */

    /*
    // Q.2

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 number :");
        int a = sc.nextInt();

        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();

        float ans = (float) a/b;

        System.out.println(ans);
    }

     */


    /*
    // Q.3
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 number :");
        int a = sc.nextInt();

        int sol = a%2;

        System.out.println(sol);
    }

     */



    /*
    // Q.4

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 number :");
        byte a = sc.nextByte();

        System.out.println("Enter 2nd number : ");
        byte b = sc.nextByte();

        int ans = a+b;

        System.out.println(ans);
    }

     */

    /*
    // Q5. Accept 2-character form user and do sum of it.
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st char :");
        char a = sc.next().charAt(0);

        System.out.println("Enter 2nd char : ");
        char b = sc.next().charAt(0);

        int ans = a+b;

        System.out.println(ans);
    }

     */




    /*

    //Q6. Accept 2 float value from user and find product of it.

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st value :");
        float a = sc.nextFloat();

        System.out.println("Enter 2nd value : ");
        float b = sc.nextFloat();

        float ans = a*b;

        System.out.println(ans);
    }

     */


/*
    //Q7. Accept 2 string from user and concate it.
    static void main() {

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter 1 string :");
        String a = sc.next();

        System.out.println("Enter 2nd string : ");
        String b = sc.next();

        String ans = a+b;
        System.out.println(ans);
    }


 */


    /*
    // Q8. Accept a number and print square of a number.

    static void main() {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter value :");
        int a = sc.nextInt();

        int ans = a*a;

        System.out.println(ans);
    }

     */



    /*
    // Q10 Accept a number and use bitwise ‘ & 1’ observe the result eg.

    static void main() {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter value :");
        int a = sc.nextInt();

        if((a&1) == 0){
            System.out.println("Even...");
        }else {
            System.out.println("Odd...");
        }
    }

     */


    /*
    // Q1. Accept a number from user and print next number using one variable a=5;

    static void main() {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter value :");
        int a = sc.nextInt();
        a++;
        System.out.println(a);
    }
     */



    /*
    // Q2. Accept a number from user and print previous number
    static void main() {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter value :");
        int a = sc.nextInt();
        a--;
        System.out.println(a);
    }

     */


    /*



 // Q3. Accept a character from user and print next character

    static void main() {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter value :");
        char ch = sc.next().charAt(0);

        char ans = (char) (ch+1);
        System.out.println(ans);
    }

     */


    /*



    //  Q4. Accept a character from user and print previous character

    static void main() {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter value :");
        char ch = sc.next().charAt(0);

        char ans = (char) (ch-1);
        System.out.println(ans);
    }
     */

    /*
// Q5. Accept a name from user and print it 5 time
    static void main() {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter 5 names :");
        String str = sc.nextLine();

        for (int i = 0; i < 5; i++) {
            System.out.println(str);
        }

    }

     */

    // Q6. Accept 2 number from user and swap it.  Minimum 3 answer

     /*
    static void main() {
        int a = 10;
        int b = 20;

        // 1st solution
        a = a+b ;
        b = a-b;
        a = a-b;

        // 2nd solution
        a = a*b;
        b = a/b;
        a=  a/b;

        // 3rd solution
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println(a);
        System.out.println(b);
    }

     */




    /*
    //Accept a character from user and add 32 in it and print new character
    //Eg input A +32 output a
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a capital character");
        char ch = sc.next().charAt(0);

        char ans = (char)(ch + 32);
        System.out.println(ans);
    }

     */


    /*
    // Q8. Accept a character from user and subtract 32 in it and print new character eg. a-32A
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a capital character");
        char ch = sc.next().charAt(0);

        char ans = (char)(ch - 32);
        System.out.println(ans);
    }

     */


}
