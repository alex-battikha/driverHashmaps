package westview.ds;

public class LinkedList {

	Node head;
	private int size;
	
	// Comments
	public LinkedList() {
		head = null;
		size = 0;
	}
	
	// return size of linked list
	public int size() {
		return size;
	}
	
	// Outputs list as string
	public String toString() {
		String allNodes = "[";
		
		
		return allNodes;
	}
	
//	public Node remove(int n) {
//		
//	}
	
	// Adding Node
	public void add(Node n) {
		if(head == null) {
		    head = n;
		} else {
		    Node curr = head;
		    while(curr.next != null) {
		        curr = curr.next;
		    }
		    curr.next = n;
		}
		size++;
	}
	
//	/* comments to be completed */
//	public Node get(int index){
//	    return getNode; 
//	}
	
}