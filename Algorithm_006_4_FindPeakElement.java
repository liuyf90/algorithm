public class Algorithm_006_4_FindPeakElement {
    // 二分搜索不一定发生在有序数组止 (比如寻找峰值问题)
   // 测试链接：https://leetcode.cn/problems/find-peak-element/
 
    
  // 峰值元素是指其值严格大于左右相邻值的元素。

  // 给你一个整数数组 nums，找到峰值元素并返回其索引。数组可能包含多个峰值，在这种情况下，返回 任何一个峰值 所在位置即可。
  // 
  // 你可以假设 nums[-1] = nums[n] = -∞ 。
  // 
  // 你必须实现时间复杂度为 O(log n) 的算法来解决此问题。
   
   public static int findPeakElement(int[] nums) {
     int n= nums.length-1;
     if(nums.length==1){
        return 0;
     }
     if(nums[0]>nums[1]){
        return 0;
     }
     if(nums[n]>nums[n-1]){
        return n;
     }
     int l=1, r=n-1, m=0, ans=-1;  
     while(l<=r){
        m=(r+l)/2;
        if(nums[m]<nums[m+1]){
            l=m+1;
        }else if(nums[m]<nums[m-1]){
            r=m-1;
        }else if(nums[m]>nums[m+1] && nums[m]>nums[m-1]){
            ans=m;
            break;
        }
     }
     return ans;
  }
}