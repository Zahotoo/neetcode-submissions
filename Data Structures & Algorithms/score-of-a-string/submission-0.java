class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        
        for (int i = 0; i < s.length() - 1; i++) {
            int curr = s.charAt(i) - 'a';
            int nex = s.charAt(i + 1) - 'a';

            sum += Math.abs(curr - nex);
        }

        return sum;
    }
}