class BinarySearch {
    int binarySearch (int arr[], int x) {

        // returns index of x if it is present in arr[]
        int l =0, r= arr.length -1 ;
        while (l <= r) {
            int m = l + (r - 1) / 2;

            // check if x is present at mid
            if(arr[m] == x)
                return m;

            if(arr[m] < x)
                l = m + 1;

            // if x is smaller, ignore right half
            else
                r = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch by = new BinarySearch();
        int arr[] = { 1, 2, 3, 12, 43,10};
        int n = arr.length;
        int x = 12;
        int result = by.binarySearch(arr, x);
        if(result == -1) {
            System.out.println(" element is not present (( ");
        } else {
            System.out.println("present element at index " + result);
        }
    }
}
