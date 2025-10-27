import time

def get_positive_rendom_substraction_problems(first_number, second_number):
	while second_number > first_number:
		first_number = randrange(1, 200)

	if first_number >= second_number:
		return(f"What is {first_number} - {second_number}?")

def get_answer_if_correct(first_number, second_number, answer, score, try):
	if try == 0:
		print("You have no more trials left...")
		
	check_answer = first_number - second_number
	if check_answer == answer:
		score += 1
		return(score)

	else: 
		trials -= 1
		print("You failed... Try one more time")