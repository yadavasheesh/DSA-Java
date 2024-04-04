package Arrays;

import java.util.Scanner;

public class OperationsInArray {
    public static void main(String[] args) {
        int marks[]=new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of array = "+marks.length);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("phy "+marks[0]);
        System.out.println("chem "+marks[1]);
        System.out.println("math "+marks[2]);

        marks[1]=marks[0]+2;
        System.out.println(marks[1]);

        int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage "+percentage);
    }
}
