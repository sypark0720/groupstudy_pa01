/**
 * Implement this class using SingleLinkedList
 * @author DMLab
 *
 */
public class DSBox {
	//field
	private SingleLinkedList<String> list;
	
	//Constructor
	DSBox(){
		this.list =  new SingleLinkedList<String>();
	}
	
	//methods
	public void submit(String document){
		list.append(document);
		return;		
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_top(){
		if (list.cnt==0) 
			return "Box is empty";
		list.moveToEnd();
		list.prev();
		String top = list.remove();
		return  top;
	}
	
	/**
	 * 
	 * @return
	 */
	public String get_bottom(){
		if (list.cnt==0) 
			return "Box is empty";
		list.moveToStart();
		String bottom = list.remove();
		return bottom;
	}
	
	/**
	 * 
	 * @return
	 */
	public String view_top(){
		if (list.cnt==0) 
			return "Box is empty";
		list.moveToEnd();
		list.prev();
		String top = list.getValue();
		return top;
	}
	
	/**
	 * 
	 * @return
	 */
	public String view_bottom(){
		if (list.cnt==0) 
			return "Box is empty";
		list.moveToStart();
		String bottom = list.getValue();
		return bottom;
	}
	
	/**
	 * 
	 * @return
	 */
	public int size(){
		return list.cnt;
	}
}
