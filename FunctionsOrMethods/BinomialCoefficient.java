package FunctionsOrMethods;

public class BinomialCoefficient {
    public static int Factorial(int n ){
        int f =1;
        for (int i =1; i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static int binCoeff(int n,int r){
        int fac_n =Factorial(n);
        int fac_r=Factorial(r);
        int fac_nmr=Factorial(n-r);

        int binCoeff=fac_n/(fac_r*fac_nmr);
        return binCoeff;
    }

    public static void main(String[] args) {
        System.out.println(binCoeff(5,2));
    }
}
