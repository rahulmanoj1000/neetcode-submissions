class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int op = 0;
        while(l < r) {
            int leftBar = heights[l];
            int rightBar = heights[r];
            int gap = r - l;
            if(leftBar < rightBar) {
                op = Math.max(op, (leftBar * gap));
                l++;
            } else {
                op = Math.max(op, (rightBar * gap));
                r--;
            }
        }
        return op;
    }
}
