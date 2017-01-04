/*
 * Double Vision in Sorted Array:
 * Design and analyze an O(n) time in-place algorithm for the following problem.
 * Input: An array A[1..n] of n positive real numbers sorted in increasing order.
 * Output: True if there is a pair of indices i and j such that A[i] = 2A[j] ; false otherwise. 
 */
public class DoubleVision {
	
	public static void main(String[] args) {
		int[] A = { 1, 5, 6, 9, 10, 41, 23 };
		int i = 0;
		int j = 0;
		int n = A.length;
		
		if (A[i] == 2 * A[j]) {
			System.out.println("i: " + i + " j: ");
			System.out.println("A[" + i + "] = " + A[i] + " A[" + j + "] = " + A[j]);
		}
		i++;
		
		while (j < i && i < n) {
			if (A[i] == 2 * A[j]) {
				System.out.println("i: " + i + " j: " + j);
				System.out.println("A[" + i + "] = " + A[i] + " A[" + j + "] = " + A[j]);
				i = n;
			}
			else if (A[i] < 2 * A[j]) {
				i++;
			}
			else {
				j++;
				if (i == j) {
					i++;
				}
			}
		}
		
	}
}
