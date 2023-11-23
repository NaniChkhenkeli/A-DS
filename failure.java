public class failure {

    public static int[] buildFailureFunction(String pattern) {
        int m = pattern.length();
        int[] failureFunction = new int[m];
        int length = 0;
        int i = 1;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                failureFunction[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = failureFunction[length - 1];
                } else {
                    failureFunction[i] = 0;
                    i++;
                }
            }
        }

        return failureFunction;
    }

    public static void main(String[] args) {
        String b = "010101";


        int[] failureFunctionB = buildFailureFunction(b);

        System.out.println("Failure Function for b:");
        for (int value : failureFunctionB) {
            System.out.print(value + " ");
        }


    }
}
