class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        Map<Integer ,Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++)
        {
            map.put(nums[i] ,map.getOrDefault(nums[i] ,0) +1);
        }

        for(Map.Entry<Integer ,Integer> entry : map.entrySet())
        {
            if(entry.getValue() == 2)
            {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}