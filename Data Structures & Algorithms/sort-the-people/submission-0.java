class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, Integer> map = new HashMap<>();
        String[] res = new String[names.length];

        for (int i = 0; i < heights.length; i++) {
            map.put(heights[i], i);
        }

        Arrays.sort(heights);

        for (int i = 0; i < names.length; i++) {
            res[i] = names[map.get(heights[names.length - 1 - i])];
        }

        return res;
    }
}