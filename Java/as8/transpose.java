public class transpose {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = array.length;
        int cols = array[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = array[i][j];
            }
        }

        // Print the transposed array
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed.length; j++) {
                System.out.print(transposed[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
