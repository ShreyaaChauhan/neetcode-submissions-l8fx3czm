class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] freq = new int[1002];
        for (int num : nums1) {
            freq[num]++;
        }

        Set<Integer> set = new HashSet<>();

        for (int num : nums2) {
            if (freq[num] > 0) {
                set.add(num);
            }
        }

        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i] = num;
            i++;
        }

        return result;
    }
}