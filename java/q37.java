import java.util.LinkedList;

public class q37 {
	

	private LinkedList dogQ;
	private LinkedList catQ;
	private int tracker;

	public q37(){
		dogQ = new LinkedList();
		catQ = new LinkedList();
		tracker = 0;
	}

	public void enqueue(String animal, String name){

		if (animal.equals("dog")) {

			dogQ.addLast(tracker);
			dogQ.addLast(name);
			tracker++;

		}else {

			catQ.addLast(tracker);
			catQ.addLast(name);
			tracker++;
			
		}

	}

	public String dequeueAny(){

		int catIndex;
		int dogIndex;
		if (catQ.peekFirst() != null) {
			catIndex = ((Integer)catQ.remove()).intValue();	
		}else{ 
			catIndex = Integer.MAX_VALUE;
		 }
		
		if (dogQ.peekFirst() != null) {
			dogIndex = ((Integer)dogQ.remove()).intValue();	
		}else {
			dogIndex = Integer.MAX_VALUE;
		}
		
		if (catIndex == dogIndex) {
			return null;
		}

		if (dogIndex < catIndex) {
			//dogQ.remove();
			return dogQ.remove().toString();
		}else {
			//catQ.remove();
			return catQ.remove().toString();
		}

	}

	public String dequeueDog(){
		if (dogQ.peekFirst() == null) {
			return null;
		}
		dogQ.remove();
		return dogQ.remove().toString();
	}

	public String dequeueCat(){
		if (catQ.peekFirst() == null) {
			return null;
		}
		catQ.remove();
		return catQ.remove().toString();
	}

	public static void main(String[] args) {

		q37 newQ = new q37();
		newQ.enqueue("dog", "albert");
		newQ.enqueue("dog", "bob");
		newQ.enqueue("cat", "cattie");
		newQ.enqueue("dog", "dogbert");
		newQ.enqueue("cat", "elf");

		System.out.println(newQ.dequeueCat());
		
	}
}