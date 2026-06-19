import java.util.ArrayList;
import java.util.List;

public class CellCount {
}
class Solution {
    public static List<String> cellsInRange(String s) {
        List<String> ans= new ArrayList<>();
        for(char c=s.charAt(0);c<=s.charAt(3);c++)
        {
            for (char i = s.charAt(1); i <=s.charAt(4) ; i++) {
                ans.add(""+c+i);
            }
        }
        return ans;
    }

    static void main(String[] args) {
        System.out.println(cellsInRange("A1:B2"));
    }
}