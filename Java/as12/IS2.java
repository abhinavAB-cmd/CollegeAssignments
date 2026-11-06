public class IS2 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        insertionSort(arr);
        System.out.print("Sorted array: [");
        for (int num : arr) {
            System.out.print(num);
            if (num != arr[arr.length - 1]) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
}
