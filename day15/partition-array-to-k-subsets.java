
class Solution
{
    public boolean isKPartitionPossible(int a[], int n, int k)
    {
	// Your code here	
	    int totalSum = Arrays.stream(a).sum();
	    
	    boolean[] visited = new boolean[n];
	    
	    if(totalSum % k != 0)
	    {
	        return false;
	    }
	    
	    int targetSum = totalSum / k;
	    
	    if (a[n- 1] > targetSum) {
            return false; // If the largest element is greater than the target, it's impossible
        }

	    return backtrack(a ,k ,targetSum ,visited ,0 ,0 ,n);
    }
    
    private boolean backtrack(int[] a, int k ,int targetSum ,boolean[] visited ,int currentSum ,int startIndex ,int n)
    {
        if(k == 0)
        {
            return true;
        }
        
        if(currentSum == targetSum)
        {
            return backtrack(a ,k -1 ,targetSum ,visited ,0 ,0 , n);
        }
        for(int i = startIndex ; i < n ; i++)
        {
            if(!visited[i] && currentSum + a[i] <= targetSum)
            {
                visited[i] = true;
                if(backtrack(a , k  , targetSum ,visited ,currentSum +a[i] ,startIndex +1 ,n))
                {
                    return true;
                }
                visited[i] = false;
            }
        }
        return false;
    }
}