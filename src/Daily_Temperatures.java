import java.util.Stack;

public class Daily_Temperatures {
    public int[] dailyTemperatures(int[] temp) {
        int[] ans=new int[temp.length];
        Stack<Integer> tmp =new Stack<>();
        int count=0;
        int n=temp.length;
        for(int i=0;i<n;i++){
            ans[i]=0;
        }
        tmp.push(0);
        for(int i=1;i<temp.length;i++)
        {
            while (!tmp.empty() && temp[i] > temp[tmp.peek()]){
                int num=tmp.pop();
                if(temp[num]<temp[i]){
                    ans[num]=i-num;
                }
                else {
                    tmp.push(num);

                }
            }
            tmp.push(i);

        }
        return ans;
    }
}
