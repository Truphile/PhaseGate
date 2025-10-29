
def reverse_word(word,ch):
    
	word_check = word.find(ch)
	if word_check == -1:
        	return word 
	reversed_part = word[:word_check+1][::-1]
	result = reversed_part + word[word_check+1:]
	
	return result


word = "abcdefd"
ch = "d"

print(reverse_word(word,ch))