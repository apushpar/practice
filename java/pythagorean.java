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

	public static void findTriplet(){
		int k;
		for (int i=2;i <=499 ;i++ ) {
			for (int j=i+1; i+j <=995 ;j++ ) {
				k = 1000 - i - j;
		//		System.out.println(i+", "+j+", "+k);
				int iSq = i*i;
				int jSq = j*j;
				int kSq = k*k;
				int ijSq = iSq + jSq;
				if (ijSq == kSq) {
						//return i+", "+j+", "+k;
					System.out.println(i+", "+j+", "+k);
					}	
			}
			
		}
		//return "No Match";

	}


	public static void main(String[] args){

		int[] sampleSet = {1,2,3,4,5,12,13,40};
		//findAll(sampleSet);
		//System.out.println(findTriplet());
		findTriplet();

	}


}