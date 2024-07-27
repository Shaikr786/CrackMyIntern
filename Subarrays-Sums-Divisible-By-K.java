class Solution {
     public int subarraysDivByK(int[] nums, int k) {
         HashMap<Integer, Integer> prefixModCount = new HashMap<>();
        prefixModCount.put(0, 1); // Initial prefix sum of 0

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;
            int mod = (prefixSum % k + k) % k; // Handle negative mods

            if (prefixModCount.containsKey(mod)) {
                count += prefixModCount.get(mod);
            }

            prefixModCount.put(mod, prefixModCount.getOrDefault(mod, 0) + 1);
        }

        return count;
    }

}