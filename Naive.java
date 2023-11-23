public class Naive {

    static void search(String pat, String txt)
    {
        int m = pat.length();
        int n = txt.length();
        int i = 0, j = n - 1;

        for (i = 0, j = n - 1; j < m;) {

            if (txt.equals(pat.substring(i, j + 1))) {
                System.out.println("Pattern found at index "
                        + i);
            }
            i++;
            j++;
        }
    }

    public static void main(String args[])
    {
        String pat = "anvbfhefnewjkfnawkjegwjensf";
        String txt = "jensf";
        search(pat, txt);
    }
}