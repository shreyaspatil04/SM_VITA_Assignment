package Foundation.recurssion;

import java.util.Arrays;
import java.util.Scanner;

public class main {

    /*
    //Q1.	Find factorial of a number
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        int ans = find_factorial(n);
        System.out.println(ans);
    }

    static int find_factorial(int n){
        if(n==1){
            return 1;
        }
        return n* find_factorial(n-1);
    }

     */



    /*
    // find binary of a number... (without recurssion)
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int temp = n;
        int r;
        String binary = "";

        while (temp > 0){
            r= temp%2;
            binary = r+binary;
            temp = temp/2;
        }
        System.out.println(binary);
    }

     */


    /*
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        String ans = find_binary(n);
        System.out.println(ans);

    }

    static String find_binary(int n){
        if(n == 0){
            return "";
        }
        return find_binary(n/2)+ n%2;
    }

     */


    /*
// find binary using recurssion....
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();
        print_number(n);
    }

    static void print_number(int n){
        if(n==0){
            return;
        }
         print_number(n-1);
        System.out.println(n);
    }
     */


    /*
    // find lcm
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no. :");
        int n1 = sc.nextInt();
        System.out.println("enter 2nd no. :");
        int n2 = sc.nextInt();
        int lcm;
        if(n1 > n2){
            lcm = n1;
        }else {
            lcm = n2;
        }
        while (true){
            if(lcm% n1 == 0 && lcm%n2 ==0){
                System.out.println(lcm);
                break;
            }else {
                lcm++;
            }
        }
    }

     */



    /*

    // optimal solution to find lcm and gcd

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number : ");
        int n1 = sc.nextInt();

        System.out.println("Enter 2nd number : ");
        int n2 = sc.nextInt();

        int gcd = find_gcd( n1,n2 );

        int lcm = (n1*n2)/gcd;

        System.out.println("GCD is : "+ gcd);
        System.out.println("LCM is : "+lcm);
    }

    static int find_gcd(int a ,int b){
        int r;
        while (b!= 0){
            r = a%b;
            a=b;
            b=r;
        }
        return a;
    }

     */



    /*
    // this optimal solution in recurssion
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number : ");
        int n1 = sc.nextInt();

        System.out.println("Enter 2nd number : ");
        int n2 = sc.nextInt();

        int gcd = find_gcd(n1 , n2);

        int lcm = (n1*n2)/gcd;

        System.out.println("GCD is : "+gcd);
        System.out.println("LCM is : "+lcm);
    }

    static int find_gcd(int a , int b){
        if(b == 0){
            return a;
        }
        return find_gcd(b,a%b);
    }

     */

    /*
    // Q5.	Accept a number from user and do sum of digit
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number " );
        int n = sc.nextInt();

        int sum = find_sum(n);
        System.out.println(sum);
    }
    static int find_sum(int n){

        if( n== 0){
            return 0;
        }

        return (n%10)+find_sum(n/10);
    }

     */


    /*
    // Quick sort coz it implements recussion

    static void main() {
        int[] arr = {5,6,4,7,2,3};
        quick_sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quick_sort(int[] arr, int s , int e) {
        if(s < e) {
            int pivot_index = find_pivot_index(arr,s,e);
            quick_sort(arr, s, pivot_index - 1);
            quick_sort(arr, pivot_index + 1, e);
        }
    }

    static int find_pivot_index(int[]arr , int s , int e){
        int pivot = arr[e];
        int index = s-1;

        for (int i = s; i < e ; i++) {
            if(arr[i]<pivot){
                index++;
                swap(arr,index,i);
            }
        }
        index++;
        swap(arr,index,e);
        return index;
    }

    static void swap(int[]arr , int a , int b){
        int temp = arr[a];
        arr[a]  =arr[b];
        arr[b] = temp;
    }
     */
}
