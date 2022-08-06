package kata8.algo03grasshopperArrayMean;

import java.util.Arrays;

public class GrassHopper {

    public static int findAverage(int[] nums) {

        return Arrays.stream(nums).sum() / nums.length;
    }
}
