class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length ;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while(mid <= high)
        {
            if(nums[mid] == 0)
            {
                swap(nums ,mid ,low);
                low ++;
                mid++;
            }
            else if(nums[mid] == 1)
            {
                mid++;
            }
            else {
                swap(nums ,mid ,high);
                high--;
            }
        }
    }

    private void swap(int[] nums, int first ,int last)
    {
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    } 
}