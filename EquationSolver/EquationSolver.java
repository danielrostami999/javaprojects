public class EquationSolver {
    public static void SolveEq1(double a, double b){
        double x = -b/a;
        System.out.println("solving equation a*x + b = 0 ");
        System.out.format("a = %f, b = %f\n", a, b);
        System.out.format("x = %f\n", x);
    }
}
