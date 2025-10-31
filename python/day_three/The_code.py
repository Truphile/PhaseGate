question_hub = [
    {"question": "Minimum age required to open SB account in the bank", "Options": ["a 8 years", "b 10 years", "c 12 years", "d None of above"], "answer": "b"},
    {"question": "Bank does not provide loans for", "Options": ["a Crop loans", "b Education loans", "c Home loans", "d Drinking & Gambling"], "answer": "d"},
    {"question": "KYC means", "Options": ["a Know your customer", "b Know your character", "c Both of above", "d None of above"], "answer": "a"},
    {"question": "Bank having maximum number of branches in India", "Options": ["a Reserve Bank of India", "b State Bank of India", "c Punjab National Bank", "d Bank of Baroda"], "answer": "b"},
    {"question": "100 Rupee note is signed by", "Options": ["a Prime Minister", "b Finance Minister", "c RBI Governor", "d None of above"], "answer": "c"},
    {"question": "ATM password should be kept in", "Options": ["a Personal diary", "b Office diary", "c Memory", "d All of above"], "answer": "c"},
    {"question": "ATM password to be shared only with", "Options": ["a Spouse", "b Obedient son", "c Obedient daughter", "d None of above"], "answer": "d"},
    {"question": "Timely repayment of loans results", "Options": ["a Good reputation", "b No tension", "c Easily availability of loan in future", "d All of above"], "answer": "d"},
    {"question": "Defaulter of loan means", "Options": ["a Not paying loan instalments", "b Bad reputation", "c Illegal activities", "d None of above"], "answer": "a"},
    {"question": "Life insurance means", "Options": ["a Insurance of human", "b Insurance of life of human and Cattle", "c Insurance of Life of Machines", "d All of above"], "answer": "a"}
]

def get_questions_and_answer():
	score = 0
	count = 0

	while count < len(question_hub):
		check = question_hub[count]
		print("Question", count + 1, ":", check["question"])
		for option in check["Options"]:
			print(option)
		while True:
			try:
				answer = input("Your answer (A/B/C/D): ").strip().lower()
				if not answer:
					raise ValueError("Input cannot be empty. Please enter A, B, C, or D")
				if len(answer) != 1:
					raise ValueError("Please enter only one character (A, B, C, or D)")
				if not answer.isalpha():
					raise ValueError("Only letters A, B, C, or D are allowed, no numbers or symbols")
				#if answer not in ['a', 'b', 'c', 'd']:
					#raise ValueError("Invalid choice. Please enter A, B, C, or D only")
				break
			except ValueError :
				print("Unexpected input Please try again.")
				print("If you need your glasses pls get it so you can put in the right input this time! ")

			if answer == check["answer"]:
				print("Correct!")
				score += 1
			else:
				print(f"Wrong! The correct answer was: ", check['answer'])

			count += 1

	return score

score = get_questions_and_answer()
print("Quiz Completed!")
print(f"You got {score} out of {len(question_hub)} correct.")
