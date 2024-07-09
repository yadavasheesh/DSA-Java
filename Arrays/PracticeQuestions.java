package Arrays;

import java.util.HashSet;

public class PracticeQuestions {

}
// Practice Question 1
//Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.
class ps1 {
    public static boolean check(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                   return true;
                }
            }
        }
        return false;
    }

    //Second method:- By Hashset
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) {

            if(set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        System.out.println(check(nums));
        System.out.println(containsDuplicate(nums));
    }
}



//Practice Question 2
//There is an integer array nums sorted in ascending order (with distinct values).
// Prior to being passed to your function, nums is possibly rotated at an unknown pivot
// index k (1  <=  k  <  nums.length)  such  that  the  resulting  array
// is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).
// For   example, [0,1,2,4,5,6,7] might        be        rotated        at        pivot        index 3
// and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target, return
// the index oftarget if it is in nums, or -1   if it is not in nums.
//You must write an algorithm with O(log n) runtime complexity.
class ps2{
    public static void pivotRotation(int num[]){
        for (int i= num.length/2;i< num.length;i++){
            System.out.print( num[i]+", ");
        }
        for (int i=0;i<(num.length/2);i++){
            System.out.print(", "+num[i]);
        }
    }

    public static void main(String[] args) {
        int num[]={0,1,2,4,5,6,7};
        pivotRotation(num);
    }
}



//Practice Question 3
class ps3 {
    public static void MaxProfitFromStock(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > buyPrice) {
                int profit = prices[i] - buyPrice;
                maxProfit = Integer.max(profit, maxProfit);
            } else {
                buyPrice = prices[i];
            }
        }
        System.out.println(maxProfit);
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 4, 3, 6};
        MaxProfitFromStock(prices);
    }
}



// Practice Question 4
//Given n non-negative integers representing an elevation map where the width of each
// bar is 1, compute how much water it can trap after raining.
class ps4{
public static int trappedRainWaterExample(int height[]){
    int n = height.length;

    int LeftMax[] =new int[n];
    LeftMax[0]=height[0];
    for (int i=1;i<n;i++){
        LeftMax[i]=Math.max(height[i],LeftMax[i-1]);
    }

    int RightMax[]=new int[n];
    RightMax[n-1]=height[n-1];
    for (int i=n-2;i>=0;i--){
        RightMax[i]=Math.max(height[i],RightMax[i+1]);

    }
    int trappedRainWater =0;
    for (int i=0;i<n;i++){
        int waterLevel=Math.min(LeftMax[i],RightMax[i]);

        trappedRainWater +=waterLevel-height[i];
    }
    return trappedRainWater;
}

    public static void main(String[] args) {
        int height[]={4,2,0,3,2,5};
        System.out.println(trappedRainWaterExample(height));
    }
}




// Practice Question 5
// Given an integer array nums, return all the triplets [nums[i], nums[j],  nums[k]]
// such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
// Notice that the solution set must not contain duplicate triplets.
class ps5{
    
}
