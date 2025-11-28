import java.util.Scanner;
import java.util.Arrays;

public class StudentGrade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("======Lagbaja Schools International======");
		System.out.println();

		int numberOfStudents = 0;
		while (true) {
			System.out.print("Enter number of students: ");
			if (input.hasNextInt()) {
			numberOfStudents = input.nextInt();
			if (numberOfStudents > 0) {
			break;
			} else {
			System.out.println("Number must be positive!");
			}
			} else {
			System.out.println("Invalid input! Please enter a number.");
			input.next();
			System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("Saved Successfully");
			}
		}
	 	

		int numberOfSubjects = 0;
		while (true) {
			System.out.print("Enter number of subjects: ");
			if (input.hasNextInt()) {
			numberOfSubjects = input.nextInt();
			if (numberOfSubjects > 0) {
			break;
			} else {
			System.out.println("Number must be positive!");
			}
			} else {
			System.out.println("Invalid input! Please enter a number.");
			input.next();
			}
		}

		System.out.println();

		int[][] scores = new int[numberOfStudents][numberOfSubjects];
		int[] total = new int[numberOfStudents];
		int[] positions = new int[numberOfStudents];

		for (int check = 0; check < numberOfStudents; check++) {
			System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("Saved Successfully");
			System.out.println();
			System.out.println();
			System.out.println("Enter scores of student " + (check + 1) + ":");

			for (int checker = 0; checker < numberOfSubjects; checker++) {
				double score;
				while (true) {
					System.out.print("Subject " + (checker + 1) + ": ");
					if (input.hasNextDouble()) {
					score = input.nextDouble();
					if (score >= 0 && score <= 100) {
					scores[check][checker] = (int) score;
					total[check] += (int) score;
					break;
					} else {
					System.out.println("Invalid! Enter a score between 0 and 100.");
					}
					} else {
					System.out.println("Invalid input! Enter a number between 0 and 100.");
					input.next();
					}
				}
			}
		}

		System.out.println();
		System.out.println();

		Arrays.sort(positions);
		for (int check = 0; check < numberOfStudents; check++) {
			positions[check] = 1;
			for (int checker = 0; checker < numberOfStudents; checker++) {
				if (total[checker] > total[check]) {
					positions[check]++;
					
				}
	
			}

		}

		System.out.println("======================================");
		System.out.println("            STUDENT SUMMARY           ");
		System.out.println("======================================");

		for (int check = 0; check < numberOfStudents; check++) {
			System.out.print("Student " + (check + 1) + ": ");
			for (int checker = 0; checker < numberOfSubjects; checker++) {
				System.out.print("Subject " + (checker + 1) + ": ");
				System.out.print(scores[check][checker] + " ");
			}
			double average = (double) total[check] / numberOfSubjects;
			System.out.printf("Total: %d | Average: %.2f | Position: %d%n", total[check], average, positions[check]);


			
		}

		System.out.println();
		
		int classTotal = 0;
		double classAverage = 0;
		for (int check = 0; check < total.length; check++){
			classTotal += total[check];
		}
		classAverage = (int)classTotal / numberOfStudents; 

		double[] subjectAverages = new double[numberOfSubjects];
        	int[] subjectPasses = new int[numberOfSubjects];
        	int[] subjectFails = new int[numberOfSubjects];
        
		for (int subject = 0; subject < numberOfSubjects; subject++) {
		int subjectTotal = 0;
		for (int student = 0; student < numberOfStudents; student++) {
		subjectTotal += scores[student][subject];
		if (scores[student][subject] >= 50) {
			subjectPasses[subject]++;
		} else {
			subjectFails[subject]++;
                }
            }
		subjectAverages[subject] = (double) subjectTotal / numberOfStudents;
        }


		int hardestSubject = 0;
		int easiestSubject = 0;
		for (int check = 1; check < numberOfSubjects; check++) {
		if (subjectAverages[check] < subjectAverages[hardestSubject]) {
		hardestSubject = check;
            }
		if (subjectAverages[check] > subjectAverages[easiestSubject]) {
		easiestSubject = check;
            }
        }

		Arrays.sort(scores);

		System.out.println("==========Class Summary===========");
		System.out.println("==================================");
        	System.out.println("Hardest Subject: Subject " + (hardestSubject + 1));
        	System.out.println("==================================");
        	System.out.println("Easiest Subject: Subject " + (easiestSubject + 1));
        	System.out.println("==================================");
		System.out.println("The class total is: " + classTotal);
		System.out.println("==================================");
		System.out.println("The class Average is "  + classAverage);
		System.out.println("====================================");
					
		
	}
}
