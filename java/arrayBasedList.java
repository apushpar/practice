class arrayBasedList{
/*
implements a normal constructor
implements a custom constructor which takes the first value
addItem method commented out
*/
	public static int lastItem;
	private int[] a;

	public arrayBasedList(){
		a = new int[10];
		lastItem = -1;
	}

	public arrayBasedList(int value){
		a = new int[10];
		a[0] = value;
		lastItem = 0;
	}
	
	public void insertItem(int value, int location){
		for (int i=lastItem;i>=location ;i-- ) {
			a[i+1] = a[i];
			
		}
		a[location] = value;
		lastItem++;
	}

	/*public void addItem(int value){
		int j = lastItem + 1;
		a[j] = value;
		lastItem++;
	}*/

	public int[] getList(){
		int[] x = new int[lastItem+1];
		for (int i=0;i<=lastItem ;i++ ) {
			x[i] = a[i];
		}
		return x;

	}

	public static void main(String[] args){
		int[] display;
		arrayBasedList myList  = new arrayBasedList(3);
	
		myList.insertItem(7,0);
		myList.insertItem(5,1);
		myList.insertItem(9,1);
		display = myList.getList();

		for (int i = 0;i<display.length ;i++ ) {
			System.out.println(display[i]);
		}

	}
}
