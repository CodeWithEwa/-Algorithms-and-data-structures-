import java.util.ArrayList;
import java.util.List;

class Queue {
    private List<Integer> queue;

    public Queue() {
        this.queue = new ArrayList<>();
    }

    public void add(int value) {
        queue.add(value);
    }

    public Integer remove() {
        return queue.isEmpty() ? null : queue.remove(0);
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        System.out.println("Removed: " + q.remove()); // Output: 1
    }
}