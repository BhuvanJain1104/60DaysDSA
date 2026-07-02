import java.util.Collections;
import java.util.PriorityQueue;

public class Last_Stone {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int w : stones)
            maxHeap.add(w);
        while (maxHeap.size()>1){
            int a= maxHeap.poll();
            int b= maxHeap.poll();
            maxHeap.add(a-b);

        }
        if(maxHeap.isEmpty())
            return 0;
        return maxHeap.peek();
    }

    static void main(String[] args) {
        int[] stones={2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));
    }
}
