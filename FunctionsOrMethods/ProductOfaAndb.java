package FunctionsOrMethods;

public class ProductOfaAndb {
    public static int product(int a, int b){
        int prod=a*b;
        return prod;
    }

    public static void main(String[] args) {
        int a =10;
        int b =5;
        int prod =product(a,b);
        System.out.println(prod);
         prod=product(4,5);
        System.out.println(prod);
    }
}
