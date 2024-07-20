class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);  
        subSets(nums, 0, new ArrayList<>(), list);
        return list;
    }

    private void subSets(int[] nums, int index, List<Integer> current, List<List<Integer>> list) {
        if (index == nums.length) {
            if (!list.contains(current)) {
                list.add(new ArrayList<>(current));
            }
            return; 
        }

        current.add(nums[index]);
        subSets(nums, index + 1, current, list);
        
        current.remove(current.size() - 1);
        subSets(nums, index + 1, current, list);
    }
}