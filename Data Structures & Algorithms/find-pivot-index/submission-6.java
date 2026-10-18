class Solution {
    public int pivotIndex(int[] nums) {
        int[] sumLeft = new int[nums.length];
        sumLeft[0] = nums[0];


        for (int i = 1; i < nums.length; i++) {
            sumLeft[i] = nums[i] + sumLeft[i - 1];
        }


        for (int i = nums.length - 2; i >= 0; i--) {
            nums[i] += nums[i + 1];

           
            if (i == 0) {
                if (nums[i + 1] == 0) {
                    return i;
                }
            } else {
                int leftSum = sumLeft[i - 1];
                int rightSum = nums[i + 1];

                if (leftSum == rightSum) {
                    return i;
                }
            }
        }

        if (sumLeft[nums.length - 2] == 0) {
            return nums.length - 1;
        }

        return -1;
    }
}