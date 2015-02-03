class SListNode{

	Object item;
	SListNode next;

	SListNode(Object value, SListNode node){

		item = value;
		next = node;

	}	

	SListNode(Object value){

		this(value, null);

	}

	public String toString(){
		if (this.equals("-1")) {
			return "no loop";
		}
		return this.item.toString();
	}	



}