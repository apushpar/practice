class pascalTriangle{
	
	public static int[][] pascalTriangle(int n){
		int pt[][] = new int[n][];
		
		for (int i=0;i<n ;i++ ) {
			pt[i] = new int[i+1];
			pt[i][0] = 1;
			pt[i][i] = 1;

			for (int j=1;j<i ;j++ ) {
				pt[i][j] = pt[i-1][j-1] + pt[i-1][j];
			}
		}
		return pt;

	}

	public static void main(String[] args){
		int range = 5;
		int[][] result = pascalTriangle(range);
		for (int i=0;i<range ;i++ ) {
			for (int j =0;j<=i ;j++ ) {
				System.out.print(" "+result[i][j]);
			}
			System.out.println(" ");
		}
	}

}