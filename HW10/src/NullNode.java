public class NullNode extends TreeNode {

	public NullNode()
	{
	//Do Nothing.
	}
	public int getSize() 
	{
	return 0;
	}
	public TreeNode getLeft() 
	{
	return new NullNode();
	}
	public TreeNode getRight() 
	{
	return new NullNode();
	}
	public int getValue() 
	{
	return Integer.MIN_VALUE;
	}
	@Override
	public int compareTo(TreeNode o) {
		return 0;
	}
	@Override
	public void add(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		//do nothing
		return "";
	}

}
