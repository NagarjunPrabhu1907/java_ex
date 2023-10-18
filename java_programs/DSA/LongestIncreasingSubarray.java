package java_programs.DSA;

import java.util.*;

public class LongestIncreasingSubarray {

    public static List<Integer> findLongestIncreasingSubarray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        List<Integer> currentSubarray = new ArrayList<>();
        List<Integer> longestSubarray = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {
            currentSubarray.add(nums[i]);

            if (nums[i] >= nums[i + 1]) {
                if (currentSubarray.size() > longestSubarray.size()) {
                    longestSubarray = new ArrayList<>(currentSubarray);
                }

                currentSubarray.clear();
            }
        }

        // Handling the last element
        currentSubarray.add(nums[nums.length - 1]);

        if (currentSubarray.size() > longestSubarray.size()) {
            longestSubarray = new ArrayList<>(currentSubarray);
        }

        return longestSubarray;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 3, 4, 5, 1, 2, 3};
        List<Integer> longestSubarray = findLongestIncreasingSubarray(nums);

        System.out.println("Longest Increasing Subarray: " + longestSubarray);
    }
}
