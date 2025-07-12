import java.util.*;

public class Main {
    public static void main(String[] args){
        System.out.println("welcome to your calculator!");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Enter the desired mathematical operation");
        //Scanner input = new Scanner(System.in);
        char op = input.next().charAt(0);
        System.out.println("Enter your second number:");
        //canner secnumber = new Scanner(System.in);
        int b = input.nextInt();
        switch (op) {
            case '+':
                int add = Calculator.add(a, b);
                System.out.format("%d + %d = %d\n",a, b, add);
                break;
            case '-':
                int subtract = Calculator.subtract(a, b);
                System.out.format("%d - %d = %d\n",a, b, subtract);
                break;
            case '*':
                int multiply = Calculator.multiply(a, b);
                System.out.format("%d * %d = %d\n",a, b, multiply);
                break;
            case '/':
                if (b != 0) {
                double divide = Calculator.divide(a, b);
                System.out.format("%d / %d = %.2f\n", a, b, divide);
                } else {
                    System.out.println("Cannot divide by zero!");
                }
            default:
                break;
        }
    }
}