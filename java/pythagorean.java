import java.util.HashMap;

public class pythagorean{
	
	public static void findAll(int[] source){

		HashMap<Integer, Integer> quickLook = new HashMap<Integer, Integer>();

		for (int i = 0; i < source.length ;i++ ) {
			
			quickLook.put((source[i] * source[i]), source[i]);

		}
		int checkValue;

		for (int j = 0; j < source.length; j++) {
			for (int k = j; k < source.length ;k++ ) {
				checkValue = (source[j] * source[j]) + (source[k] * source[k]);

				if (quickLook.containsKey(checkValue)) {

					System.out.println(source[j]+", "+source[k]+" ,"+quickLook.get(checkValue));
				}
			}
		}


	}


	public static void main(String[] args){

		int[] sampleSet = {1,2,3,4,5,12,13,40};
		findAll(sampleSet);

	}


}