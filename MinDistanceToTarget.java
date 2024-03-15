public class MinDistanceToTarget {
    public int getMinDistance(int[] nums, int target, int start) {
        int out = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                int temp = Math.abs(i-start);
                if(temp < out){
                    out = temp;
                }
            }
        }
        return out;
    }
}
