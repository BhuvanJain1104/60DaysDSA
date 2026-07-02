public class Balloons {
    public static int maxNumberOfBalloons(String text) {
        int[] freq = new int[256];

        for (char ch : text.toCharArray()) {
            freq[ch]++;
        }

        return Math.min(
                Math.min(freq['b'], freq['a']),
                Math.min(
                        Math.min(freq['l'] / 2, freq['o'] / 2),
                        freq['n']
                )
        );
    }
    public  static int fibonaci(int n){
        if(n<=1) {
            return n;
        }

        return fibonaci(n-1) + fibonaci(n-2);

    }
    static void main(String[] args) {
        int N=50;
        for (int i = 0; i < N; i++) {

            System.out.print(fibonaci(i) + " ");
        }
    }
}
