class Solution {
    public boolean isMonotonic(int[] nums) {
        Deque<Integer> increasing = new ArrayDeque<>();
        Deque<Integer> decreasing = new ArrayDeque<>();

        for(int i = 0;i<nums.length;i++){
            if(!increasing.isEmpty() && increasing.peek()<=nums[i]){
                increasing.push(nums[i]);
            }

            if( !decreasing.isEmpty() && decreasing.peek()>=nums[i]){
                decreasing.push(nums[i]);
            }

            if(increasing.isEmpty()){
                increasing.push(nums[i]);
            }
            
            if(decreasing.isEmpty()){
                decreasing.push(nums[i]);
            }
            
        }

        return increasing.size()==nums.length || decreasing.size()==nums.length;
    }
}