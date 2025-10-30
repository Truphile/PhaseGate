public class isPerferctSquare{

	public static Boolean[] get_perfect_square(){
	int [] test_file = {4,9,25,49};


	Boolean [] array = new Boolean [4];
        for (int count = 0; count < test_file.length; count++) {
            int number = test_file[count];
             	int divider = 2;

                while(number % divider != 0) {
                    	divider++;

                }
		int dividedIndex = number / divider;
		
               	if (number == dividedIndex * dividedIndex) {
                	array[count] = true;
            	}else{
                	array[count] = false;
            	}
		}
		
		return array;
	}

