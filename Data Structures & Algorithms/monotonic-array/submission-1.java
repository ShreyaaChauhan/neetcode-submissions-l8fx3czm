class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isLessThan = false;
        boolean isGreaterThan = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                isLessThan = true;
            } else if (nums[i] > nums[i + 1]) {
                isGreaterThan = true;
            }
            if (isLessThan && isGreaterThan) {
                return false;
            }

        }

        return true;
    }
}