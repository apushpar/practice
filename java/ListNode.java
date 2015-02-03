class ListNode{

	private int item;
	private ListNode next;

	public ListNode(int value, ListNode node){
		item = value;
		next = node;
	}

	public ListNode(int value){
		this(value, null);
	}
	
	public ListNode(){
		
	}

	public void insertNodeAfter(int value){
		/*node.next = this.next;
		node.item = value;
		this.next = node;*/
		next = new ListNode(value, next);
	}

	public getValue(int index){
		
	}

	public static void main(String[] args){
		ListNode l1 = new ListNode();
		ListNode l2 = new ListNode();
		ListNode l3 = new ListNode();
		//ListNode l4 = new ListNode();
		l1.item = 7;
		l2.item = 9;
		l3.item = 11;

		l1.next = l2;
		l2.next = l3;
		l3.next  = null;

		//l1.insertNodeAfter(13,l4); //insert node after l1
		l1.insertNodeAfter(13);
	}
}