
def get_sum_of_unique_elements_in_a_list(numbers):
	
	numbers.sort()
	total = 0
	for check in range(len(numbers) - 1):
		if numbers[check] != numbers[check + 1]:

			total += numbers[check] 
	return total


numbers = [1,2,2,3]
print(get_sum_of_unique_elements_in_a_list(numbers))

numbers = [1,1,1,1]
print(get_sum_of_unique_elements_in_a_list(numbers)) 

