class Solution {
    public boolean isPalindrome(int x) {
        int re=0;
        int y=x;
        while(x>0)
        {
          int a=x%10;
          re=re*10+a;
          x/=10;
        }   
        return y==re;
    }
}
