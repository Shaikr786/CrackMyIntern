class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        List<String> result = new ArrayList<>();
        
        subsets(0 ,s ,new StringBuilder(),result);
        result.remove(""); // Removing empty string if it exists
        Collections.sort(result); // Sort the result lexicographically
        return result;
        
    
    }
    
    private void subsets(int index ,String s ,StringBuilder current ,List<String> result)
    {
        if(index == s.length())
        {
            result.add(current.toString());
            return;
        }
            current.append(s.charAt(index));
            subsets(index +1 ,s ,current ,result);
            current.deleteCharAt(current.length() -1);
            subsets(index +1 ,s ,current ,result);
    }
}