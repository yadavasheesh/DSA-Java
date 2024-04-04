package FunctionsOrMethods;

public class DecimalToBinary {
    public static void DecToBin(int DecNo){
        int myNo=DecNo;
        int pow=0;
        int BinNo=0;
        while(DecNo>0){
            int rem = DecNo%2;
            BinNo= BinNo+ rem*(int)Math.pow(10,pow);
            pow++;
            DecNo=DecNo/2;
        }
        System.out.println(myNo+" is converted to Binary Number = "+BinNo);
    }

    public static void main(String[] args) {
        DecToBin(8);
    }
}
