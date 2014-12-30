public class Node extends TreeNode {

	public int value;

	public Node (int i) {
		value = i;
		left = new NullNode();
		right = new NullNode();
	}
	
	public int getSize() {
		return 1 + left.getSize() + right.getSize();
	}
	
	public TreeNode getLeft() {
		return left;
	}
	
	public TreeNode getRight() {
		return right;
	}
	
	public int getValue() {
		return value;
	}

	@Override
	public int compareTo(TreeNode myNode) {
		// TODO Auto-generated method stub
		if (this.value > myNode.value) {
			return -1;
		}
		if (this.value < myNode.value) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public void add(int value) {
		TreeNode myNode = new Node(value);
		if (value < this.value) {
			if (this.getLeft().left == null) {
				this.left = myNode;
			}
			else {
				this.getLeft().add(value);
				
			}
		}
		else {
			if (this.getRight().right == null) {
				this.right = myNode;
				
			}
			else {
				this.getRight().add(value);
			}
		}
		
	}

	@Override
	public String toString() {
		String resultString;
		resultString = Integer.toString(this.value);
		resultString = resultString + " " + this.getLeft().toString();
		resultString = resultString + this.getRight().toString();
		return resultString;
	}

}
