public class TwoStack {
    private int[] arr;
    private int size;
    private int top1, top2;

    public TwoStack(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = n / 2;
    }
    public void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        } else {
            System.out.println("Stack 1 Overflow");
        }
    }
    public void push2(int x) {
        if (top2 < size) {
            top2++;
            arr[top2] = x;
        } else {
            System.out.println("Stack 2 Overflow");
        }
    }

    public int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            System.out.println("Stack 1 Underflow");
            return -1;
        }
    }

    public int pop2() {
        if (top2 > size / 2) {
            int x = arr[top2];
            top2--;
            return x;
        } else {
            System.out.println("Stack 2 Underflow");
            return -1;
        }
    }

    public static void main(String[] args) {
        TwoStack ts = new TwoStack(6);
        ts.push1(5);
        ts.push1(10);
        ts.push1(15);
        ts.push1(20);

        ts.push2(11);
        ts.push2(7);

        System.out.println("Popped element from stack 1 is " + ts.pop1());
        System.out.println("Popped element from stack 2 is " + ts.pop2());
    }
}
