public class printSmallestIndex {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 4};
        int smallestIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[smallestIndex]) {
                smallestIndex = i;
            }
        }

        System.out.println("Smallest : " + arr[smallestIndex] + " at index " + smallestIndex);
    }   
}
