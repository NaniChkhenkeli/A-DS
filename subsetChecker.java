package org.example;
public class subsetChecker {
    // Function to check if arr2[] is a subset of arr1[]
    static boolean isSubset(int[] arr1, int[] arr2, int m, int n) {
        // Using nested loops to compare each element
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < m; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            // If any element of arr2 is not found in arr1, return false
            if (!found) {
                return false;
            }
        }
        // All elements of arr2 are found in arr1, return true
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 4, 8};
        int m = arr1.length;
        int n = arr2.length;

        if (isSubset(arr1, arr2, m, n)) {
            System.out.println("arr2[] is a subset of arr1[]");
        } else {
            System.out.println("arr2[] is not a subset of arr1[]");
        }
    }
}
