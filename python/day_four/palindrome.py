def is_palindrome(words_list):

	new_word = words_list
	count = 0
	for check in words_list:
		palindrome = ""
		for checker in check:
			palindrome = checker + palindrome

		if check == palindrome:
			new_word[count] = True;

		else:
			new_word[count] = False;

		count+=1
	return new_word

words_list  = ["madam", "kali", "hello", "noon"]
print(is_palindrome(words_list))