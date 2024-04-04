package Loops;

import java.util.Scanner;

public class WhileLoop {
}

// Print number from 1 to 10
class number {
    public static void main(String[] args) {


        int counter = 1;
        while (counter <= 10) {
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println();
    }
}



// Print sum of first n natural numbers
class SumOfNnumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int i =1;
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}



// Print reverse of a number
class ReverseNumber{
    public static void main(String[] args) {
        int n = 10899;
        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n =n/10;
        }
    }
}



// Reverse the given number
class ReverseNumber1{
    public static void main(String[] args) {
        int n = 10899;
        int rev=0;
        while(n>0){
            int lastDigit = n%10;
            rev =(rev*10)+ lastDigit;
            n = n/10;
        }
        System.out.println(rev);
    }
}



class doWhileLoop{
    public static void main(String[] args) {
        int counter =1;
        do{
            System.out.println("Hello world");
            counter++;
        }while(counter<=10);
    }
}


class breakKeyword{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter your number: ");
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while (true);
    }
}



class continueStatement{
    public static void main(String[] args) {
        for(int i =1;i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}



//Display all numbers entered by user except multiple of 10
class continueStatement1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }while (true);
    }
}



// Check if a number is prime or not
class PrimeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==2){
            System.out.println(n+" is a prime number");
        }else{
            Boolean isPrime = true;
            for(int i =2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime = false;
                }
            }
            if(isPrime==true){
                System.out.println(n+" is a prime number");
            }else{
                System.out.println(n+" is not a prime number");
            }
        }
    }
}