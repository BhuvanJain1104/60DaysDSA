public class Binary_Search {
    public static int binarySearch(int [] nums,int target,int start, int end ){
       int s=start;
       int e=end;
       while (start<=end){
           int mid = start +(end-start)/2;
           if(nums[mid]==target)
               return mid;
           else if (target<nums[mid])
               return binarySearch(nums,target,s,mid-1);
           else
               return binarySearch(nums,target,mid+1,e);


       }

        return 0;
    }
}
