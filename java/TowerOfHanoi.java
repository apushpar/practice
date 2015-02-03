public class TowerOfHanoi {

	private Stack towerStack;

	public TowerOfHanoi(){
		towerStack = new Stack();
	}

	public void push(int val){
		if (towerStack.peek() == -1) {
			towerStack.push(val);
		}else if (towerStack.peek() > val ) {
			towerStack.push(val);
		}else{
			System.out.println("Error storing disk in tower");
		}

	}

	public int pop(){
		if (towerStack.peek() != -1) {
			return towerStack.pop();
		}
		throw new IllegalArgumentException("n must be positive");
	}

	private void moveTop(TowerOfHanoi tower){
		tower.push(this.pop());
	}

	public void moveFromTo(int n, TowerOfHanoi buffer, TowerOfHanoi destination){
		if (n > 0) {
			this.moveFromTo(n-1, destination, buffer);
			this.moveTop(destination);
			buffer.moveFromTo(n-1, this, destination);	
		}
		
	}

	public static void main(String[] args) {
		
		TowerOfHanoi t1 = new TowerOfHanoi();
		TowerOfHanoi t2 = new TowerOfHanoi();
		TowerOfHanoi t3 = new TowerOfHanoi();
		int n = 5;
		for (int i = n;i > 0 ;i-- ) {
			t1.push(i);
		}

		t1.moveFromTo(n,t2,t3);

		for (int i = n;i > 0 ;i-- ) {
			System.out.println(t3.pop());
		}
	}
	
}