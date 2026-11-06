public class PrintingRow {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };


        // Print the 2D array row by row
        for (int i = 0; i < array.length; i++) {
            if(i==0||i==array.length-1){
                if(i==0){
                    System.out.print("First row: ");
                } else {
                    System.out.print("Last row: ");
                }
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
            }
        }
    }
}
