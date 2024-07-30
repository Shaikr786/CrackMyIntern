class Solution {
    public List<List<Integer>> combine(int n, int k) {  

        List<List<Integer>> result = new ArrayList<>();

        findCombinations(1 ,n ,new ArrayList<>() ,result ,k);
        return result;
    }

    private void findCombinations(int index ,int n ,List<Integer> ds ,List<List<Integer>> result ,int k)
    {
        if(index == n+1)
        {
            if(ds.size() == k)
            {
                result.add(new ArrayList<>(ds));
            }
            return;
        }

        if(ds.size() < k)
        {
            ds.add(index);
            findCombinations(index +1,n , ds ,result ,k);
            ds.remove(ds.size() -1);
        }
        findCombinations(index +1 ,n ,ds ,result, k);
    }
}