public class DutchFlagSort {
    public static void dutchFlagSort(int[] arr) {
        int low = 0;            // Pointer for the region of 0s
        int mid = 0;            // Pointer for the region of 1s
        int high = arr.length - 1; // Pointer for the unprocessed region

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {  // arr[mid] == 2
                swap(arr, mid, high);
                high--;
            }
        }
    }

    // Helper function to swap two elements in an array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,1,6,7,8,9,10};

        System.out.print("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        dutchFlagSort(arr);

        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
