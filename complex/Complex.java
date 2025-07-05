public class Complex {
    private double Real;
    private double Imag;

    public Complex() {
        this.Real = 0;
        this.Imag = 0;
    }

    public Complex(double x) {
        this.Real = 0;
        this.Imag = 0;
    }

    public Complex(double x, double y) {
        Real = x;
        Imag = y;
    }

    public double getReal() {
        return Real;
    }

    public void setReal(double x) {
        this.Real = x;
    }

    public double getImag() {
        return Imag;
    }

    public void setImag(double y) {
        this.Imag = y;
    }

    @Override
    public String toString() {
        String str = "" ;
        if(Real != 0){ 
            str = String.format("%f", Real);
        }else str = str + String.format("%fi", Imag);

        if(Imag != 0){ 
            if(Imag < 0){
                
                str = String.format("%fi", Imag);
            }else str = String.format("%fi", Imag);
        }else str = String.format("%f", Imag);
    return str;
        
        
    }
}
