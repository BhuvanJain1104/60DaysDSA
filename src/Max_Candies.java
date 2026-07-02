import java.util.Collections;
import java.util.PriorityQueue;

public class Max_Candies {
    public int minimumCost(int[] cost) {
        int price=0;
        int count=0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int c : cost)
            maxHeap.add(c);
        while (maxHeap.size()!=0){
           if(count%2==0)
                maxHeap.poll();
           else {
               int s= maxHeap.poll();
               price+=s;
           }
           count++;
        }
        return price;
    }
}
