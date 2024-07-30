class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        char[][] board = new char[n][n];

        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                board[i][j] = '.';
            }
        }

        List<List<String>> result  = new ArrayList<List<String>>();
        int[] leftRowCheck = new int[n];
        int[] upperDiagCheck = new int[2*n -1];
        int[] lowerDiagCheck = new int[2*n -1];

        solve(0 ,board ,leftRowCheck, upperDiagCheck, lowerDiagCheck ,result);
        return result;
    }

    private void solve(int col ,char[][] board , int[] leftRowCheck,int[] upperDiagCheck,int[] lowerDiagCheck ,List<List<String>> result )
    {
        if(col == board.length)
        {
            result.add(createBoard(board));
            return;
        }
        for(int row = 0 ; row < board.length ; row++)
        {
            if(leftRowCheck[row] == 0 && upperDiagCheck[row+col] == 0 && lowerDiagCheck[board.length -1 +col -row] == 0)
            {
                board[row][col] = 'Q';
                leftRowCheck[row] = 1;
                upperDiagCheck[row+col] = 1;
                lowerDiagCheck[board.length -1 +col -row] = 1;
                solve(col +1 ,board , leftRowCheck, upperDiagCheck, lowerDiagCheck ,result);

                board[row][col] = '.';
                leftRowCheck[row] = 0;
                upperDiagCheck[row+col] = 0;
                lowerDiagCheck[board.length -1 +col -row] = 0;
            }
        }
    }

    private List<String> createBoard(char[][] board)
    {
        List<String> result = new LinkedList<String>();
        for(int i  = 0 ; i < board.length ; i++)
        {
            String s = new String(board[i]);
            result.add(s);
        }
        
        return result;
    }
  
}