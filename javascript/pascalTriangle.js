
function pascalTriangle(n){

	var pt = [n];

	for (var i = 0; i < n; i++) {
		pt[i] = [];
		pt[i][0] = 1;
		pt[i][i] = 1;

		for (var j = 1; j < i; j++) {
			pt[i][j] = pt[i-1][j-1] + pt[i-1][j]; 
		};
	};

	return pt;


}


var range = 5;
//var result = [][];

var result = pascalTriangle(range);

for (var i = 0; i < range; i++) {
	
	for (var j = 0; j <= i; j++) {
		console.log(result[i][j]);
	};

};