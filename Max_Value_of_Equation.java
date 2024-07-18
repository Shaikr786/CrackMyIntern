class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int max = Integer.MIN_VALUE;

        Deque<int[]> deque = new LinkedList<>();

        for(int[] point: points)
        {
            int x = point[0];
            int y = point[1];
            //checking the base case if exceeds the difference of the existing value and the present val difference exceeds the given k
            while(!deque.isEmpty() && x - deque.peekFirst()[0] > k)
            {
                deque.pollFirst();
            }
            //finding the maximum values
            if(!deque.isEmpty())
            {
                max = Math.max(max ,y+deque.peekFirst()[1] + x-deque.peekFirst()[0]);
            }

            //checking the potential of the existing values compared witht the previous values
            while(!deque.isEmpty() && y - x > deque.peekLast()[1] - deque.peekLast()[0])
            {
                deque.pollLast();
            }

            deque.addLast(new int[]{x ,y});
        }
        return max;
    }
}