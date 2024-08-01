class Solution{
    private boolean isPossible(int[] a, int[] b,int n)
    {
        Arrays.sort(a ,Collections.reverseOrder());

        Arrays.sort(b);

        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] + b[i] < k)
            {
                return false;
            }
        }
        return true;
    }
}