/**
 * 
 *  Q- 2-Remove Duplicates from Sorted Array
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.

Constraints:

1 <= nums.length <= 3 * 104
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order. 

*/





public class removeDublicate {
    public static void main(String[] args) {
        System.out.println(removeDuplicate(new int[]{1, 1, 2, 2, 3, 4, 4, 5}));
        // Output: 5
    }   
    public static int removeDuplicate(int[] nums) {
		int count=0,curr=Integer.MIN_VALUE,prev=Integer.MIN_VALUE;
		
		for(int i=0;i<nums.length;i++) {
			curr=nums[i];
			if(curr!=prev) {
				nums[count]=nums[i];
				count++;
				
			}
			prev=nums[i];
		}
		return count;
	} 
}

