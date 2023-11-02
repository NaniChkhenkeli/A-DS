import java.util.Stack;
public class Queue<T> {
    private Stack<T> stack1 = new Stack<>();
    private Stack<T> stack2 = new Stack<>();

    public void enqueue(T element) {
        stack1.push(element);
    }
    public T dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                return null; 
            }
            while (!stack1.isEmpty()) {
                T temp = stack1.pop();
                stack2.push(temp);
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();

        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");

        System.out.println(queue.dequeue()); // Prints "a"
    }
}
