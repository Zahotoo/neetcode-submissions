class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        
        for (int i = 0; i < len; i++) {
            if (i == len - 1) {
                arr[i] = -1;
                break;
            }
            int max = -1;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] > max) {
                    max = arr[j];

                }
            arr[i] = max;
            }
        }

        return arr;
    }
}