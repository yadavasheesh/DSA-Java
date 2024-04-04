package PatternsPart1;

import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int no_of_lines=1;
        int osp=n-1;
        int isp=n-2;
        while (no_of_lines<=n){
            for (int i=0;i<osp;i++){
                System.out.print("  ");
            }
            if(no_of_lines==1 ||no_of_lines==n){
//                for (int i=0;i<osp;i++){
//                    System.out.print("  ");
//                }
                for (int i=0;i<n;i++){
                    System.out.print("* ");
                }
            }else{
//                for (int i=0;i<osp;i++){
//                    System.out.print("  ");
//                }
                System.out.print("* ");
                for (int i=0;i<isp;i++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
            osp--;
            no_of_lines++;
        }
    }
}



// By shraddha
class HollowRhombus1{
    public static void hollowRhombus(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=(n-i);j++){
                System.out.print("    ");
            }
            for (int j=1;j<=n;j++){
                if (i==1||i==n||j==1||j==n){
                    System.out.print("*   ");
                }
                else{
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRhombus(5);
    }
}