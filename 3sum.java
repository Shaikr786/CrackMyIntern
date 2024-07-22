class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // This list will store the result triplets
        List<List<Integer>> result = new ArrayList<>();
        
        // Sort the array to facilitate the two-pointer approach
        Arrays.sort(nums);
        
        // Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements to avoid duplicate triplets
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                // Initialize two pointers
                int low = i + 1, high = nums.length - 1, sum = -nums[i];
                
                // Use the two-pointer technique to find pairs that sum up to the required value
                while (low < high) {
                    if (nums[low] + nums[high] == sum) {
                        // Add the triplet to the result list
                        result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        
                        // Skip duplicate elements for the second and third elements of the triplet
                        while (low < high && nums[low] == nums[low + 1]) low++;
                        while (low < high && nums[high] == nums[high - 1]) high--;
                        
                        // Move the pointers inward
                        low++;
                        high--;
                    } else if (nums[low] + nums[high] < sum) {
                        // If the sum is less than the required value, move the low pointer to the right
                        low++;
                    } else {
                        // If the sum is greater than the required value, move the high pointer to the left
                        high--;
                    }
                }
            }
        }
        return result;
    }
}