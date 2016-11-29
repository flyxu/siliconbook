package silicon;

public class reverseKgroup {
	public ListNode reversekgroup(ListNode head,int k){
		if(head==null||k==1){
			return head;
		}
		ListNode dummy=new ListNode(0);
		dummy.next=head;
		ListNode start=dummy;
		ListNode end=head;
		int i=1;
		while(end!=null){
			end=end.next;
			if(i%k==0){
				start=reverse(start, end);
			}
			i++;
		}
		return dummy.next;
		
	}
	public ListNode reverse(ListNode start,ListNode end){
		ListNode pre=start.next;
		ListNode cur=pre.next;
		while(cur!=end){
			pre.next=cur.next;//防止断链
			cur.next=start.next;
			start.next=cur;
			cur=pre.next;
		}
		return pre;
		
	}

}
