package silicon;


public class sort_31 {
	public static ListNode partitionList(ListNode head,int x){
		ListNode dummy=new ListNode(0);
		dummy.next=head;
		ListNode dummyx=new ListNode(x);
		ListNode cur=head;
		ListNode pre=dummy;
		ListNode prex=dummyx;
		while(cur!=null){
			ListNode next=cur.next;
			if(cur.val<x){
				pre.next=cur;
				pre=cur;
			}
			else{
				prex.next=cur;
				prex=cur;
				prex.next=null;
			}
			cur=next;
		}
		pre.next=dummyx.next;
		return dummy.next;	
	}

}
