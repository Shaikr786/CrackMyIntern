class Solution {
    public String convertToTitle(int columnNumber) {
          StringBuilder result = new StringBuilder();
        
        while (columnNumber > 0) {
            columnNumber--; // Adjust for 0-indexing
            char ch = (char) (columnNumber % 26 + 'A');
            result.insert(0, ch); // Prepend character to result
            columnNumber /= 26;
        }
        
        return result.toString();
    }
}