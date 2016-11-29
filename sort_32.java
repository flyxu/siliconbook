package silicon;

public class sort_32 {
	public ListNode deletesamenode(ListNode head){
		if(head==null){
			return null;
		}
		ListNode pre=head;
		ListNode cur=head.next;
		while(cur!=null){
			if(cur.val!=pre.val){
				pre=cur;
				cur=cur.next;
			}
			else{
				cur=cur.next;
				pre.next=cur;
			}
		}
		return head;			
	}
	
	public ListNode deleteduplicatenode(ListNode head){
		ListNode dummy=new ListNode(0);
		dummy.next=head;
		ListNode tail=dummy;
		ListNode cur=head;
		ListNode pre=head;
		while(cur!=null){
			while(cur.val==cur.next.val){
				cur=cur.next;
			}
			if(pre==cur){
				tail.next=pre;
				tail=pre;
			}
			//0 1 1 3 4 
			pre=cur.next;
			cur=cur.next;
		}
		
		return dummy.next;
	}
	
}

