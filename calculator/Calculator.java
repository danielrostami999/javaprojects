public class Calculator {
    public static int add(int a, int b){
        return (int)a + b;
    }
    public static int subtract(int a, int b){
        return (int)a - b;
    }
    public static int multiply(int a, int b){
        return (int)a * b;
    }
    public static double divide(double a, double b){
        if (b != 0 ) return (double)a / b;
        else return 0;
    }
}