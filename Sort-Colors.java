class Solution {
    void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
    int L = 0 , M = 0 , H = nums.length-1;
        while(M<=H){            //BASE CASE
            if(nums[M] == 0 )
            {
                swap(nums , L , M);   //RECURSIVE CALL
                L++;
                M++;
            }
            else if (nums[M] == 1){
                M++;
            }
            else {
                swap(nums , M , H);    //RECURSIVE CALL
                H--;
            }
        }
        
    }
}
