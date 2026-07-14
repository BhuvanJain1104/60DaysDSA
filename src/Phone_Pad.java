import java.util.*;

public class Phone_Pad {
    public static List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        result=helper("",digits);
        return result;
    }
    static String [] keypad={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    private static ArrayList<String >helper(String currentcombinations,String remainingDigits){
        if(remainingDigits.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(currentcombinations);
            return list;
        }
        int digit=remainingDigits.charAt(0)-'0';
        String possibleLetter=keypad[digit];
        ArrayList<String> allCombinations=new ArrayList<>();
        for (int index = 0; index <possibleLetter.length(); index++) {
            char selectedChar=possibleLetter.charAt(index);
            allCombinations.addAll(helper(currentcombinations+selectedChar,remainingDigits.substring(1)));
        }
        return allCombinations;
    }
    static ArrayList<String> dice(String current, int target) {

        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(current);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(dice(current + i, target - i));
        }

        return ans;
    }
    static void main(String[] args) {
        System.out.println(letterCombinations("234"));
    }
}
