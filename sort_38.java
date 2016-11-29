package silicon;

public class sort_38 {
	public boolean haspathsum(TreeNode root,int sum){
		if(root==null){
			return false;
		}
		if(root.left==null&&root.right==null&&root.val==sum){
			return true;
		}
		else{
			return haspathsum(root.left, sum-root.val)||haspathsum(root.right, sum-root.val);
		}
	}

}
