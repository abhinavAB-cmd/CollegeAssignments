import java.util.*;
public class Fact_nPr {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();
        System.out.println(n+ "P" + r + " = " + nPr(n, r));
        sc.close();
    }
    public static int Fact(int n)
    {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static int nPr(int n, int r)
    {
        return Fact(n) / Fact(n - r);
    }
}
