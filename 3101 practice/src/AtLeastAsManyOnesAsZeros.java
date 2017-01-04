/*
 * Input: An array A[1..n], with each element 0 or 1.
Output: the longest contiguous sub-array of A[1..n] that contains at least as many 1’s as 0’s.
 *
 */

public class AtLeastAsManyOnesAsZeros {
	public static void main(String[] args) {
		int[] A = {0, 1, 0, 1};
		int n = A.length;
		
		int oneZeroDiff = 0;
		int currSubArrayLength = 0;
		int maxSubArrayLength = 0;
		
		int lastIndex = 0;
		
		for (int i = 0; i < n; i++) {
			if (A[i] == 0) {
				oneZeroDiff--;
			}
			else {
				oneZeroDiff++;
			}
			
			if (oneZeroDiff >= 0) {				//there are at least as many 0s as ones
				currSubArrayLength++;
				maxSubArrayLength = Integer.max(maxSubArrayLength, currSubArrayLength); 				
			}
			else {
				lastIndex = i - 1;				//the last index is the previous index since this new element makes the subbarray not meet our condition 
				maxSubArrayLength = Integer.max(maxSubArrayLength, currSubArrayLength); 				
				currSubArrayLength = 0;
				oneZeroDiff = 0;
			}
		}
		
		System.out.println(maxSubArrayLength);
	}
}
