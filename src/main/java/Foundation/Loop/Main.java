package Foundation.Loop;

import java.util.Scanner;

//LOOP
//Q1.	Accept 10 number user and do sum of it.(do not use array)
//Q2.	Accept a number from user and find a factorial of a number
//Q3.	Accept 10 number from user count how many are  positive ,negative , zero
//Q4.	Accept   a number from user  and do sum of digit
//Q5.	Accept a number from user and reverse it.
//Q6.	Accept a number from user and check if it is palindrome number or not eg (121)
//Q7.	Accept a number from user and print a table of that number
//Q8.	Accept a number from user check if it is special number or not
//a.	Eg.145
//b.	1! =1
//c.	4!=1*2*3*4
//d.	5!=1*2*3*4*5  sum of it(1+24+120=145)
//Q9.	Accept a 3 digit number from user and check if it is Armstrong number or not
//a.	Eg 153
//b.	1 cube
//c.	5 cube
//d.	3 cube   sum of it (1+27+125=153)
//Q10.	Go on accepting number from user till user enter 0 and do sum of it.*
//Q11.	Accept a number from user and print next 5 numbers.
//Q12.	Accept a number from user and print that many numbers after the number.
//Q13.	Accept start and end range from user and print  all even number between them. (two answer)
//Q14.	Accept start and end range from user and print  all odd number between them. (two answer)
//Q15.	Accept term from user and print Fibonacci series*
//Q16.	Accept two number from user and print it’s LCM*
//Q17.	Accept a number from user accept a digit from user and check the occurrence of that digit
//Q18.	Accept 10 number from user and print highest number*
//Q19.	Accept 10 number from user and print lowest number.*
//Q20.	Accept 10 number from user and print highest and 2nd highest number.*
//Q21.	Write a prog to print every integer between 1 and n divisible by m. also report whether the number that is divisible by m is even or odd.
public class Main {


    /*
    // Q.1 Accept 10 number user and do sum of it.(do not use array)
    static void main() {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter 10 number");

        int sum =0;

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            sum += n;
        }

        System.out.println("Sum is = "+sum);
    }

     */


/*
    // Q2.	Accept a number from user and find a factorial of a number
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find its factorial : ");
        int n = sc.nextInt();

        int factorial = 1;

        if (n == 0) {
            factorial = 1;
            System.out.println(factorial);

        } else {
            for (int i = n; i > 0; i--) {
                factorial = factorial * i;
            }

            System.out.println(factorial);
        }
    }

 */


    /*

    // Q3.	Accept 10 number from user count how many are  positive ,negative , zero
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 number to get count of  positive negative and zero...");
        int positive_count = 0;
        int negative_count = 0;
        int zero_count = 0;

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if(n>0){
                positive_count++;
            } else if (n<0) {
                negative_count++;
            }else {
                zero_count++;
            }
        }

        System.out.println("Positive count : "+positive_count);
        System.out.println("Negative count : "+negative_count);
        System.out.println("Zero count : "+zero_count);
    }

     */


    /*


    //Q4.Accept a number from user  and do sum of digit

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to get sum of digit..");
        int n = sc.nextInt();
        int sum = 0;
        while (n>0){
            sum += n%10;
            n=n/10;
        }
        System.out.println(sum);
    }

     */




    /*

//Q5.	Accept a number from user and reverse it.
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to reverse it");
        int n = sc.nextInt();
        int rev = 0;


        while (n>0){
            rev = rev*10 + n%10;
            n = n/10;
        }

        System.out.println(rev);
    }

     */



    /*

    //Q6.Accept a number from user and check if it is palindrome number or not eg (121)

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check it is palindrome or not");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;


        while (n>0){
            rev = rev*10 + n%10;
            n = n/10;
        }

        if(rev == temp){
            System.out.println("Yes it is palindrome...");
        }else {
            System.out.println("No its not palindrome..");
        }
    }

     */



    /*
    //Q7.	Accept a number from user and print a table of that number
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get its Table..");
       int n = sc.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            int ans = n*i;

            System.out.println(n+" * "+i+" = "+ans);
        }
    }
     */



/*
    // Q8.	Accept a number from user check if it is special number or not
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        boolean is_Special = false;
        int n = sc.nextInt();
        int temp = n;
        int r;
        int total_sum=0;

        while (temp>0){
            r = temp%10;
            int fact = finding_factorial(r);
            total_sum+= fact;
            temp= temp/10;
     }
        if(n ==  total_sum){
            is_Special = true;
        }
        System.out.println(is_Special);
    }

    static int finding_factorial(int n){
        int fact = 1;
        if(n== 0){
            return 1;
        }
        for (int i = n; i >0 ; i--) {
            fact *= i;
        }
        return fact;
    }

 */


    /*
    // Q9.	Accept a 3 digit number from user and check if it is Armstrong number or not
    ////a.	Eg 153
    ////b.	1 cube
    ////c.	5 cube
    ////d.	3 cube   sum of it (1+27+125=153)

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check it is armstrong or not...");
        int n = sc.nextInt();
        int temp = n;
        int r;
        int sum =0;
        int size = String.valueOf(n).length();

        while (temp > 0){
            r = temp%10;
            sum += Math.pow(r,size);
            temp=temp/10;
        }

        if(sum == n){
            System.out.println("its an armstrong number...");
        }else {
            System.out.println("its not an armstrong number..");
        }

    }

     */


    /*

    // Q10.	Go on accepting number from user till user enter 0 and do sum of it.*
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number till you enter 0");
        int sum = 0;
        int n = sc.nextInt();
        while (n != 0){
            sum += n;
            n = sc.nextInt();
        }
        System.out.println(sum);
    }

     */



    /*

    // Q11.	Accept a number from user and print next 5 numbers.
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans ;
        for (int i = 1; i <= 5 ; i++) {
            ans = n+i;
            System.out.println(ans);
        }
    }

     */


    /*
    // Q12.	Accept a number from user and print that many numbers after the number.

    static void main() {
        Scanner sc =   new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();
        int ans ;

        for (int i = 1; i <= n ; i++) {
            ans = n+i;
            System.out.println(ans);
        }
    }
     */



    /*
    // Q13.	Accept start and end range from user and print  all even number between them. (two answer)

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the start of your range...");
        int start = sc.nextInt();

        System.out.println("Enter the end of your range...");
        int end = sc.nextInt();

        System.out.println("Even numbers are...");

        int ans;

        for (int i = start; i <= end ; i++) {
            if(i%2== 0){
                System.out.println(i);
            }
        }
    }

     */



    /*
    ////Q14.	Accept start and end range from user and print  all odd number between them. (two answer)
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start value of range...");
        int start = sc.nextInt();

        System.out.println("Enter end value id range");
        int end = sc.nextInt();

        int ans;

        for (int i=start; i <= end ; i++) {
            if(i%2==1){
                ans = i;
                System.out.println(ans);
            }
        }
    }

     */



    /*
    //Q15.	Accept term from user and print Fibonacci series*

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to get fibonacci  series till that number...");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 0; i <= n; i++) {
            System.out.print(a+" ");

            int c = a+b;
            a = b;
            b=c;
        }
    }
     */

/*
  // Q17.	Accept a number from user accept a digit from user and check the occurrence of that digit
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number...");
        int n = sc.nextInt();

        System.out.println("Enter digit to check its occurence..");
        int digit = sc.nextInt();
        int r ;
        int count = 0;

        while (n>0){
            r = n%10;
            if(r == digit){
                count++;
            }
            n= n/10;
        }
        System.out.println(count);
    }

 */


    /*

    // Q18.	Accept 10 number from user and print highest number*
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 numbers...");
        int highest = Integer.MIN_VALUE;


        for (int i = 1; i <= 10 ; i++) {
           int n = sc.nextInt();
           if(n > highest){
               highest = n;
           }
        }
        System.out.println("highest number is : "+highest);
    }

     */



    /*
    // Q19.	Accept 10 number from user and print lowest number.*
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 numbers...");
        int lowest = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if(n <lowest){
                lowest = n;
            }
            System.out.println("Lowest number is : "+lowest);
        }
    }
     */



    /*
    //Q20.	Accept 10 number from user and print highest and 2nd highest number.*

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers..");

        int highest = Integer.MIN_VALUE;
        int second_highest = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if(n > highest){
                second_highest = highest;
                highest = n;

            } else if (n>second_highest) {
                second_highest=n;
            }
        }
        System.out.println(highest);
        System.out.println(second_highest);
    }

     */



    /*
    //Q21.	Write a prog to print every integer between 1 and n divisible by m.
    // also report whether the number that is divisible by m is even or odd.
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter end of range");
        int end = sc.nextInt();

        System.out.println("Enter number for divisible...");
        int d  = sc.nextInt();

        int ans ;

        for (int i = 1; i <= end ; i++) {
            if(i%d==0){
               ans = i;
                System.out.print(ans+" ");

                if(ans%2==0){
                    System.out.print("Even...");
                }else {
                    System.out.print("Odd...");
                }
                System.out.println();
            }

        }
    }
     */

/*
    // LCM
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int n2 = sc.nextInt();
        int lcm ;
        if(n1>n2){
            lcm = n1;
        }else {
            lcm = n2;
        }
        while (true) {
            if (lcm%n1 == 0 && lcm % n2 == 0) {
                break;
            }
            lcm++;
        }
        System.out.println(lcm);
    }

 */

    /*
    // GCD
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1 : ");
        int n1 = sc.nextInt();

        System.out.println("Enter number 2 : ");
        int n2 = sc.nextInt();

        int gcd;

        if(n1 < n2){
            gcd = n1;
        }else {
            gcd = n2;
        }

        while (true){
            if (n1 % gcd  == 0 && n2% gcd == 0){
                break;
            }
            gcd--;
        }
        System.out.println(gcd);
    }
    
     */
}
