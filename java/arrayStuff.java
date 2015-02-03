import java.util.HashMap;

public class arrayStuff{

	public static int findOccurance(int[] arr, int val){
		int count = 1;
		boolean flag = false;
		for (int i = 0;i < arr.length-1 ;i++ ) {
			
			if (arr[i] == val) {
				if (arr[i] == arr[i+1]) {
				count++;
				
				if (i+1 == arr.length-1) {
					return count;
				}

				}else{
					return count;
				}	
			}
			
		}
		return -1;


	}

	public static void main(String[] args){

		int[] testArr = {1,1,2,3,4,4,5,6,6,6,6};

		System.out.println(findOccurance(testArr, 1));
		System.out.println(findOccurance(testArr, 2));
		System.out.println(findOccurance(testArr, 3));
		System.out.println(findOccurance(testArr, 4));
		System.out.println(findOccurance(testArr, 5));
		System.out.println(findOccurance(testArr, 6));
		System.out.println(findOccurance(testArr, 7));

	}
}