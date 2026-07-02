public class MissingElementsRange {
    public  static void main(String[] args) {
        int[]arry={10, 12, 11, 15};
        int low=10;
        int high=15;
        int []result = missing(arry,low,high);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    public static int[] missing(int[] nums, int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found)
                count++;
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = low; i <= high; i++) {

            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found)
                result[index++] = i;
        }
        return result;
    }

}
