import java.util.Arrays;

public class H_Index {
    public static void main(String[] args) {
        int[] citations = {5, 1, 2, 4, 1};
        System.out.println(hIndex(citations));
    }
    public static int hIndex(int[] citations) {
    int count= citations.length;
        Arrays.sort(citations);
        for (int i = 0; i <citations.length ; i++) {
            if(citations[i]>=count)
                continue;
            else{
                count--;
            }

        }
    return count;
    }
}
