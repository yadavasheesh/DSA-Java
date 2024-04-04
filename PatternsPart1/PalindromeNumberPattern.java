package PatternsPart1;

import java.util.Scanner;

public class PalindromeNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int no_of_lines=1;
        int sp=n-1;
        int st=1;
        while (no_of_lines<=n){
            for (int i=0;i<sp;i++){
                System.out.print("  ");
            }
            int current_num=no_of_lines;
            for (int i=0;i<st;i++){
                System.out.print(current_num+" ");
                if (i<st/2) {
                    current_num--;
                } else{
                        current_num++;
                    }
            }
            System.out.println();
            sp--;
            st+=2;
            no_of_lines++;
        }
    }
}
