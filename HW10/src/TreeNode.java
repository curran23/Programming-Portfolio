public abstract class TreeNode implements Comparable<TreeNode>
{
	protected int value;
	protected TreeNode left;
	protected TreeNode right;
	
	
	public abstract int getValue();
	public abstract int getSize();
	public abstract TreeNode getLeft();
	public abstract TreeNode getRight();
	public abstract void add(int value);
	public abstract String toString();
	//public abstract void remove(int value) throws NotFoundException;
}
