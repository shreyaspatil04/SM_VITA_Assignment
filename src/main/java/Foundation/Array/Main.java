package Foundation.Array;

//DAY 5:
//Q1.	Accept 5 number in an array, accept a number from user and check if given number is there in an array or not
//Q2.	Accept 5 number in an arrayand sort it (bubble sort)
//Q3.	Accept 5 number in an array and sort it (selection sort)
//Q4.	Accept 5 number in an array and sort it (insertion sort)
//Q5.	Accept two set of array each having 5 element sort it and put it in new array
//Q6.	Accept 5 number in an array, accept a number from user and check if given number is there in an array or not use binary search
//Q7.	Accept 5 number in an array ( repeat numbers ) print unique array
//Q8.	Accept 10 number in an array accept a index and a new number and add that number at that index
//Q9.	Accept 10 number in an array accept a number to be deleted from array and print new array
//Q10.	Accept data in 3*3 matrix two times  and do the sum of it
//Q11.	Accept data in 3*3 matrix two time  and do multiplication of matrix
//Q12.	Accept data in 4*4 matrix and transpose it
//Q13.	Accept data in 4*4 matrix and check if it is magic square or not
//Q14.	Accept data in 3*3 matrix and print row wise and column wise total
//Q15.	Accept marks and roll number of 10 students and display maeks in ascending order
//Q16.	Accept 10 number in an array and print highest 3 number
//Q17.	Accept 5 number in an array and display message entered data is in ascending/descending or not sorted
//Q18.	Accept 10digit number print longest ascending number
//a.	Eg 2156897456 o/p  15689

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    /*
    //Q1.	Accept 5 number in an array, accept a number from user and check if given number is there in an array or not
    static void main() {
        Scanner sc =  new Scanner(System.in);
        int[] arr = new int[5];
        boolean ans = false;

        System.out.println("Enter element in array...");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number to check it is present in your array or not");
        int n = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            if(n == arr[i]){
                ans = true;
                break;
            }
        }

        if(ans == true){
            System.out.println("Yes its present in array..");
        }else {
            System.out.println("Your number is not present in your array...");
        }
    }

     */


    /*
    //Q2.	Accept 5 number in an arrayand sort it (bubble sort)
    static void main() {
        int[] arr = {4,3,5,2,1};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble_sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i ; j++) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }
    static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


     */

    /*

    // Accept 5 number in an array and sort it (selection sort)
    static void main() {
        int[]arr = {3,4,5,2,1};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection_sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last_index = arr.length-1-i;
            int max_index = find_max(arr,0,last_index) ;
            swap(arr,last_index,max_index);
        }
    }

    static int find_max(int[] arr, int s , int e){
        int max = s;

        for (int i = s+1; i <= e ; i++) {
            if(arr[i] >= arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

     */


    /*
    // insertion sort

    static void main(){
        int[] arr = {3,2,1,4,5};
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion_sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j>0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }
    static void swap(int[] arr , int a , int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

     */

    //Q8.	Accept 10 number in an array accept a index and a new number and add that number at that index
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter inedx : ");
        int index = sc.nextInt();

        System.out.println("Enter value : ");
        int value = sc.nextInt();





    }
}
