
class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean graphColoring(boolean graph[][], int m, int n) {
        // Your code here
        int[] color = new int[n];
        
        for(int i = 0 ; i < n ; i++)
        {
            color[i] = 0;
        }
        
        return canColor(graph ,color ,m ,0 ,n);
    }
    
    private boolean canColor(boolean[][] graph ,int[] color ,int m ,int node ,int n)
    {
        if(node == n)
        {
            return true;
        }
        
        for(int c = 1 ; c <= m ; c++)
        {
            if(isSafe(graph ,color ,m ,node ,n ,c))
            {
                color[node] = c;
                
                if(canColor(graph ,color ,m ,node+1 ,n))
                {
                    return true;
                }
                color[node] = 0;
            }
        }
        return false;
    }
    
    private boolean isSafe(boolean[][] graph ,int[] color ,int m ,int node ,int n ,int c)
    {
        for(int i = 0 ; i < n ; i++)
        {
            if(graph[node][i] && color[i] == c)
            {
                return false;
            }
        }
        return true;
    }
}