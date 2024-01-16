package org.example;

import java.util.HashSet;

class MinimumRange {

    public static void findMinimumRange(int[] arr, int k) {
        int n = arr.length;
        int start = -1, end = -1;
        HashSet<Integer> distinctElements = new HashSet<>();

        for (int i = 0; i < n; i++) {
            distinctElements.clear();

            for (int j = i; j < n; j++) {
                distinctElements.add(arr[j]);

                if (distinctElements.size() == k) {
                    start = i;
                    end = j;
                    break;
                }

                // Break if not enough elements left to form a subarray of size k
                if (j == n - 1) {
                    break;
                }
            }

            // Break if not enough elements left to form a subarray of size k
            if (i + k > n) {
                break;
            }
        }

        if (start == -1 || end == -1) {
            System.out.println("Invalid k");
        } else {
            System.out.println(start + " " + end);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 3, 3, 4, 5};
        int k1 = 3;
        findMinimumRange(arr1, k1);

        int[] arr2 = {1, 2, 2, 3};
        int k2 = 2;
        findMinimumRange(arr2, k2);

        int[] arr3 = {1, 1, 2, 1, 2};
        int k3 = 3;
        findMinimumRange(arr3, k3);
    }
}
