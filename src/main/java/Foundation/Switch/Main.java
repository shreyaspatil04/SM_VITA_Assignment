package Foundation.Switch;

import java.util.Scanner;

public class Main {


    /*
    // Q1.	Give choice to user
    //a.	square
    //b.	Cube
    //c.	 exit
    //as per user choice display result if user enter invalid choice give appropriate message.
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int n = sc.nextInt();

        System.out.println("Enter choice : \n" +
                            "a. Square  \n" +
                            "b. Cube    \n" +
                            "c. Exit    \n");

        char choice = sc.next().charAt(0);

        switch(choice){

            case 'a' :
                System.out.println("Square of your number is : "+ n*n);
                break;

            case 'b' :
                System.out.println("Cube of your number is : "+n*n*n);
                break;

            case 'c' :
                System.out.println("Exiting......");
                break;

            default :
                System.out.println("Please enter valid choice.....");
        }
    }

     */



    /*
    /// Q2.	 Do the same example above but you program should not exit unless user enter choice “c”
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int n = sc.nextInt();
        char choice;

        do {
            System.out.println("Enter choice : \n" +
                    "a. Square  \n" +
                    "b. Cube    \n" +
                    "c. Exit    \n");

             choice = sc.next().charAt(0);

            switch(choice){
                case 'a' :
                    System.out.println("Square of your number is : "+n*n);
                    break;

                case 'b' :
                    System.out.println("Cube of your number is : "+n*n*n);
                    break;

                case 'c' :
                    System.out.println("Exiting.......");
                    break;

                default :
                    System.out.println("Please enter valid choice...");
            }

        }while (choice != 'c');
    }

     */



    /*
    //Q3.	Accept date month and year from user and print date in formatedd-mmm-yyyy
   // a.	Eg. Input 12/3/2012  o/p 12 january 2012

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter date in (dd-mm-yyyy) format");

        System.out.println("Enter date");
        int date = sc.nextInt();

        System.out.println("Enter month");
        int month = sc.nextInt();

        System.out.println("Enter year");
        int year = sc.nextInt();

        String month_name ="";

        switch (month){

            case 1 :
                month_name = "january";
                break;
            case 2 :
                month_name = "february";
                break;
            case 3 :
                month_name = "march";
                break;
            case 4 :
                month_name = "april";
                break;
            case 5 :
                month_name = "may";
                break;
            case 6 :
                month_name = "june";
                break;
            case 7 :
                month_name = "july";
                break;

            case 8 :
                month_name = "august";
                break;

            case 9 :
                month_name = "september";
                break;

            case 10 :
                month_name = "october";
                break;

            case 11 :
                month_name = "november";
                break;

            case 12 :
                month_name = "december";
                break;

            default:
                System.out.println("enter valid month..");
        }

        if(month>= 1 && month<=12){
            System.out.println(date+" "+month_name+" "+year);
        }
    }

     */

    //Q4.	give choice to user
    //1.+
    //2.*
    //3./
    //4. exit
    //as per user choice display result if user enter invalid choice give appropriate message.


}
