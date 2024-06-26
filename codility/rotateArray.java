package codility;

public class rotateArray {
	public void rotate(int[] nums, int k) {
		k = k % nums.length; // to know how many numbers to reverse
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}

	public void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			start++;
			end--;
		}
	}

	public static void main(String[] args) {

	}
}
