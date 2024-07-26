
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        Queue<Integer> q = new LinkedList<>();
        
        boolean vis[] = new boolean[V];
        
        ArrayList<Integer> bfs = new ArrayList<>();
        
        q.add(0);
        vis[0] = true;
        
        while(!q.isEmpty())
        {
            Integer node = q.poll();
            
            bfs.add(node);
            
            for(Integer it : adj.get(node))
            {
                if(!vis[it])
                {
                    vis[it] = true;
                    q.add(it);
                }
            }
        }return bfs;
    }
}