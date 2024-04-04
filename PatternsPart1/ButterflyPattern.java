package PatternsPart1;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int st=1;
        int sp= 2*n-2;
        int  No_of_lines=1;
        while(No_of_lines<=2*n){
            for (int i=0;i<st;i++){
                System.out.print("* ");
            }
            for (int i=0;i<sp;i++){
                System.out.print("  ");
            }
            for (int i=0;i<st;i++){
                System.out.print("* ");
            }
            if (No_of_lines<n){
                st++;
                sp-=2;
            }else if (No_of_lines>n){
                st--;
                sp+=2;
            }
            System.out.println();
            No_of_lines++;
        }
    }
}



//BY shraddha
class butterfly{
    public static void ButterflyPattern(int n){
        // 1st half
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for (int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // 2nd half
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for (int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ButterflyPattern(4);
    }
}