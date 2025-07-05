public class Complex {
    private double Real;
    private double Imag;

    public Complex() {
        Real = 0;
        Imag = 0;
    }

    public Complex(double x) {
        Real = x;
        
    }

    public Complex(double x, double y) {
        Real = x;
        Imag = y;
    }

    public double getReal() {
        return Real;
    }

    public void setReal(double x) {
        Real = x;
    }

    public double getImag() {
        return Imag;
    }

    public void setImag(double y) {
        Imag = y;
    }
    @Override
    public String toString() {
        String str ;
        double x = Real;
        double y = Imag;
        if(x != 0){ 
            str = String.format("%.0f", x);
                if (y  > 0 ){
                    str += String.format("+%.0fi", y);
                } else if(y < 0)
                    str += String.format("%.0fi", y);
        }else if(y != 0){ 
            str = String.format("%.0fi", y);
        }else str = String.format("%.0f", x);
    return str;     
    }
}