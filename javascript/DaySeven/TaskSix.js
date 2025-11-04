
	
let check = 1;
let counter = 1;
let multiples = 1;

for (check = 1; check <= 10; check++){
	if (check % 4 == 0){

		while(counter <= 5){
			counter++;		
			multiples = multiples * check;
			console.log(multiples +" ");
		}
	}
	
	
		
		counter = 1;
		multiples = 1;

}
