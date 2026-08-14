package Foundation.Basic_if_else;


//Q1.	Swap 2 variable without using 3rd variable .(three answer)
//Q2.	Accept three no and find out the highest  no.
//Q3.	Accept a year from user check if it is leap year or not
//Q4.	Accept a character from user and reverse the case eg. Input   aout put   A
//Q5.	Accept a character from user and check if it is vowel or not
//Q6.	Accept a marks from user and print it’s grade
//a.	Mks>=75  grade A
//b.	Mks>=55 grade B
//c.	Mks>=35 grade c
//d.	Else fail
//Q7.	Accept a number from user - if it is divisible by 3 print “three” , if it is divisible by 7 print “seven” and if it is divisible by both(3,7) print “three -seven”
//Q8.	An electric power distribution co. charges its domestic consumers as follows
//follows: consumption units
//a.	0-200			            0.50 perunit
//b.	201-400			100+0.65 pu.excess of 200
//c.	401-600			230+0.80pu.excess of 400
//d.	601 and above	390+1.00pu in excess of 600
//Q9.	Accept a number from user check if it is odd or even number
//Q10.	Enter sex m/f  and salary- if m-salary>8000 tax is 5% of salary else 2%if f-salary>5000 tax is 3% else tax is 1% find a net salary=salary-tax
//Q11.	Accept 3 digit number from user and do the sum of its digit .(do not use any loop)
//Q12.	Accept years of investment rate of interest and principal amount of investment find simple interest
//Q13.	Problem: Given the length of four sides determine whether they can be used to create a polygon and determine if that polygon is a square. A polygon can be created if no single side is greater than the sum of the other three sides. Display a ONE when the status (polygon or square) is confirmed and ZERO when the status cannot be confirmed.
//
//Example Execution #1:
//Enter the length of the four sides: 4 3 2 9
//Length of sides: 4, 3, 2, 9
//Polygon status: 1
//Square status: 0
//
//Example Execution #2:
//Enter the length of the four sides: 5 5 5 5
//Length of sides: 5, 5, 5, 5
//Polygon status: 1
//Square status: 1
//
//Example Execution #3:
//Enter the length of the four sides: 84 25 20 15
//Length of sides: 84, 25, 20, 15
//Polygon status: 0
//Square status: 0
//Q14 Assignment 1 ( Determining the Type of a Triangle)


import java.util.Scanner;

public class task_logic {
    /*
    // Q.1
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
    // Q.2 Accept three no and find out the highest  no.

    static void main() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b){
            if(a>c){
                System.out.println(a+" is highest");
            }else {
                System.out.println(c+" is highest");
            }
        } else if (b>c) {
            System.out.println(b+" is highest");
        }else {
            System.out.println(c+"is highest");
        }
    }

     */


    /*
    // 	Accept a year from user check if it is leap year or not
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = sc.nextInt();

        if(year%400 == 0 || (year%4==0 && year%100!= 0)){
            System.out.println("yes this is a leap year..");
        }else {
            System.out.println("this is not a leap year..");
        }
    }

     */


    /*

    ////Q6.	Accept a marks from user and print it’s grade
    ////a.	Mks>=75  grade A
    ////b.	Mks>=55 grade B
    ////c.	Mks>=35 grade c
    ////d.	Else fail

    static void main() {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter marks : ");
        int marks = sc.nextInt();

        if(marks>= 75){
            System.out.println("Grade A");
        } else if (marks>=55) {
            System.out.println("Grade B");
        } else if (marks>=35) {
            System.out.println("Grade C");
        }else {
            System.out.println("Fail...");
        }
    }

     */


    /*
    // Q7.	Accept a number from user - if it is divisible by 3 print “three”
    // if it is divisible by 7 print “seven” and if it is divisible by both(3,7) print “three -seven”

    static void main() {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if(num%3 == 0 && num%7==0){
            System.out.println("Three - Seven");
        } else if (num%3 == 0) {
            System.out.println("Three");
        }else if(num%7 == 0){
            System.out.println("Seven1");
        }
    }

     */



    //Q8.	An electric power distribution co. charges its domestic consumers as follows
    //follows: consumption units
    //a.	0-200			            0.50 perunit
    //b.	201-400			100+0.65 pu.excess of 200
    //c.	401-600			230+0.80pu.excess of 400
    //d.	601 and above	390+1.00pu in excess of 600

    static void main() {

    }
}
