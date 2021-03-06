import java.util.Scanner;

public class Main {
	private final static int SUBMIT = 1;
	private final static int SIZE = 2;
	private final static int VIEW_TOP = 3;
	private final static int VIEW_BOTTOM = 4;
	private final static int GET_TOP = 5;
	private final static int GET_BOTTOM = 6; 
	private final static int ERROR = 7;
	
	public static void main(String[] args) {
		System.out.println("Please write a command (submit [FILE NAME]/size/view_top/view_bottom/get_top/get_bottom)");
		System.out.print("--> ");
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		DSBox box = new DSBox();
		String document;
		
		while(scanner.hasNext()){
			String command = scanner.next();
			switch(getCommandNum(command)){
			case SUBMIT:
				document = scanner.next();
				box.submit(document);
				System.out.println("SUBMIT: " + document);
				break;
			case SIZE:
				System.out.println("CURRENT SIZE: " + box.size());
				break;
			case VIEW_TOP:
				document = box.view_top();
				if(document!=null)
					System.out.println("TOP: " + document);
				break;
			case VIEW_BOTTOM:
				document = box.view_bottom();
				if(document!=null)
					System.out.println("BOTTOM: " + document);
				break;
			case GET_TOP:
				document = box.get_top();
				if(document!=null)
					System.out.println("GET: " + document);
				break;
			case GET_BOTTOM:
				document = box.get_bottom();
				if(document!=null)
					System.out.println("GET: " + document);
				break;
			
			}
			System.out.print("--> ");
		}
	}
	
	private static int getCommandNum(String cmd){
		if(cmd.equals("submit"))
			return SUBMIT;
		else if(cmd.equals("size"))
			return SIZE;
		else if(cmd.equals("view_top"))
			return VIEW_TOP;
		else if(cmd.equals("view_bottom"))
			return VIEW_BOTTOM;
		else if(cmd.equals("get_top"))
			return GET_TOP;
		else if(cmd.equals("get_bottom"))
			return GET_BOTTOM;
		return ERROR;
	}

}
