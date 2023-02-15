// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=first(nums,target,0,nums.length-1);
        ans[1]=last(nums,target,0,nums.length-1);
        return ans;
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
