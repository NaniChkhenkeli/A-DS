public class failureFunction {

    public static int[] computeFailureFunction(String pattern) {
        int m = pattern.length();
        int[] failure = new int[m];
        failure[0] = 0;
        int j = 0;

        for (int i = 1; i < m; i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = failure[j - 1];
            }

            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
            }

            failure[i] = j;
        }

        return failure;
    }

    public static void main(String[] args) {
        String pattern = "ababcab";
        int[] failure = computeFailureFunction(pattern);

        // Print the failure function values
        System.out.print("Failure Function: ");
        for (int value : failure) {
            System.out.print(value + " ");
        }
    }
}
