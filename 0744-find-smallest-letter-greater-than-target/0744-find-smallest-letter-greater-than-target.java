class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char a=Ceil(letters,target);
        return a;
    }
    static  char  Ceil(char[] arry,char target){
        int start = 0;
        int end= arry.length - 1;
        while(start<=end)
        {
            int mid= start + (end-start)/2;

            if (target < arry[mid]) {
                end=mid-1;
            }

            else {
                start=mid+1;

            }
            
        }
        return arry[start % arry.length];
    }
    }
