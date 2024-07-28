class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                int liveNodes = liveNode(board , i , j);

                if(board[i][j] == 1 && (liveNodes < 2 || liveNodes > 3))
                {
                    board[i][j] = -1;
                }
                else if(board[i][j] == 0 && liveNodes == 3){
                    board[i][j] = 2;
                }
            }
        }

        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                if(board[i][j] == -1)
                {
                    board[i][j] = 0;
                }
                else if(board[i][j] == 2)
                {
                    board[i][j] = 1;
                }
            }
        }
        
    }

    private int liveNode(int[][] board , int row , int col)
    {
        int m = board.length;
        int n = board[0].length;
        int liveNeighbors = 0;

        for(int i = -1 ; i <= 1 ; i++)
        {
            for(int j = -1 ; j <= 1 ; j++)
            {
                if(i == 0 && j == 0)
                {
                    continue;
                }

                int r = row + i;
                int c = col + j;

                if(r >= 0 && r < m && c >= 0 && c < n && Math.abs(board[r][c]) == 1)
                {
                    liveNeighbors++;
                }
            } 
        }
        return liveNeighbors;

    }
}