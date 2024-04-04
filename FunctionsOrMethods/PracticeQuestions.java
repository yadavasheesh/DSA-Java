package FunctionsOrMethods;

public class PracticeQuestions {
}


// Practice Question 1
// Write a Java method to compute the average of three numbers..
class Q1{
    public static void AvgNo(int a,int b,int c){
        double AvgNo= (double) (a + b + c) /3;
        System.out.println("Avg of three numbers: "+AvgNo);
    }

    public static void main(String[] args) {
        AvgNo(2,5,7);
    }
}


// Practice Question 2
// Write a method named isEven that accepts an int argument .The method should return true if the
// argument is even,or false otherwise.Also write a program to test your method.
class Q2{
    public static boolean isEven(int n){
        if (n%2==0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isEven(6));
    }
}


// Practice Question 3
// Write a Java program to check if a number is a palindrome in Java? (121 is a palindrome, 321 is not)
class Q3{
    public static void palindromeNO(int n){
        int mn=n;
        int rev=0;
        while (n!=0){
            int rem =n%10;
            rev= (rev*10)+rem;
             n=n/10;
        }
        System.out.println(rev);
        if (mn==rev){
            System.out.println(mn+" is a palindrome Number");
        }
        else{
            System.out.println(mn+" is not a palindrome number");
        }
    }

    public static void main(String[] args) {

        palindromeNO(343);
    }
}


// Practice Question 5
//Write a Java method to compute the sum of the digits in an integer.
class Q5{
    public static void sOfDigits(int n){
        int sum =0;
        while (n>0){
            int rem =n%10;
            sum =sum+rem;
            n=n/10;
        }
        System.out.println("Sum of the digit of the given integer is: "+sum);
    }

    public static void main(String[] args) {
        sOfDigits(6785);
    }
}