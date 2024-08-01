class Solution {

    //memoization technique
    public int fib(int n) {

        HashMap<Integer ,Integer> map = new HashMap<>();

        if(n <= 1)
        {
            return n;
        }

        if(map.containsKey(n))
        {
            return map.get(n);
        }
        int result = fib(n -1) + fib(n -2);
        map.put(n ,result);
        return result;
    }
}

//tabulation method

class Solution {
    public int fib(int n) {

        if(n <= 1)
        {
            return n;
        }

        int prev2 = 0;
        int prev1 = 1;
        int cur = 0;

        //using tabulation by optimized space
        for(int i = 2 ; i <= n ; i++)
        {
            cur = prev1 + prev2;
            prev2 = prev1;
            prev1 = cur;
        }

        return prev1;
    }
}