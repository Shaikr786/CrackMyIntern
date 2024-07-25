class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, left = 0;
        int bottom = m -1;
        int right = n -1;

        while(top <= bottom && left <= right)
        {
            for(int i = left ; i <= right ; i++)
            {
                result.add(matrix[top][i]);
            }
            top++;

            for(int i = top ; i <= bottom ; i++)
            {
                result.add(matrix[i][right]);
            }
            right--;

            //checking if any more rows present
            if(top <= bottom)
            {
                for(int i = right ; i >= left ; i--)
                {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //checking for any more columns present
            if(left <= right)
            {

                for(int i = bottom ; i >= top ; i--)
                {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }return result;
    }
}