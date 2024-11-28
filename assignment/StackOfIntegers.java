//10.5
import java.util.ArrayList;

public class StackOfIntegers {
    private ArrayList<Integer> elements;

    public StackOfIntegers() {
        elements = new ArrayList<>();
    }

    public void push(int value) {
        elements.add(value);
    }

    public int pop() {
        if (!elements.isEmpty()) {
            return elements.remove(elements.size() - 1);
        }
        return -1; 
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}
