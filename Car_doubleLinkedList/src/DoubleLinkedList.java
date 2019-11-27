
public class DoubleLinkedList {
	public Node header;
	public Node tail;
	
	public DoubleLinkedList(){
		header=null;
		tail=null;
		
	}
	public void appendtohead(Car item) {
		Node newnode= new Node(item);
		if(header==null) {
			header = newnode;
			tail=newnode;
		}
		else {
			header.Blink= newnode;
			newnode.Flink=header;
			header=newnode;
		}
		
	}
	public void appendtotail(Car item) {
		Node newnode= new Node(item);
		if (tail == null) {
			tail = newnode;
			header = newnode;
		}
		else {
			newnode.Blink=tail;
			tail.Flink=newnode;
			tail=newnode;
		}
		
		}
	public Node removefromhead() {
		Node temp = header;
		if( header == null) {
			System.out.println("there is no cars to remove");
			
		
		}
		else if(header.Flink == null) {
			header = null;
			
		}
		else if (header.Flink != null) {
			header=header.Flink;
			header.Blink=null;
		}
		return temp;
	}
	public Node RemoveFromTail() {
		Node temp=tail;
		if(tail != null) {
			tail=tail.Blink;
			tail.Flink=null;
		}
		else {
			
			System.out.println("there is no car to remove");
			
		}
		return temp;
		
	}
	public Node search(int Key, String model,String make) {
		Node temp= header;
		
		while (temp != null && temp.item.Year != Key && temp.item.Make != make && temp.item.Model != model) {
			temp=temp.Flink;
			
		}
		return temp;
		
	}
	public void delete (int Key, String model,String make ) {
		Node X = search(Key,model,make);
		if (X !=null) {
			if(X != header && X != tail ) {
		      X.Flink.Blink=X.Blink;
		      X.Blink.Flink= X.Flink;
			}
			
			if(X == header) {
				X.Flink.Blink=null;
				X.Flink=header;
			}
			else if (X == tail) {
				X.Blink.Flink=null;
				X.Blink=tail;
			}
			else if (X == header && X == tail) {
				header = null;
				tail = null;
			}
			System.out.println("Car has been deleted");
			
		}
		else {
			System.out.println("there is no such a Car to delete");
		}
		
		
	}
	
	}


