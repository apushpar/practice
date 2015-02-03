
public class stackStuff {


	public static void main(String[] args) {
		Stack s1 = new Stack();
		s1.newPush(3);
		s1.newPush(2);
		s1.newPush(5);
		s1.newPush(1);
		s1.newPush(6);
		s1.newPush(5);
		s1.newPush(4);
		s1.newPush(0);
		s1.newPush(3);
		System.out.println(s1.toString());
		
		System.out.println(s1.newPop());
		System.out.println(s1.newPop());
		System.out.println(s1.newPop());
		System.out.println(s1.newPop());
		System.out.println(s1.newPop());
		System.out.println(s1.newPop());
		System.out.println(s1.newPop());
		System.out.println(s1.newPop());
		System.out.println(s1.newPop());

		//System.out.println(s1.toString());

	}
	
}