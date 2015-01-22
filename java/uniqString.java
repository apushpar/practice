public class uniqString {


	public boolean check(){
		String str = "";
		int len = str.length();
		for (int i=0;i<len ;i++ ) {
			for (int j=i+1;j<len ;j++ ) {
				if (str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args){

		String s = "43511f7)(^&$";
		//System.out.println(s.length());
		//System.out.println(s.check());
		String str = s;
		boolean state = false;
		int len = str.length();
		outerLoop:
		for (int i=0;i<len ;i++ ) {
			for (int j=i+1;j<len ;j++ ) {
				if (str.charAt(i) == str.charAt(j)) {
					state = true;			
					break outerLoop;
				}
			}
			
		}
		if(state){
			System.out.println("Match");	
		}
		else{
			System.out.println("no match");
		}
		

	}
}