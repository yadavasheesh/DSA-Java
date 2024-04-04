package FunctionsOrMethods;

public class BinaryToDecimal {
    public static void binToDec(int binNo){
        int myNo=binNo;
        int pow =0;
        int decNo=0;
        while(binNo>0){
            int lastDigit=binNo%10;
            decNo=decNo+ lastDigit*(int) Math.pow(2,pow);
            pow++;
            binNo=binNo/10;
        }
        System.out.println("decimal of "+myNo+" is: "+decNo);

    }

    public static void main(String[] args) {
        binToDec(101);
    }
}
