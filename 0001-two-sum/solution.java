class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int valid = target - nums[i];
            if (numMap.containsKey(valid)) {
                return new int[]{numMap.get(valid), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{}; // no solution found
    }
}
