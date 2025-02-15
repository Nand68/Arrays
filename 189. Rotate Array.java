class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        if (k == 0) return;  

        ReverseArray(nums, 0, n - k);
        ReverseArray(nums, n - k, n);
        ReverseArray(nums, 0, n);
    }

    public void ReverseArray(int[] nums, int start, int end) {
        for (int i = start, j = end - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
