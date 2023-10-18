public class QuickSort {
    int partition (int a[],int start, int end) {
        int pivot = a[end];
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++) {
            if(a[j] < pivot) {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t =a[i+1];
        a[i+1] = a[end];
        a[end] = t;
        return(i+1);
    }

    void quick(int a[], int start, int end) {
        if(start < end) {
            int p = partition(a, start, end);
            quick(a,start, p-1);
            quick(a, p+1, end);
        }
    }

    void printArr(int a[], int n) {
        int i;
        for (i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = {13,12,14,65,87,25,2,13,54} ;
        int n = a.length;
        System.out.println("before ");
        QuickSort q1 = new QuickSort();
        q1.printArr(a,n);
        q1.quick(a,0,n-1);
        System.out.println("after ");
        q1.printArr(a,n);
        System.out.println();
    }
}
