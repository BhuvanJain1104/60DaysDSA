import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxBuildingheight {
    public static int maxBuilding(int n, int[][] restrictions) {
        int[][] arr = new int[restrictions.length + 1][2];
        arr[0][0] = 1;
        arr[0][1] = 0;
        for (int i = 0; i < restrictions.length; i++) {
            arr[i + 1][0] = restrictions[i][0];
            arr[i + 1][1] = restrictions[i][1];
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 1; i < arr.length; i++) {
            arr[i][1] = Math.min(
                    arr[i][1],
                    arr[i - 1][1] + (arr[i][0] - arr[i - 1][0])
            );
        }
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i-1][1] = Math.min(
                    arr[i-1][1],
                    arr[i ][1] + (arr[i][0] - arr[i - 1][0])
            );}
        int ans=0;
        for ( int i = 0; i <arr.length-1; i++) {
            int d=arr[i+1][0]-arr[i][0];
            int peek=(arr[i+1][1]+arr[i][1]+d)/2;
            ans=Math.max(ans,peek);
        }
        ans = Math.max(ans, arr[arr.length - 1][1] + (n - arr[arr.length - 1][0]));
        return ans;
    }

    static void main(String[] args) {
        int[][] restrictions={{2,1},{4,1}};
        System.out.println(maxBuilding(5,restrictions));
    }
}
