public class countSteps2 {
    public static void main(String[] args) {
        int steps = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                steps++;
            }
        }
        System.out.println("Total steps: " + steps);
    }
}
