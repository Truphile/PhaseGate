from random import *
from functions import *

score = 0

first_number = randrange(1, 200)
second_number = randrange(1, 150)

(get_positive_rendom_substraction_problems(first_number, second_number))

answer = input(int(f"This is {first_number} - {second_number}?"))



print(current_question)
question_in_dict = filter(lambda x: x == current_question, questions_dict)

def solve_problem(answer, questions_dict, current_question, try):
	if try == 0:
		break

	if answer == questions_dict[current_question]:
		count += count
	return ("Correct!!")

	else:
		print("Wrong, try again... You have 1 trial remaining")
	try -= 1

	