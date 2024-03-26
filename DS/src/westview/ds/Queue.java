package westview.ds;

import java.util.ArrayList;

public class Queue<T> {
	//implement storing the data using a 1D array
	private ArrayList<T> data;
	
	//add a constructor
	public Queue() {
		data = new ArrayList<T>();
	}
	
	///add a getter called pop
	public T pop() {
		if(data.size()==0) {
			return null;
		}
		
		return data.remove(0);
	}
	
	public T peek() {
		if(data.size()==0) {
			return null;
		}
		
		return data.get(0);
		
	}
	
	//add a size method that return the # of elements in the Stack
	
	
	
	//add a setter called push
	public void push(T element) {
		data.add(element);
	}

	public int size() {
		// TODO Auto-generated method stub
		return data.size();
	}
}
