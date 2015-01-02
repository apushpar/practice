class printPrimes{

// sieve of Eratosthenes
//
	public static void printPrimes(int n){
		boolean[] prime = new boolean[n+1];

		for (int i=2;i<=n ;i++ ) { //loop for setting all numbers till n as prime [prime till proven otherwise]
			prime[i] = true;
		}

		for (int j=2;j*j<n ;j++ ) { //loop to check till the square value of divisor
			if(prime[j]){ //check if the number is prime
				for (int i=2*j;i<=n ;i=j+i ) { //loop through the multiple of the divisor and set it as composite [false]
					prime[i] = false;
				}
			}
		}

		for (int i=2;i<=n ;i++ ) { //loop to print out the prime numbers
			if (prime[i]) {
				System.out.println(i);
			}
		}

	}

	public static void main(String[] args){
		printPrimes(30);
	}
}