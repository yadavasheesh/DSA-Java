package PatternsPart1;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int st=n;
        int sp=n-2;
        int no_of_line=1;
        while (no_of_line<=n-1){
            if (no_of_line==1 || no_of_line==n-1){
                for (int i=0;i<st;i++){
                    System.out.print("* ");
                }
            }else{
                System.out.print("* ");
                for (int i=0;i<sp;i++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
            no_of_line++;
        }
    }
}



// By Shraddha
class HollowRectangle2{
    public static void hollowRectangle(int totRows,int totCol){
        // outer loop
        for (int i=1;i<=totRows;i++){
            //inner column
            for (int j=1;j<=totCol;j++){
                //cells -(i,j)
                if (i==1|| i==totRows||j==1||j==totCol){
                    // boundary cell
                    System.out.print("*   ");
                }else{
                    System.out.print("    ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        hollowRectangle(7,7);
    }
}