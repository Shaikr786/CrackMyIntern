class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();

        findPermutations( 0 ,nums ,result);

        return result;
    }

    private void findPermutations(int index , int[] nums, List<List<Integer>> result)
    {
       
        if(index == nums.length )
        {
            List<Integer> ds = new ArrayList<>();

            for(int i = 0 ; i < nums.length ; i++)
            {
                ds.add(nums[i]);
            }

            result.add(new ArrayList<>(ds));
            return;
           
        }

        Set<Integer> seen = new HashSet<>();

        for (int i = index; i < nums.length; i++) {

            if (seen.add(nums[i])) { 

                // Only proceed if nums[i] has not been used at this position

                swap(index, nums, i);

                findPermutations(index + 1, nums, result);

                swap(index, nums, i);
            }
        }
    }

    private void swap(int left , int[] nums , int right)
    {
        int current = nums[left];

        nums[left] = nums[right];

        nums[right] = current;
    }

}