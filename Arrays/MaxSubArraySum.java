package Arrays;


// Max SubArray Sum by Brute Force technique
public class MaxSubArraySum {
    public static void ByBruteForce(int numbers[]){
        int currSum = 0;
        int maxSum = 0;
        for (int i =0;i< numbers.length;i++){
            int start =i;
            for (int j=i;j< numbers.length;j++){
                int end =j;
                currSum=0;
                for (int k=start;k<=end;k++){
                    currSum+=numbers[k];
                }
                System.out.println(currSum);
                if (maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max Sum = "+maxSum);
    }

    public static void main(String[] args) {
        int numbers[]={2,3,4,5,6,7};
        ByBruteForce(numbers);
    }
}





// Max SubArray sum by prefix sum
class MaxSubArraySum1{
    public static void prefixSum(int numbers[]){
            int currSum=0;
            int maxSum =0;
            int prefix[]=new int[numbers.length];
            prefix[0]=numbers[0];
            for (int i=1;i< prefix.length;i++){
                prefix[i]=prefix[i-1]+numbers[i];
            }
            for (int i=0;i< numbers.length;i++){
                int start =i;
                for (int j=i;j< numbers.length;j++){
                    int end =j;
                    currSum=start==0? prefix[end] :prefix[end]-prefix[start-1];
                    if (maxSum<currSum){
                        maxSum=currSum;
                    }
                }
            }
        System.out.println("max sum = "+maxSum);
    }

    public static void main(String[] args) {
        int numbers[]={-2, -3, -1, -2, -3};
        prefixSum(numbers);
    }
}





//Max subArray Sum by Kadane's Algorithm
class MaxSubArraySum2{
    public static void Kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs=0;

        for (int i=0;i< numbers.length;i++){
            cs=numbers[i]+cs;
            if (cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("Max Sub Array sum = "+ms);
    }

    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        Kadanes(numbers);
    }
}



//for all negative values kadane's algorithm
class MaxSubArraySum3 {
    public static void Kadane(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) {
            cs = numbers[i] + cs;
            if (cs <0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max Sub Array sum = " + ms);
    }

    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        Kadane(numbers);
    }
}