/** Source code example for "A Practical Introduction to Data
    Structures and Algorithm Analysis, 3rd Edition (Java)" 
    by Clifford A. Shaffer
    Copyright 2008-2011 by Clifford A. Shaffer
 */

/** Linked list implementation */
class SingleLinkedList<E> implements List<E> {
	private Link<E> head;         // Pointer to list header
	private Link<E> tail;         // Pointer to last element
	protected Link<E> curr;       // Access to current element
	int cnt;		      // Size of list

	/** Constructors */
	SingleLinkedList(int size) { this(); }   // Constructor -- Ignore size
	SingleLinkedList() {
		head = tail = curr = new Link<E>(null);
		cnt = 0;
	}
	
	@Override
	public void clear() {
		head = tail = curr = new Link<E>(null);
		cnt = 0;
	}
	@Override
	public void insert(E item) {
		Link<E> temp  = new Link<E>(item, curr.next());
		curr.setNext(temp);
		
		if(tail == curr)
			tail = curr.next();
		cnt ++;
		return ;		
	}
	@Override
	public void append(E item) {
		Link<E> temp  = new Link<E>(item, null);
		tail.setNext(temp);
		tail = temp;
		cnt ++;
		
	}
	@Override
	public E remove() { //remove the current element
		if(curr.next()==null)
			System.out.println("null");
		Link<E> temp = curr.next();
		if(temp == tail) 
			tail = curr; 
		curr.setNext(curr.next().next());
		cnt --;
		return temp.element();
	}
	@Override
	public void moveToStart() {
		curr = head;
		return ;		
	}
	@Override
	public void moveToEnd() {
		curr= tail;
		return;		
	}
	@Override
	public void prev() {
		assert curr!=head : "first element";		
		Link<E> temp = head;
		while(temp.next() != curr)
			temp = temp.next();
		curr = temp;
		return;
		
	}
	@Override
	public void next() {
		assert curr!=tail : "final element";
		curr = curr.next();
		return;
	}
	@Override
	public int length() {
		return cnt;
	}
	@Override
	public int currPos() {
		Link<E> temp = head;
		int pos;
		for (pos =0; temp != curr; pos++)
			temp = temp.next();
		return pos;
	}
	@Override
	public void moveToPos(int pos) {
		assert (pos<=cnt) && (pos>=0) :"out of range";
		Link<E> temp = head;
		for(int i=0; i == pos; i++)
			temp = temp.next();
		curr = temp;
		return;
		
	}
	@Override
	public E getValue() {
		if (curr.next()==null) return null;
		return curr.next().element();
	}
}