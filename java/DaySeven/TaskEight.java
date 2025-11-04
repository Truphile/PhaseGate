public class TaskEight{
	public static void main(String[] args){

int check = 1;
int counter = 1;
int total_sum = 0;



for (check = 1; check <= 10; check++){
	if (check % 4 == 0){
		
		int multiples = 1;
		int sum = 0;
		for (counter = 1; counter <= 5; counter++){		
			multiples = multiples * check;
			sum = sum + multiples;
	
}
total_sum += sum;

	
		}
}
System.out.print(total_sum + " ");
}	
}

		