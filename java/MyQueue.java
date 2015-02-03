import java.util.Stack;

public class MyQueue{

	private Stack mainStack;
	private Stack buffer;
	public MyQueue(){

		mainStack = new Stack();
		buffer = new Stack();


	}


	public void add(int val){

			if (mainStack.empty()) {
				mainStack.push(val);
			}
			else{
				while(!mainStack.empty()){
					buffer.push(mainStack.pop());
				}
				buffer.push(val);

				while(!buffer.empty()){
					mainStack.push(buffer.pop());
				}
			}


	}

	public int remove(){

		if (mainStack.empty()) {
			return -1;
		}

		return ((Integer)mainStack.pop()).intValue();
	}


	public static void main(String[] args) {
		
		MyQueue mq = new MyQueue();
		mq.add(1);
		//mq.add(2);
		//mq.add(3);
		//mq.add(4);

		System.out.println(mq.remove());
		System.out.println(mq.remove());
		System.out.println(mq.remove());

	}
}