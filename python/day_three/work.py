question_hub = [
		{"question_one":'Minimum age required to open SB account in the bank "Options": a 8 years b 10 years 12 years None of above'},
		{"question_two": 'Bank does not provide loans for:, "Options": a Crop loans,b Education loans ,c Home loans ,d Drinking & Gambling'},
		{"question_three": 'KYC means: , "Options": ,a Know your customer, b Know your character, c Both of above ,d None of above'},
		{"question_four":'Bank having maximum number of branches in India, "Options":  a Reserve Bank of India ,b State Bank of India ,c Punjab National Bank, d Bank of Baroda'},
		{"question_five": '100 Rupee note is signed by', "Options": 'a Prime Minister b Finance Minister c RBI Governor d None of above'},
		{"question_six": 'ATM password should be kept in', "Options": 'a Personal diary b Office diary c Memory d All of above'},
		{"question_seven": 'ATM password to be shared only with', "Options": 'a Spouse b Obedient son c Obedient daughter d None of above'},
		{"question_eight": 'Timely repayment of loans results', "Option": 'a Good reputation, b No tension, c Easily availability of loan in future, d All of above'},
		{"question_nine": 'Defaulter of loan means', "Options": 'a Not paying loan instalments b Bad reputation c Illegal activities d None of above'},
		{"question_ten": 'Life insurance means', "Options": 'a Insurance of human, b Insurance of life of human and Cattle c Insurance of Life of Machines d All of above'}

		]

answer_hub = [
{"Minimum age required to open SB account in the bank Options a 8 years b 10 years 12 years None of above" : "b"},
{"Bank does not provide loans for:, Options a Crop loans,b Education loans ,c Home loans ,d Drinking & Gambling": "d"},
{"KYC means: , "Options" ,a Know your customer, b Know your character, c Both of above ,d None of above": "a"},
{"Bank having maximum number of branches in India, Options  a Reserve Bank of India ,b State Bank of India ,c Punjab National Bank, d Bank of Baroda": "b"},
{"100 Rupee note is signed by', Options 'a Prime Minister b Finance Minister c RBI Governor d None of above": "c"},
{"ATM password should be kept in', Options 'a Personal diary b Office diary c Memory d All of above": "c"},
{"ATM password to be shared only with', "Options" 'a Spouse b Obedient son c Obedient daughter d None of above": "d"},
{"Timely repayment of loans results', Option 'a Good reputation, b No tension, c Easily availability of loan in future, d All of above": "d"},
{"Defaulter of loan means', "Options" 'a Not paying loan instalments b Bad reputation c Illegal activities d None of above': "a"},
{"Life insurance means', "Options" 'a Insurance of human, b Insurance of life of human and Cattle c Insurance of Life of Machines d All of above": "a"}
]





def check_questions():

	score = 0
	count = 0

	while count < len(questions):
		check = questions[count]
		print("Question", count + 1, , check["question"])
	for counter in range(len(check["choices"])):
		print(check["choices"][counter])
    		answer = input("Your answer (A/B/C/D): ").upper()
	if answer == check["answer"]:
		print(" Correct!")
		score += 1
	else:
		print(" Wrong! The correct answer was:", check["answer"])
		count += 1

print("n Quiz Completed!")
print("You got", score, "out of", len(questions), "correct.")
