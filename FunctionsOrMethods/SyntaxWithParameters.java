package FunctionsOrMethods;

import java.util.Scanner;

public class SyntaxWithParameters {
    public static int calculateSum(int num1, int num2){  // parameters or formal parameters
        int sum = num1+num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a,b); // actual parameters or arguments
        System.out.println("Sum is: "+sum);
    }

}
