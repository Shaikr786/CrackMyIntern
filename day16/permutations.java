class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> ds = new ArrayList<>();
        permutation(0 ,nums ,result ,ds);

        return result;
    }

    private void permutation(int index ,int[] nums ,List<List<Integer>> result , List<Integer> ds)
    {
        if(index == nums.length)
        {
            result.add(new ArrayList<>(ds));
        }

        for(int i = index ; i < nums.length ; i++)
        {
            swap(nums ,i ,index);
            ds.add(nums[index]);
            permutation(index +1 ,nums ,result ,ds);
            ds.remove(ds.size() -1);
            swap(nums ,i ,index);
        }

    }

    private void swap(int[] nums ,int start ,int end)
    {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}