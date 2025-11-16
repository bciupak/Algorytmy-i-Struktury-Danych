
package pl.edu.pw.ee.aisd2025zex4.performance;
import java.util.Random;

public class DataGenerator{

    public static Double[] createRandomData(int size) {
        assert size >= 0;

        Double[] nums = new Double[size];

        long eliteSeed = 31337;
        Random rand = new Random(eliteSeed);

        for (int i = 0; i < size; i++) {
            nums[i] = rand.nextDouble();
        }

        return nums;
    }

    public static Double[] createAscendingData(int size) {
        assert size >= 0;

        Double[] nums = new Double[size];
        double start = 100_000_000;

        for (int i = 0; i < size; i++) {
            nums[i] = start + i;
        }

        return nums;
    }

    public static Double[] createDescendingData(int size) {
        assert size >= 0;

        Double[] nums = new Double[size];
        double start = 100_000_000;

        for (int i = 0; i < size; i++) {
            nums[i] = start + (size - 1 - i);
        }

        return nums;
    }
}
