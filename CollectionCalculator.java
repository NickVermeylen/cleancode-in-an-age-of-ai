import java.util.Collection;

public class CollectionCalculator {

    public static void calculateSumAndAverage(Collection<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            System.out.println("The collection is empty or null.");
            return;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = sum / (double) numbers.size();

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
