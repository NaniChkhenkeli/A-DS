public class BinaryCounter {
    public static int bits(int n) {
        if (n == 0) {
            return 0;
        }

        int count = 1 + (int)(Math.floor(Math.log((n & -n)) / Math.log(2)));

        return count;
    }

    public static void main(String[] args) {
        int n = 5;
        int bitsChanged = bits(n);
        System.out.println("number of bits changed" + n + " is " + bitsChanged);
    }
}
