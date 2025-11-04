let check = 1;
let counter = 1;
let total_sum = 0;



for (check = 1; check <= 10; check++){
	if (check % 4 == 0){
		
		let multiples = 1;
		let sum = 0;
		for (counter = 1; counter <= 5; counter++){		
			multiples = multiples * check;
			sum = sum + multiples;
	
}
total_sum += sum;

	
		}
}
console.log(total_sum);
	


		