import java.util.Arrays;

public class Checker {
    public static int sumUnique(int[] numbers) {
        int total = 0;
        for (int check = 0; check < numbers.length; check++) {
            int count = 0;
            for (int checker = 0; checker < numbers.length; checker++) {
                if (numbers[check] == numbers[checker]) {
                    count++;
                }
            }

            if (count == 1) {
                total += numbers[check];
            }
        }

        return total;
    }

}
