package Arrays;

public class LargestNumber {
    public static int largestNumber(int number[]){
        int largest =Integer.MIN_VALUE;  // - infinity
        for (int i=0;i<number.length;i++){
            if (largest < number[i]){
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int number[]={1,2,3,6,4,5};
        System.out.println("Largest number is : "+largestNumber(number));
    }
}
