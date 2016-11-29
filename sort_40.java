package silicon;

public class sort_40 {
	public boolean isBalanced(TreeNode root){
		return (getHeight(root)!=-1);
	}
	public int getHeight(TreeNode root){
		if(root==null)
			return 0;
		int leftLength=getHeight(root.left);
		if(leftLength==-1) return -1;
		int rightLength=getHeight(root.right);
		if(rightLength==-1) return -1;
		if(Math.abs(leftLength-rightLength)>1){
			return -1;
		}
		return 1+Math.max(leftLength, rightLength);
	}

}
