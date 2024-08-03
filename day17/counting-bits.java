class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
         // method to count the number of 1's in the binary representation of a number
   
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        
        return ans;

    }
}