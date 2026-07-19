class Solution {
    public String smallestSubsequence(String s) {
        int [] last = new int[26];
        for(int i=0;i<s.length();i++){
            last[s.charAt(i) - 'a']=i;
        }
        Stack<Character> seq=new Stack<>();
        boolean[] visited=new boolean[26];
         for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(visited[ch - 'a'])
                continue;
            
            while(!seq.isEmpty()&& ch<seq.peek()&&last[seq.peek() -'a']>i){
                visited[seq.pop() -'a']=false;
            
            }
            seq.push(ch);
            visited[ch - 'a']=true;

        }
        StringBuilder ans= new StringBuilder();
        for(char ch : seq){
                ans.append(ch);
        }
        return ans.toString();
    }
}