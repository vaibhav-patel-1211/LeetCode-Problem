/*
 * Leetcode 28 : remove element
 * Given an integer array nums and an integer val, remove all occurrences of val
 * in nums in-place. The order of the elements may be changed. Then return the
 * number of elements in nums which are not equal to val.
 * 
 * Consider the number of elements in nums which are not equal to val be k, to
 * get accepted, you need to do the following things:
 * 
 * Change the array nums such that the first k elements of nums contain the
 * elements which are not equal to val. The remaining elements of nums are not
 * important as well as the size of nums.
 * Return k.
 * 
 * Example 1:
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 * 
 * Example 2:
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 */

class Solution {
    //solution 1
    int removeElement(int arr[], int val) {
        int j = 0;
        int n = arr.length;
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (arr[i] != val) {
                nums[j] = arr[i];
                j++;
            }
        }

        return j;

    }
    // solution 2: 
    int removeElement2(int arr[]) {
        int n = arr.length;
        int j = 1;

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[j] = arr[i];
                j++;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return j;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int arr[] = { 3, 2, 2, 3 };
        int arr2[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
        System.out.println(s.removeElement(arr, 3));
        System.out.println(s.removeElement(arr2, 2));
    }
}
