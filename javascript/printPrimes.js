


function printPrimes(n){

	var primes = [];

	for (var i = 2; i <= n; i++) {
		primes[i] = 1;
	};

	for (var j = 2; j*j <= n; j++) {
		

		if (primes[j]) {
			for (var i = 2*j; i <= n; i=i+j) {
				primes[i] = 0;
			};

		};
	};

	for (var i = 2; i <= n; i++) {
		if (primes[i]) {
			console.log(" "+i);
		};
	};

}

printPrimes(30);