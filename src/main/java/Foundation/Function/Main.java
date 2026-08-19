package Foundation.Function;

import java.util.Arrays;
import java.util.Scanner;



public class Main {

    /*
    // print all special number between 1 to 2000000
    static void main() {

        System.out.println("All special number between 1 to 200000 are...");

        for (int i = 1; i <= 200000 ; i++) {
            int n = i;
            int factorial_sum = 0;
            while (n>0) {
                factorial_sum += find_factorial(n % 10);
                n= n/10;
            }
            if(i == factorial_sum){
                System.out.println(i);
            }
        }
    }
    static int find_factorial(int n){
        int fact = 1;
        if(n == 0){
            return fact;
        }
        for (int i = n; i > 1 ; i--) {
            fact = fact*i;
        }
        return fact;
    }

     */

    /*
    // optimized approach...
    static void main() {
        int[]arr = new int[10];
        for (int i = 0; i <= 9; i++) {
            arr[i] = factorial(i);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i <= 200000 ; i++) {
            int n = i;
            int factorial_sum = 0;
            while (n>0) {
                int r = n%10;
                factorial_sum += arr[r];
                n= n/10;
            }
            if(i == factorial_sum){
                System.out.println(i);
            }
        }
    }
    static int factorial(int n){
        int fact = 1;
        for (int i = 2; i <= n ; i++) {
            fact = fact*i;
        }
        return fact;
    }

     */


    /*
    // fibonacci series.....

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number  : ");
        int n = sc.nextInt();
        if(n>0){
            fibonacci_series(n);
        }else {
            System.out.println("Invalid Term....");
        }

    }

    static void fibonacci_series(int n){
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n ; i++) {
            System.out.print(a+" ");
            int c = a+b;
            a=b;
            b=c;
        }
    }

     */

/*
    // find highest second highest and third highest....
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 numbers :");

        int highest = Integer.MIN_VALUE;
        int second_highest = Integer.MIN_VALUE;
        int third_highest =  Integer.MIN_VALUE;


        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();

            if(n > highest){
                third_highest = second_highest;
                second_highest = highest;
                highest = n;
            } else if (n> second_highest) {
                third_highest = second_highest;
                second_highest = n;
            } else if (n> third_highest) {
                third_highest = n;
            }
        }
        System.out.println("Highest number is : "+ highest);
        System.out.println("2nd Highest number is : "+second_highest);
        System.out.println("3rd Highest number is : "+ third_highest);
    }

 */


    /*
    // another faltu  approach...to find 2nd highest...

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 number to find highest and 2nd highest");
        int max = sc.nextInt();
        int second_max = sc.nextInt();
        if(max<second_max){
            // cant use swap because in java it is pass by value not pass by reference
            // only in array it will work..
            int temp = max;
            max=second_max;;
            second_max =temp;
        }
        for (int i = 3; i <= 5 ; i++) {
           int  number = sc.nextInt();

           if(number > max){
               second_max = max;
               max = number;
           }else if(number > second_max) {
               second_max = number;
           }
        }
        System.out.println("Highest number is : "+max);
        System.out.println("2nd Highest number is : "+second_max);
    }

     */

/*

    // Enter number of Rows...
    //3
    //1
    //12
    //123
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows..");
        int n = sc.nextInt();

        int r ;
        int c = 0;

        for (r=1; r<=n;){
            if(c<r){
                c++;
                System.out.print(c);
            } else if (c==r) {
                System.out.println("");
                r++;
                c=0;
            }
        }
    }


 */


    /*

    // Enter number of Rows...
    //3
    //*
    //**
    //***

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Rows...");
        int n = sc.nextInt();

        int r;
        int c=0;

        for (r=1; r<=n;){
            if(c<r) {
                System.out.print("*");
                c++;
            } else if (c==r) {
                r++;
                c=0;
                System.out.println();
            }
        }
    }

     */

}
