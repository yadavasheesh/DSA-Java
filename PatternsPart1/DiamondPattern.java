package PatternsPart1;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int st=1;
        int sp= n-1;
        for (int no_of_lines=1;no_of_lines<=2*n-1;no_of_lines++){
            for (int i=0;i<sp;i++){
                System.out.print("  ");
            }
            for (int i=0; i<st;i++){
                System.out.print("* ");
            }
            if (no_of_lines<n){
                st+=2;
                sp--;
            }
            else {
                st-=2;
                sp++;
            }
            System.out.println();
        }
    }
}



// By Shraddha
class Diamond{
    public static void diamondPattern(int n){
        // 1st half
        for (int i=1;i<=n;i++){
            for (int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // 2nd half
        for (int i=n;i>=1;i--){
            for (int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamondPattern(5);
    }
}