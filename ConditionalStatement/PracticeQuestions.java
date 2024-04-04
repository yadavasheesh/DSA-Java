package ConditionalStatement;
import java.util.*;
public class PracticeQuestions {
}

// Practice Question 1
//Write a Java program to get a number from the user and print whether it is positive or negative
class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number>0){
            System.out.println("Positive Number");
        }
        else{
            System.out.println("Negative Number");
        }
    }
}


// Practice Question 2
// Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.
class q2{
    public static void main(String[] args) {
       double temp = 100.1;
       String fe= (temp>100)?" you have fever":"You don't have fever";
        System.out.println(fe);
    }
}


// Practice Question 3
// Write a Java program to input week number (1-7) and print day of week name using switch case.
class q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        switch(week){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter number between 1 to 7");
        }
    }
}


// Practice Question 4
//What will be the value of x & y in the following program:
class q4{
    public static void main(String[] args) {
        int a=63; int b= 36;
        boolean x= (a<b )? true:false;
        int y = (a>b) ? a: b;
        System.out.println(x);
        System.out.println(y);
    }
}


// Practice Question 5
// Write a Java program that takes a year from the user and print whether that year is a leap year or not.
class q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        // Method 1
boolean x = (year%4)==0;
boolean y = (year%100)!=0;
boolean z = (year%100)==0 && (year%400)==0;
if(x&&(y||z)){
    System.out.println(year+" is a leap year");
}
else{
    System.out.println(year+" is not a leap year");
}

//Method 2
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Leap year");
                }
                else{
                    System.out.println("Not a leap year");
                }
            }
            else{
                System.out.println("Leap year");
            }
        }
        else{
            System.out.println("Not a leap year");
        }

        // method 3
        if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0)) {
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
        }
    }

