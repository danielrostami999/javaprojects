public class EquationSolver {
    public static void SolveEq1(double a, double b){
        double x = -b/a;
        System.out.println("solving equation a*x + b = 0 ");
        System.out.format("a = %f, b = %f\n", a, b);
        System.out.format("x = %f\n\n", x);
    }
    public static void SolveEq2(double a, double b, double c) {
        System.out.println("solving equation a*x^2 + b*x + c = 0 ");
        System.out.format("a = %f, b = %f, c = %f\n", a, b, c);
        System.out.print("solution =\n");

        double delta = b*b - 4*a*c;
        if(delta > 0){
            double x1 = (-b+Math.sqrt(delta))/(2*a);
            double x2 = (-b-Math.sqrt(delta))/(2*a);
            System.out.format("x1 = %f\nx2 = %f\n",x1 ,x2);
        } else if (delta == 0) {
            double x = -b/(2*a);
            System.out.format("x = %f\n", x);
        } else System.out.println("a;hdfghpaiufghiu");


    }
}
