package westview.ds;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueTest {


	@Test
	void test() {
		Stack<Integer> myStack = new Stack<Integer>();
		
		assert(myStack.size()==0);
		
		assert(myStack.pop() == null);
		
		assert(myStack.peek()==null);
		
		myStack.push(7);
		myStack.push(11);
		assert(myStack.size()==2);
		assert(myStack.peek()==11);
		
		assert(myStack.pop()==11);
		
		assert(myStack.peek()==2);
	}

}
