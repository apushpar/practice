import java.util.Stack;

public class stackSort{

	public static Stack sort(Stack source){
		Stack buff = new Stack();
		//Stack source = this;
		if (source.empty()) {
			return null;
		}

		buff.push(source.pop());

		while(!source.empty()){
			int temp = ((Integer)source.pop()).intValue();
			int i=0;
			if (temp > ((Integer)buff.peek()).intValue()) {
				buff.push(temp);
			}else{
				while(!buff.empty()){

					if (temp < ((Integer)buff.peek()).intValue()) {
						source.push(buff.pop());
						i++;	
					}else{
						break;
					}
					
				}
				buff.push(temp);
				while(i > 0){
					buff.push(source.pop());
					i--;
				}
			}
			
			
		}
		return buff;

	}

	public static void main(String[] args) {

		Stack s = new Stack();
		s.push(1);
		s.push(3);
		s.push(2);
		s.push(5);
		s.push(4);

		Stack res = sort(s);
		System.out.println(res.pop());
		System.out.println(res.pop());
		System.out.println(res.pop());
		System.out.println(res.pop());
		System.out.println(res.pop());
		
	}
}