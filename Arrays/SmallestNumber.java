package Arrays;

public class SmallestNumber {
    public static int smallestNumber(int number[]){
        int smallest=Integer.MAX_VALUE;
        for (int i=0;i<number.length;i++){
            if(smallest>number[i]){
                smallest =number[i];

            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int number[]={8,5,2,1,6,7,4,};
        System.out.println("Smallest Number is: "+smallestNumber(number));
    }
}
