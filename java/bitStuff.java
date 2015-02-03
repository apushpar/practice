public class bitStuff{

	public static String getInBits(int intValue){
		StringBuffer result = new StringBuffer();
		
		int bits;
		while (intValue > 0){
			bits = intValue%2;
			intValue = intValue/2;

			result.insert(0, bits);

		}
		return result.toString();

	}
// recursive approach ??
	public static String getInBitsReverse(int intValue){
		StringBuffer result = new StringBuffer();
		
		int bits;
		while (intValue > 0){
			bits = intValue%2;
			intValue = intValue/2;

			result.append(bits);

		}
		return result.toString();

	}	

	public static int setBit(int intValue){
		int setBitCount = 0;
		
		int bits;

		while (intValue > 0){
			bits = intValue%2;
			intValue = intValue/2;
			if (bits == 1) {
				setBitCount++;
			}

		}
		return setBitCount;

	}	

	public static int msb(int intValue){
		int bits;
		while (intValue > 0){
			bits = intValue%2;
			intValue = intValue/2;

			if (intValue <= 0) {
				return bits;
			}
			
		}
		return -1;
		
	}

	public static void main(String[] args){

		int testInt = 4;
		System.out.println(getInBits(testInt));
		System.out.println(msb(testInt));
		System.out.println(setBit(testInt));

	}
}