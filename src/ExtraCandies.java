import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtraCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = candies[0];

        for (int can : candies) {
            max = Math.max(max, can);
        }

        for (int can : candies) {
            result.add(can + extraCandies >= max);
        }

        return result;
    }
}
