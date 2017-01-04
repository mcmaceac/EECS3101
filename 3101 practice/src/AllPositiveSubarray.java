/*
 * The Longest All-Positive Sub-Array Problem:
Input: An array A[1..n] of arbitrary integers.
Output: The longest contiguous sub-array of A[1..n] with positive entries only. 
 */
public class AllPositiveSubarray {
	public static void main(String[] args) {
		int[] A = {1, 2, 2, 2, -4, 5, 4, 2, -4, -2, 1, 2 };
		int n = A.length;
		
		int longestTotal = 0;
		int longest = 0;
		int firstIndex = 0;
		
		for (int i = 0; i < n; i++) {
			if (A[i] >= 0) {
				longest++;
			}
			else if (longest > longestTotal) {					// negative entry found, reset counter and update total
				longestTotal = longest;
				longest = 0;
				firstIndex = i - longestTotal;
			}
			else {												// longest subarray isn't longer than what we have
				longest = 0;
			}
		}
		
		System.out.println("Length of the longest all-positive subarray: " + longestTotal);
		System.out.print("Longest subarray = { ");
		
		for (int i = firstIndex; i < longestTotal + firstIndex; i++) {
			if (i + 1 == longestTotal + firstIndex) {
				System.out.print(A[i]);
			}
			else {
				System.out.print(A[i] + ", ");
			} 
		}
		System.out.println(" }");
	}
}
