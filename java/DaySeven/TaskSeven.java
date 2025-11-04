public class TaskSeven{
	public static void main(String[] args){
	
int check = 1;
int counter = 1;
int multiples = 1;
int sum = 0;

for (check = 1; check <= 10; check++){
	if (check % 4 == 0){

		while(counter <= 5){
		counter++;		
		multiples = multiples * check;
		sum = sum + multiples;
		
		
	
		}
	System.out.print(sum + " ");
}
		
		counter = 1;
		multiples = 1;
		sum = 0;
	}
}
}