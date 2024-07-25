class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        //replaces any sequence of whitespace characters (including multiple spaces) with a single space.
        s = s.replaceAll("\\s{2,}", " ");
        String[] words = s.split(" ");

        StringBuilder result = new StringBuilder();

        int index = 0;
        for(int i = words.length -1 ; i >= 0 ; i--)
        {
            if(words[i] !=" ")
            {
            result.append(words[i]);
            if(i > 0)
            {
                result.append(" ");
            }
            }
        }

        return result.toString();
    }
}