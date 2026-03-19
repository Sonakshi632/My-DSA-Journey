class Solution {
    public int majorityElement(int[] nums) {
        int count = 0 ;
        int candidate = 0;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            if(count == candidate){
                count ++;
            } else {
                count --;
            }
        }
        return candidate;
    }
}
