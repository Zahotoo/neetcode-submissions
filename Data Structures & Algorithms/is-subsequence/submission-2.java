class Solution {
    public boolean isSubsequence(String s, String t) {
        int lenS = s.length();
        int lenT = t.length();

        if (lenS == 0) return true;
        if (lenT == 0) return false;

        int j = 0;
        for (int i = 0; i < lenS; i++) {
            while (j < lenT && s.charAt(i) != t.charAt(j)) {
                j++;
            }
            if (j == lenT) {
                return false;
            }
            j++;
        }

        return true;
    }
}