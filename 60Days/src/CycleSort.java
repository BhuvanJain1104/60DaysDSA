import java.util.Arrays;

public class CycleSort {
    public static void Cyclesort(int[] arry,int n){
        int i=0;
        while (i!=n){
            int correct=arry[i]-1;
            if(arry[i]!=arry[correct])
            {
                int temp=arry[i];
                arry[i]=arry[arry[i]-1];
                arry[temp-1]=temp;
            }
            else {
                i++;
            }
        }

    }

    public static void main(String[] args) {
        int[] nums= {4, 3, 2, 1, 5};
        System.out.println(Arrays.toString(nums));
        Cyclesort(nums, nums.length);
        System.out.println(Arrays.toString(nums));
    }
}
