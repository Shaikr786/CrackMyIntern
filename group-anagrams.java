class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //sorting is the key for this

        HashMap<String ,List<String>> map = new HashMap<>();

        for(String s: strs)
        {
            char[] ch = s.toCharArray();

            Arrays.sort(ch);

            String sortedArray = new String(ch);

            if(!map.containsKey(sortedArray))
            {
                map.put(sortedArray ,new ArrayList<>());
            }

            map.get(sortedArray).add(s);
        }

        return new ArrayList<>(map.values());

    }
}