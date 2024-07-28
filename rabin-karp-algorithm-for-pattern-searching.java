public class SimpleRabinKarp {
    
    // Base value for hash function (simple prime number)
    private static final int BASE = 256;
    // Prime number to use for modulus operation
    private static final int MOD = 101;

    public static void search(String T, String P) {
        int m = P.length(); // Length of the pattern
        int n = T.length(); // Length of the text

        int pHash = 0; // Hash value for the pattern
        int tHash = 0; // Hash value for the current window in the text
        int h = 1; // Base^m-1 % MOD

        // Precompute (BASE^(m-1)) % MOD
        for (int i = 0; i < m - 1; i++) {
            h = (h * BASE) % MOD;
        }

        // Compute the hash value of the pattern and the first window of text
        for (int i = 0; i < m; i++) {
            pHash = (BASE * pHash + P.charAt(i)) % MOD;
            tHash = (BASE * tHash + T.charAt(i)) % MOD;
        }

        // Slide the pattern over the text
        for (int i = 0; i <= n - m; i++) {
            // Check hash values
            if (pHash == tHash) {
                // Hash values match, perform a string comparison to avoid hash collisions
                if (T.substring(i, i + m).equals(P)) {
                    System.out.println("Pattern found at index " + i);
                }
            }

            // Calculate hash value for the next window of text
            if (i < n - m) {
                tHash = (BASE * (tHash - T.charAt(i) * h) + T.charAt(i + m)) % MOD;
                if (tHash < 0) {
                    tHash += MOD;
                }
            }
        }
    }
}