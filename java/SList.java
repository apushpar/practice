import java.util.Hashtable;

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

	public void insertEnd(SListNode node){
		if(head != null){
			SListNode current = head;
			
			while(current.next != null){
				current = current.next;
			}
			current.next = new SListNode(node.item);

		}
		else{
			head = new SListNode(node.item);
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

	public String nToLast(int n){

		if(size <= 0){
			return "Empty List";
		}
		if(n > size){
			return "n is greater than size of the list";
		}

		int index = 1;
		String result = "[ ";
		SListNode current = head;

		while(current != null){
			if(n <= index){
				result += current.item.toString() + " ";
			}
			index++;
			current = current.next;
		}
		result += "]";
		return result;

	}
//	
	public static boolean deleteRestrictedNode(SListNode node){
		if(node == null || node.next == null){
			return false;
		}
		//this
		SListNode next = node.next;
		node.item = next.item;
		node.next = next.next;
		return true;
		//System.out.println(next.item);
	//	this.item = this.next.item;
	//	this.next = this.next.next;

	}
//
	public void partition(int x){
		SListNode pointer1 = head.next;
		SListNode pointer2 = head;
		Object temp1;
		while(pointer1 != null){
			if((int) pointer1.item > x){
				pointer2 = pointer1;
				pointer1 = pointer1.next;
			}
			else{
				temp1 = pointer2.item;
				pointer2.item = pointer1.item;
				pointer1.item = temp1;
				pointer2 = pointer1;
				}				

			pointer1 = pointer1.next;
		}
		
	}

	public int listToNumberReverse(){

		int i = 1;
		int result = 0;
		SListNode current = head;
		while(current != null){
			result += i*(int)current.item;
			current = current.next;
			i = i*10;
		}

		return result;
	}

	public int listToNumber(){

		int i = 1;
		int result = 0;
		SListNode current = head;
		int multFactor = 1;
		while(i < size){
			multFactor = multFactor * 10;
			i++;
		}

		while(current != null){
			result += multFactor*(int)current.item;
			current = current.next;
			multFactor = multFactor/10;
		}

		return result;
	}	

	public SList addReverse(SList node){
		int number1 = this.listToNumberReverse();
		int number2 = node.listToNumberReverse();
		SList newList = new SList();

		int result = number1 + number2;
		int divFactor = 10;
		newList.insertEnd(result%divFactor);
		result = result/divFactor;
		while(result > 0){
			newList.insertEnd(result%divFactor);
			result = result/divFactor;
		}
		
		return newList;

	}

	public SList addNormal(SList node){
		int number1 = this.listToNumber();
		int number2 = node.listToNumber();
		SList newList = new SList();

		int result = number1 + number2;
		int divFactor = 10;
		newList.insertFront(result%divFactor);
		result = result/divFactor;
		while(result > 0){
			newList.insertFront(result%divFactor);
			result = result/divFactor;
		}
		
		return newList;
	}

	public boolean palindrome(){

		SListNode current = head;
		int i = 1;
		int j = (size/2);
		int comparator;
		Hashtable<Integer,Integer> prevStore = new Hashtable<Integer, Integer>();
		if (size%2 == 0) {
				comparator = (int)size/2;
		}else{
				comparator = ((int)size/2) + 1;
		}
		
		while(current != null){

				if (i > comparator) {
					
					if (!prevStore.get(j).equals(current.item)) {
							return false;
						}
					j--;
				}
				else{
					prevStore.put(i,(int)current.item);
				}

				current = current.next;
				i++;
			}
			return true;
		
	}

public SListNode findCorrupt(){

	SListNode fast = head;
	SListNode slow = head;

	if (fast == null || fast.next == null) {
			return null;
		}	

	while(fast.next != null){
		//System.out.println(slow.toString()+"  "+fast.toString());
		slow = slow.next;
		fast = fast.next.next;
		if (fast.equals(slow)) {
			break;
		}
		//slow = slow.next;
		//fast = fast.next.next;
	}

	if (fast.next == null || slow.next == null) {
		return null;
	}

	slow = head;
	//System.out.println(slow.toString()+"  "+fast.toString());
	while(fast != null){
		if (fast.equals(slow)) {
			return slow;
		}
		slow = slow.next;
		fast = fast.next;
	}
	return null;
}

public void insertSListNode(SListNode node){

	node.next = head;
	head = node;
}

	public static void main(String[] args){

		/*
		SList l1 = new SList();
		l1.insertFront(new Integer(5));
		l1.insertEnd(new Integer(2));
		l1.insertEnd(new Integer(3));
		l1.insertEnd(new Integer(4));
		l1.insertEnd(new Integer(1));
		
		System.out.println(l1.toString());

		l1.removeDuplicates();

		System.out.println(l1.toString());

		System.out.println(l1.nToLast(5));
		*/
		SListNode a = new SListNode(new Integer(1));
		SListNode b = new SListNode(new Integer(2));
		SListNode c = new SListNode(new Integer(3));
		SListNode d = new SListNode(new Integer(4));
		SListNode e = new SListNode(new Integer(5));
		SList l2 = new SList();
		l2.insertSListNode(a); //1
		l2.insertSListNode(b); //2
		l2.insertSListNode(b); //3
		l2.insertSListNode(d); //4
		l2.insertSListNode(e); //5 [5,4,3,1,1]

		System.out.println(l2.findCorrupt().toString()); //how to handle the null case???

		//System.out.println(l2.toString());
/*
//		c.deleteRestrictedNode();
		l1.partition(2);

		System.out.println(l1.toString());
		
		SList l3 = new SList();
		l3.insertFront(new Integer(3));
		l3.insertFront(new Integer(1));
		l3.insertFront(new Integer(2));
		l3.insertFront(new Integer(0));
		l3.insertFront(new Integer(2));
		l3.insertFront(new Integer(1));
		l3.insertFront(new Integer(3));

		System.out.println(l3.toString());

		SList l4 = new SList();
		l4.insertFront(new Integer(2));
		l4.insertFront(new Integer(9));
		l4.insertFront(new Integer(5));		

		//System.out.println(l4.toString());
		//System.out.println(l3.listToNumber());
		//System.out.println(l3.addReverse(l4).toString());
		//System.out.println(l3.addNormal(l4).toString());
		System.out.println(l3.palindrome());
		*/
	}

}