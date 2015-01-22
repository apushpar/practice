public class SList{

	private SListNode head;
	private int size;

	public SList(){
		head = null;
		size = 0;
	}

	public boolean isEmpty(SList list){
		
		return size == 0;
	}

	public int length(SList list){
		return size;
	}

	public void insertFront(Object obj){
		
		head = new SListNode(obj, head);
		size++;	

	}

	public void insertEnd(Object obj){
		if(head != null){
			SListNode current = head;
			
			while(current.next != null){
				current = current.next;
			}
			current.next = new SListNode(obj);

		}
		else{
			head = new SListNode(obj);
		}
		size++;

	}

	public String toString(){
		SListNode current = head;
		String result = "[ ";
		while(current != null){
			result += current.item.toString() + " ";
			current = current.next;
		}
		result += " ]";
		return result;
	}

	public void removeDuplicates(){
		SListNode current = head;

		while(current != null){
			SListNode runner = current.next;
			SListNode prev_runner = current;

			while(runner != null){

				if(!current.item.equals(runner.item)){
					runner = runner.next;
					prev_runner = prev_runner.next;

				}else{
					prev_runner.next = runner.next;
					runner = runner.next;
				}
			}
			current = current.next;


		}

	}


	public static void main(String[] args){

		
		SList l1 = new SList();
		l1.insertFront(new Integer(1));
		l1.insertEnd(new Integer(2));
		l1.insertEnd(new Integer(2));
		l1.insertEnd(new Integer(1));
		
		System.out.println(l1.toString());

		l1.removeDuplicates();

		System.out.println(l1.toString());

	}

}