// Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.
package GFG;


class Solution {
    int count(int[] arr, int n, int x) {
        // code here
      int res1=last(arr,x,0,n-1);
      int res2=first(arr,x,0,n-1);
      if(res1!=-1&&res2!=-1)
        return res1-res2+1;
        else if(res1==-1&&res2==-1)
        return 0;
        else return 1;
        
        
    }
        private int first(int[] nums,int target,int start,int end){
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                res=mid;
                end=mid-1;
            }
            else if(nums[mid]<target)
            start=mid+1;
            else
            end=mid-1;
        }
        return res;
    }
     private int last(int[] nums,int target,int start,int end){
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                res=mid;
                start=mid+1;
            }
            else if(nums[mid]<target)
            start=mid+1;
            else
            end=mid-1;
        }
        return res;
    }
}