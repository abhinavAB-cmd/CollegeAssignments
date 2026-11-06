public class colSum {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int colSum = 0;
        for (int j = 0; j < array[0].length; j++) {
            colSum = 0;
            for (int i = 0; i < array.length; i++) {
                colSum += array[i][j];
            }
            System.out.println("Column " + j + ": " + colSum);
        }
    }
}
