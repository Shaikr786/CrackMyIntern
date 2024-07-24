class Solution
{
    public long findMinDiff(ArrayList<Integer> a, int n, int m) {
        // If there are no students or no packets
        if (m == 0 || n == 0) {
            return 0;
        }

        // Sort the given packets
        Collections.sort(a);

        // Number of students cannot be more than number of packets
        if (n < m) {
            return -1;
        }

        // Initialize the minimum difference as a large value
        long minDiff = Long.MAX_VALUE;

        // Find the minimum difference
        for (int i = 0; i + m - 1 < n; i++) {
            long diff = a.get(i + m - 1) - a.get(i);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        return minDiff;
    }
}