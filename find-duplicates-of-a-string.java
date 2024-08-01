class Solution{
    public static void findDuplicates(String S) {
        int n = S.length();
        HashSet<Character> checked = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            char current = S.charAt(i);
            int count = 0;
            
            if (!checked.contains(current)) {
                for (int j = 0; j < n; j++) {
                    if (S.charAt(j) == current) {
                        count++;
                    }
                }
                if (count > 1) {
                    System.out.println(current + ": " + count);
                }
                
                checked.add(current);
            }
        }
    }
}