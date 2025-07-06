import java.util.*;

public class array {
    public static void main(String[] args){
    Random rnd = new Random();
    int Try = 10000;
    int Faces = 6;
    int win[] = new int[Faces + 1];
    double p[] = new double[Faces+1];
    int k;
    for(int i = 0; i < Try; i++){
        k = rnd.nextInt(Faces) + 1;
        win[k]++;
    }

    for(int j = 1; j < Faces +1; j++){
        p[j] = (double)win[j]/Try;
        System.out.format("p%d = %d/%d = %.2f%%\n", j, win[j], Try, 100*p[j]);
    }

    }
}
