package PatternsPart1;

import java.util.Scanner;

public class InvertedAndReverseStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st=1;
        int sp=n-1;

        int no_of_line=1;
        while (no_of_line<=n){
            // print Spaces
            for (int i=0;i<sp;i++){
                System.out.print("  ");
            }
            // Print Star
            for (int i=0;i<st;i++){
                System.out.print("* ");
            }
            System.out.println();
            st++;
            sp--;
            no_of_line++;
        }
    }
}



// By shraddha
class InvertedAndReverseStarPattern2 {
    public static void inverted_and_rotated_Star_pattern(int n){
        for (int i=1;i<=n;i++){
            //Spaces
            for (int j =1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_and_rotated_Star_pattern(4);
    }
}