import java.util.Scanner;

public class StudentGrade{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("===Lagbaja Schools International===");
	System.out.println();
	System.out.println();
	

	System.out.print("Enter number of students: ");
	if (input.hasNextInt()) {
	int numberOfStudents = input.nextInt();
	input.nextLine();
	} else {
	System.out.println("Invalid student number!");
	System.out.print("Enter number of students: ");
	input.nextLine();
       }
	int numberOfStudents = input.nextInt();
	

	System.out.print("Enter number of subjects: ");
	int numberOfSubjects = input.nextInt();


	int [][] scores = new int [numberOfStudents][numberOfSubjects];

	for (int check = 0; check < numberOfStudents; check++){
		System.out.println("Enter scores of students " + (check + 1) + ":");
		for (int checker = check; checker < numberOfSubjects; checker++){
		scores;
			System.out.println("Enter score: ");
}
	}

	}
}