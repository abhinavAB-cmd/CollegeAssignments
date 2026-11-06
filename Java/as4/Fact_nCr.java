import java.util.*;
public class Fact_nCr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();
        System.out.println(n+ "C" + r + " = " + nCr(n, r));
        sc.close();
    }

    public static long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
    public static long nCr(int n, int r) {
        long nFactorial = factorial(n);
        long rFactorial = factorial(r);
        long nMinusRFactorial = factorial(n - r);

        return nFactorial / (rFactorial * nMinusRFactorial);
    }
    
}
