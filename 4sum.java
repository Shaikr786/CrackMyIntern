class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Sort the array to use two-pointer technique
        Arrays.sort(nums);
        
        int n = nums.length;
        
        // Iterate through the array with two nested loops
        for (int i = 0; i < n - 3; i++) {
            // Skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            for (int j = i + 1; j < n - 2; j++) {
                // Skip duplicates for the second element
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                
                int low = j + 1, high = n - 1;
                
                while (low < high) {
                    long sum = (long) nums[i] + nums[j] + nums[low] + nums[high];
                    
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        
                        // Skip duplicates for the third and fourth elements
                        while (low < high && nums[low] == nums[low + 1]) low++;
                        while (low < high && nums[high] == nums[high - 1]) high--;
                        
                        // Move pointers inward
                        low++;
                        high--;
                    } else if (sum < target) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }
        
        return result;
    }
}