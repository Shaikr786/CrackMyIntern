class Solution {
    public boolean canJump(int[] nums) {

        return canJumpTrace(0 ,nums);

    }

    public boolean canJumpTrace(int pos , int[] nums)
    {

        int jumpNext = 0;
        
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(i > jumpNext)//if corrent index is > than the max reach index
            {
                return false;
            }

            jumpNext = Math.max(jumpNext, i+nums[i]);

        }
        
        return true;
    }

}