package assignment2;

public class QuestionTwo {
	
	public boolean foundSaddle = false;
	
	public static void main(String[] args) {
		
		Node F = new Node(15, "F");
		Node E = new Node(16, "E");
		Node H = new Node(17, "H");
		Node B = new Node(14, "B");
		Node G = new Node(16, "G");
		Node I = new Node(8, "I");
		Node A = new Node(8, "A");
		Node C = new Node(7, "C");
		Node D = new Node(5, "D");
		
		F.setLeft(E);
		F.setRight(H);
		
		E.setLeft(B);
		
		H.setLeft(G);
		H.setRight(I);
		
		B.setLeft(A);
		B.setRight(C);
		
		C.setRight(D);
		
		System.out.println(find_saddle(F, Integer.MAX_VALUE));
	}
	
	public static int find_saddle(Node n, int parent_min) {
		
		
			int child_min = Math.min(n.getKey(), parent_min);
			
			int left_max = Integer.MIN_VALUE;
			int right_max = Integer.MIN_VALUE;
			
			if(n.getLeft() != null) {
				left_max = find_saddle(n.getLeft(), child_min);
			}
			
			if(n.getRight() != null) {
				right_max = find_saddle(n.getRight(), child_min);
			}
			
			int child_max = Math.max(left_max, right_max);
			
			if(n.getKey() > child_max && n.getKey() < parent_min) {
				System.out.println("Saddle Found: " + n.getName() + " " + n.getKey());
				return n.getKey();
			}

		return Integer.max(child_max, n.getKey());
	}
}


















