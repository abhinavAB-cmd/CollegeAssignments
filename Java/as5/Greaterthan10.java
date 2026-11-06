public class Greaterthan10 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 8, 20, 3, 15};
        System.out.println("Elements greater than 10:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
