class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, 1);

        int count = 0;
        int subArraySum = 0;

        for (int num : nums) {
            subArraySum += num;

            if (prefixMap.containsKey(subArraySum - k)) {
                count += prefixMap.get(subArraySum - k);
            }

            prefixMap.put(subArraySum, prefixMap.getOrDefault(subArraySum, 0) + 1);
        }
        return count;
    }
}