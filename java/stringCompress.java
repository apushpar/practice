import java.util.Hashtable;


public class stringCompress{


	public static void main(String[] args){

		String test = "Akshaya";

		int len = test.length();

		len = len - 1;

		
		String tmp;
		StringBuffer line = new StringBuffer();
		Hashtable<Integer, String> tmpStore = new Hashtable<Integer, String>();

		for (int i = 0;i<len ;i++ ) {
			tmpStore.put(i,String.valueOf(test.charAt(i)));
		}

		for (int j=len-1;j>=0 ;j--) {
			line.append(tmpStore.get(j));
		}
		System.out.println(line);
	}
}