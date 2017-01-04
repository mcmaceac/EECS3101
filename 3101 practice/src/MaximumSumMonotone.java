/*
 * The Maximum-Sum Monotone Sub-Array Problem:
Input: An array A[1..n] of arbitrary positive integers.
Output: The maximum-element-sum contiguous sub-array of A[1..n] whose entries
 form a monotone sequence (either ascending or descending). 
 */
public class MaximumSumMonotone {
	public static void main(String[] args) {
		int[] A = {-1, 4, 3, -2, 5, 23, -45};
		
		int n = A.length;
		
		System.out.println(MaxSumSubarray(A, n));
	}
	
	public static int MaxSumSubarray(int[] A, int n) {
		if (n == 1) {
			return A[0];
		}
		
		int sum = 0;
		int m = n / 2;
		int leftMSS = MaxSumSubarray(A, m);
		int rightMSS = MaxSumSubarray(A, n - m);
		
		int leftSum = Integer.MIN_VALUE;
		int rightSum = Integer.MIN_VALUE;
		
		for (int i = m - 1; i >= 0; i--) {
			sum += A[i];
			leftSum = Integer.max(leftSum, sum);
		}
		sum = 0;
		for (int i = m; i < n; i++) {
			sum += A[i];
			rightSum = Integer.max(rightSum, sum);
		}
		
		int leftRightMax = Integer.max(leftSum, rightSum);
		return Integer.max(leftRightMax, leftSum + rightSum);
	}
}
