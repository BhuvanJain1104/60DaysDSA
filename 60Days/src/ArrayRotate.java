import java.util.Arrays;

public class ArrayRotate {
    public static void rotate(int[] nums, int k) {
        int[]result=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int j=(i+k)% nums.length;
            result[j]=nums[i];
        }
        System.arraycopy(result, 0, nums, 0, nums.length);
    }

    static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        rotate(nums,1);
        System.out.println(Arrays.toString(nums));
    }
}
