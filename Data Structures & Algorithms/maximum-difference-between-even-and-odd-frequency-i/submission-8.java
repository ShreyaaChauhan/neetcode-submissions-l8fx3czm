class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            freqMap.put(s.charAt(i), freqMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int val : freqMap.values()) {

            if (val % 2 == 1) {
                maxOdd = Math.max(maxOdd, val);
            } else {
                minEven = Math.min(minEven, val);
            }
        }

        return maxOdd - minEven;
    }
}