check = 1
counter = 1
total_sum = 0



for check in range(1,11):
	if (check % 4 == 0):
		
		multiples = 1
		sum = 0
		for counter in range(5):		
			multiples = multiples * check
			sum += multiples
		total_sum += sum
		square  = total_sum * total_sum

print(square, end= " ")	
		

		