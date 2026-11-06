public class halvingN {
    public static void main(String[] args) {
        int n = 1024;
        int steps = 0;
        while (n > 1) {
            n /= 2;
            steps++;
        }
        System.out.println("Total steps: " + steps);
    }
}
