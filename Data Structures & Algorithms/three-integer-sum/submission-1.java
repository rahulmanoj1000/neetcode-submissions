class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> op = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate i values
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];

                if (sum == 0) {
                    op.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    // Skip duplicate left
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    // Skip duplicate right
                    while (l < r && nums[r] == nums[r - 1]) r--;

                    l++;
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        return op;
    }
}
