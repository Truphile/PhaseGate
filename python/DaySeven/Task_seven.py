check = 1
counter = 1



for check in range(1,11):
	if (check % 4 == 0):
		
		multiples = 1
		sum = 0
		for counter in range(5):		
			multiples = multiples * check
			sum += multiples
		print(sum, end= " ")
		

		