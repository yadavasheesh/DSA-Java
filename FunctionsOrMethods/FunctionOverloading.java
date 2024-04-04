package FunctionsOrMethods;

public class FunctionOverloading {

    // Function overloading using Parameters
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a ,int b, int c){
        return a+b+c;
    }

    // Function overloading using Data types
    public static int add(int a, int b){
        return a+b;
    }
    public static float add(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(1,3,8));
        System.out.println(add(3,5));
        System.out.println(add(3.2f,4.5f));
    }
}
