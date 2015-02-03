public class newStack {
	

	private static int startPoint = 0;
	private static int range = 10;
	private static int[] arr = new int[30];
	//private static int sizeAll = 10;
	private int size;
	private int start;

	public newStack(){
		start = startPoint;
		startPoint = startPoint + range;
		size = 0;
	}

	public void push(int val){
		
		arr[start+size] = val;
		size++;
	}

	public int pop(){
		int retVal  = arr[start+size-1];
		size--;
		return retVal;
	}

	/*public display(){

		for (int i=0;i< ; ) {
			
		}
	}*/

	public static void main(String[] args) {
		
		newStack ns1 = new newStack();

		ns1.push(1);
		ns1.push(2);
		ns1.push(3);

		newStack ns2 = new newStack();
		ns2.push(4);
		ns2.push(5);
		ns2.push(6);

		System.out.println(ns1.pop());
		System.out.println(ns2.pop());
	}
}