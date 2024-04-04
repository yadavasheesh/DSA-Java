package PatternsPart1;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        for (int line=1;line<=4;line++){
            for (int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


// Second method
class Spattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int st=1;
        int sp=n-1;

        int i=1; // i = no of line
        while(i<=n){ // here we can also use for loop
            // Print star
            for (int j =0;j<st;j++) {
                System.out.print("*");
            }
            // Print Spaces
            for (int j=0;j<sp;j++){ // For this question we don't need spaces
                System.out.print(" ");
            }
            // Prepare for the nextLine
            System.out.println();
            st++;
            sp--;
            i++;
        }
    }
}
