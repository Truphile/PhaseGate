public class TaskNine{
	public static void main(String[] args){

int check = 1;
int counter = 1;
int totalSum = 0;
int square = 1



for (check = 1; check <= 10; check++){
	if (check % 4 == 0){
		
		int multiples = 1;
		int sum = 0;
		for (counter = 1; counter <= 5; counter++){		
			multiples = multiples * check;
			sum = sum + multiples;
	
}
totalSum += sum;
square = totalSum * totalSum;

	
		}
}
System.out.print(square);
	


		