import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int num : nums) {

            List<List<Integer>> current = new ArrayList<>();

            for (List<Integer> list : result) {

                for (int i = 0; i <= list.size(); i++) {

                    List<Integer> temp = new ArrayList<>(list);

                    temp.add(i, num);

                    current.add(temp);
                }
            }

            result = current;
        }

        return result;
    }
    static ArrayList<String> permutationsList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        // local to this call
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationsList(f + ch + s, up.substring(1)));
        }
        return ans;
    }

    public List<List<Integer>> permute1(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        helper(nums, new ArrayList<>(), result);

        return result;
    }

    private void helper(int[] nums,
                        List<Integer> current,
                        List<List<Integer>> result) {

        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int num : nums) {

            if (current.contains(num)) {
                continue;
            }

            current.add(num);

            helper(nums, current, result);

            current.remove(current.size() - 1);
        }
    }
    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));
        }
    };;

    static void main(String[] args) {
        System.out.println(   permutationsList("","abc"));
    }
}
