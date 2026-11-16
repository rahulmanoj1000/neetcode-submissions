class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;

        int op = 0;
        while(l < r) {
            int lowerSide = Math.min(heights[l], heights[r]);
            int water = lowerSide * (r - l);
            op = Math.max(water, op);
            if(heights[l] < heights[r]){
                l++;
            } else {
                r--;
            }
        }
        return op;
    }
}
