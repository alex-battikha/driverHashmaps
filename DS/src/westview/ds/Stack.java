package westview.ds;
import java.util.ArrayList; 

public class Stack<T> {
    // Implement storing the data using a 1D array
    private ArrayList<T> data;

    // Add a constructor
    public Stack() {
        data = new ArrayList<T>();
    }

    // Add a getter called pop
    public T pop() {
        if (data.size() == 0) {
            return null;
        }

        return data.remove(data.size() - 1);
    }

    // Add a method to return the element at the top without removing it, return null if empty.
    public T peek() {
        if (data.size() == 0) {
            return null;
        }

        return data.get(data.size() - 1);
    }

    // Add a method to return the # of elements in the Stack
    public int size() {
        return data.size();
    }

    // Add a method to return true if the stack is empty, false otherwise
    public boolean empty() {
        return data.isEmpty();
    }

    // Add a setter called push
    public void push(T element) {
        data.add(element);
    }
}