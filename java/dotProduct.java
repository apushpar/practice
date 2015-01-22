public class dotProduct {

	public static double[] product(double[] x, double[] y){

		double[] res = new double[x.length];

		for (int i=0;i<x.length ;i++ ) {
			res[i] = x[i] * y[i];
		}
		return res;
	} 

	public static void main(String[] args){
		double[] a = {1,2,3,4,5};
		double[] b = {1,2,3,4,5};
		double[] result;
		result = product(a,b);
		
		for (int i = 0;i<result.length ;i++ ) {
			System.out.println(result[i]);
		}

	}
}