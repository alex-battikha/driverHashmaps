package westview.ds;

public class StackADT {
    static Queue3<Integer> q1;
    static Queue3<Integer> q2;

    static void push(int x) {
        // Push x first in empty q2
        q2.add(x);

        while (!q1.empty()) {
            q2.add(q1.peek());
            q1.remove();
        }

        Queue3<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }

    static void pop()
    {
        // if no elements are there in q1
        if (q1.empty()) {
            return;
        }
        q1.remove();
    }

    static int size() { 
    	return q1.size(); 
    }

	// driver code
//	public static void main(String[] args) {
//	    Stack s = new Stack();
//	    s.push(1);
//	    s.push(2);
//	    s.push(3);
//	}
}
