def is_palindrome(words_list):

	count = 0
	for check in words_list:
		palindrome = ""
		for checker in check:
			palindrome = checker + palindrome

		if check == palindrome:
			words_list[count] = True;

		else:
			words_list[count] = False;

		count+=1
	return words_list

words_list  = ["madam", "kali", "hello", "noon"]
print(is_palindrome(words_list))