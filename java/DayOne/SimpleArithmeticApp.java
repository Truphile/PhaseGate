import java.util.Scanner;
//import java.util.Time;

public class SimpleArithmeticApp{
	public static void main(String [] args){
		
	Scanner input = new Scanner(System.in);
	 int Questions = 10;
	 int CorrectAnswers = 0; 
	long startTime = System.currentTimeMillis();

	 int check = 0;
	 int overallTime = 0;

	 while(check < Questions){
	  	int firstNumber = (int)(Math.random()*500);
	  	int secondNumber = (int)(Math.random()*150);
	   	check++;
	
	if(secondNumber > firstNumber){
		int temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;
 	 
	 	System.out.printf("What is %d %s %d %s  ",firstNumber, " - " , secondNumber , "=" );
	 	int answer = input.nextInt();
		
	 	
			if (firstNumber - secondNumber == answer){
	  			System.out.println("Correct! ");
	   			CorrectAnswers++;
	 	}

		else if(firstNumber - secondNumber != answer){
			System.out.print("Final try: " + firstNumber + "-" +  secondNumber + ":");
		 	answer = input.nextInt();
	}
			if(firstNumber - secondNumber == answer){
		 		System.out.println("Correct! ");
				CorrectAnswers++;
	
			}else{
				System.out.printf("Wrong! %ncorrect answer is  %d %s %d %s %d%n", firstNumber, "-", secondNumber, "=",(firstNumber - secondNumber));

			    }
             	
		}
	 
	  
		 
	 }
		long endTime = System.currentTimeMillis();
	 
	  System.out.printf("The total number of your score is %d%s%d%n ", CorrectAnswers, "/", Questions);	
	 overallTime = startTime - endTime ;
	 System.out.print("The time in seconds spent is " + overallTime + "seconds");
	 

 }
}
