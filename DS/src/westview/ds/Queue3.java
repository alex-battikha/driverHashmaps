package westview.ds;

import java.util.ArrayList;

public class Queue3<T> {
    private Stack<T> data;
    private Stack<T> data2;

    public Queue3() {
        data = new Stack<T>();
        data2 = new Stack<T>();
    }

    // Add a method to add element el to the queue
    public void add(T element) {
        data.push(element);
    }

    public T remove() {
        if (data2.empty()) {
            // Transfer elements from data stack to data2 stack
            while (!data.empty()) {
                data2.push(data.pop());
            }
        }
        // Pop from data2 (which now has elements in the correct order)
        return data2.pop();
    }

    public int size() {
        return data.size() + data2.size();
    }

    public T peek() {
        if (data2.empty()) {
            // Transfer elements from data stack to data2 stack
            while (!data.empty()) {
                data2.push(data.pop());
            }
        }
        return data2.peek();
    }

    public boolean empty() {
        return size() == 0;
    }

    public String toString() {
        String result = "[";

        // Append elements from data2
        Stack<T> tempData2 = new Stack<>();
        while (!data2.empty()) {
            tempData2.push(data2.pop());
        }
    
        while (!tempData2.empty()) {
            T element = tempData2.pop();
            result += element;
    
            data2.push(element);
            if (!tempData2.empty()) {
                result += ", ";
            }
        }
    
        // Append elements from data in correct order
        Stack<T> tempData = new Stack<>();
        while (!data.empty()) {
            tempData.push(data.pop());
        }
    
        while (!tempData.empty()) {
            T element = tempData.pop();
            result += element;
    
            data.push(element);
            if (!tempData.empty()) {
                result += ", ";
            }
        }
    
        result += "]";
        return result;
    }

}