package silicon;

public class sort_34 {
	public static TreeNode LCA(TreeNode root,TreeNode p,TreeNode q){
		if(root==null||p==null||q==null){
			return null;
		}
		if(root.val>p.val&&root.val>q.val){
			return LCA(root.left,p,q);
		}
		else if(root.val<p.val&&root.val<q.val){
			return LCA(root.right,p,q);
		}
		else{
			return root;
		}
	}
}
