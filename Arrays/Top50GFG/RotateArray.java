package Arrays;

/* Name: Sai Tharun kollampally
 * Leetcode link: https://leetcode.com/problems/rotate-array/
 * Trick: Adhoc thinking - reverse all, reverse based on k
 */

public class RotateArray {
    public void rotate(int[] nums, int k) {
    	int n=nums.length;
        k=k%n;
        rotateArr(nums, 0, n-k-1);
        rotateArr(nums, n-k, n-1);
        rotateArr(nums, 0, n-1);
    }	
    public void rotateArr(int nums[], int start, int end) {
    	while(start<end) {
    		int temp=nums[start];
    		nums[start++]=nums[end];
    		nums[end--]=temp;
    	}
    }
}
