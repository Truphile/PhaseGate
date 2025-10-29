public class CheckerTest{
	
public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2};
        System.out.println(Checker.sumUnique(numbers)); 

        int[] repeatedNumbers = {1, 1, 1, 1};
        System.out.println(Checker.sumUnique(repeatedNumbers));
    }

}