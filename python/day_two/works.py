def getFirstOccurenceOfLetterAndReverseWordFromIndex(word, ch):

    reversed_word = word[:word.index(ch)][::-1]
    result = reversed_word + word[word.index(ch):] + ch
    
    return result

word = "abcdefd"
ch = "c"

print(getFirstOccurenceOfLetterAndReverseWordFromIndex(word, ch))


