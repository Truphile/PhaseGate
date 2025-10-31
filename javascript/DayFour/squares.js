function isPerfectSquare(number) {
	if (number == 0) {
		return false;
	}
	for (let check = 0; check <= number; check++) {
		if (check * check == number)
		return true;
			
        }
	return false;
    }
number = 100
console.log(isPerfectSquare(number))
   