package VariablesAndDataTypesCodes;
import java.util.*;
// Practice Question 1
//In a program,input 3 numbers:A,BandC.You have to output the average of these 3 numbers.
 class PracticeQuestions1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A= sc.nextInt();
        int B= sc.nextInt();
        int C= sc.nextInt();
        float avg= (A+B+C)/3f;
        System.out.println(avg);

    }
}


//Practice Question 2
//In a program,input the side of a square.You have to output the area of the square.
class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float side=sc.nextFloat();
        float SquareArea = side*side;
        System.out.println(SquareArea);
    }
}


// Practice Question 3
// Enter cost of 3 items from the user (using float datatype)-a pencil,a pen and an eraser. You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencilCost = sc.nextFloat();
        float penCost = sc.nextFloat();
        float EraserCost = sc.nextFloat();
        float TotalCost = (pencilCost+penCost+EraserCost);
        float gst= (TotalCost*18)/100;
        float TotalCostWithGst = TotalCost+gst;
        System.out.println("Total Bill: "+TotalCost);
        System.out.println("Gst: "+gst);
        System.out.println("Total Cost With Gst: "+TotalCostWithGst);
    }
}
