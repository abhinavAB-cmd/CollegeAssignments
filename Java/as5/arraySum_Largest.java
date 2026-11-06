public class arraySum_Largest {
    public static void main(String[] args) {
        int[] arr = {78, 34, 12, 28, 90};
        int sum = 0;
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Largest element in the array: " + largest);
    }
}
