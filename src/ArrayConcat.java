import java.util.Arrays;

public class ArrayConcat {
    public static  int[] getConcatenation(int[] nums) {
    int[] ans= new int[2*nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i]=nums[i% nums.length];

        }
    return  ans;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
