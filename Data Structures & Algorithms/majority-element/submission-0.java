class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num:nums){
            freq.merge(num, 1, Integer::sum);
            if(freq.get(num)>(nums.length/2)){
                return num;
            }
        }

        return -1;
    }
}