class Solution {
    public char findTheDifference(String s, String t) {
        int[] index = new int[26];

        for (char c : t.toCharArray()) {
            index[c - 'a']++;
        }

        for (char c : s.toCharArray()) {
            index[c - 'a']--;
        }

        for(int i = 0; i < index.length; i++) {
            if (index[i] == 1) {
                return (char) (i + 'a');
            }
        }

        return ' ';
    }
}