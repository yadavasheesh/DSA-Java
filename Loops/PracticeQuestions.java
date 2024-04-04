package Loops;

import javax.swing.*;
import java.util.Scanner;

public class PracticeQuestions {
}



// Practice Question 1
 class Q1{
    public static void main(String[] args) {
        for(int i=0;i<5;i++) {
            System.out.println("Hello");
            i+=2;
        }
     }
    }



    // Practice Question 2
// Write a program that reads a set of integers,and then prints the sum of the even and odd integers.
class Q2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n;
            int choice;
            int even_Sum = 0;
            int odd_Sum = 0;
            do {
                System.out.print("Enter your number:");
                n = sc.nextInt();
                if (n % 2 == 0) {
                    even_Sum += n;
                } else {
                    odd_Sum += n;
                }
                System.out.print("Do you want to continue? Press 1 for yes or 0 for no: ");
                choice = sc.nextInt();
            } while (choice == 1) ;
                System.out.println("Even sum: " + even_Sum);
                System.out.println("Odd sum: " + odd_Sum);
            }
                }









    // Practice Question 3
// Write a program to find the factorial of any number entered by the user.
class Q3{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
           /* double n = sc.nextInt();
            double fac= 1;
            if (n == 0 || n == 1) {
                System.out.println(fac);
            }else{
                for (int i =1;i<n;i++){
                    fac =fac*(n-i);
                }
                fac = n*fac;
                System.out.println(fac);
            }

            */
            int n = sc.nextInt();
            int fac =1;
for (int i =1; i<=n;i++){
    fac =fac*i;
}
            System.out.println(fac);
        }
    }


    // Practice Question 4
// Write a program to print the multiplication table of a number N,entered by the user.
class Q4{
       /* public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number");
            int n = sc.nextInt();
            int table;
            System.out.println("Table of: "+n);
            for (int i=1;i<=10;i++){
                table =n*i;
                System.out.println(table);
            }
        }

        */
        public static void printMultiplicationTable(int number){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number");
            int n =sc.nextInt();
            for(int i=1;i<=10;i++){
                System.out.println(n+" * "+i+" = "+n*i);
            }

        }

        public static void main(String[] args) {
            printMultiplicationTable(0);
        }
    }




