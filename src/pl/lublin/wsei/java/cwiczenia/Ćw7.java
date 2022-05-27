package pl.lublin.wsei.java.cwiczenia;

public class Ćw7 {

    public static void main(String[] args) {

        System.out.printf("\narg\t\tlog2(arg)\tsum(arg)\n");

        int arg = 1, sum = 0;
        double log;
        do {
            log = Math.log(arg) / Math.log(2);
            sum += arg;
            System.out.printf("%d\t\t\t%.0f\t\t\t%d\n", arg, log, sum);
            arg *= 2;
        } while (arg < 8);

    }
}
