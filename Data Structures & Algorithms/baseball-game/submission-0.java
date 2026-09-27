class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for (String s : operations) {
            if (s.equals("+")) {
                int top = st.pop();
                int newTop = top + st.peek();
                st.push(top);
                st.push(newTop);
            } else if (s.equals("D")) {
                st.push(2 * st.peek());
            } else if (s.equals("C")) {
                st.pop();
            } else {
                st.push(Integer.valueOf(s));
            }
        }

        int sum = 0;
        for (int score : st) {
            sum += score;
        }

        return sum;
    }
}