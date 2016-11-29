package silicon;

import java.util.Currency;

public class sort_28 {
	public  ListNode reverseList(ListNode head){
		if(head==null||head.next==null){
			return head;
		}
		ListNode node=reverseList(head.next);
		head.next.next=head;
		head.next=null;
		return node;	
	}
	public ListNode notRereverseList(ListNode head){
		ListNode dummy=new ListNode(0);
		dummy.next=head;
		if (head==null) return head;
		ListNode cur=head.next;
		head.next=null;
		ListNode tmp=null;
		while(cur!=null){
			tmp=cur.next;
			cur.next=dummy.next;
			dummy.next=cur;	
			cur=cur.next;
		}
		return dummy.next;
	}
	public ListNode reversebetween(ListNode head,int m,int n){
		ListNode dummy=new ListNode(0);
		dummy.next=head;
		ListNode cur=head;
		ListNode next=null;
		ListNode mnode=null;
		ListNode tmpdummy=null;
		for(int i=1;i<=n;i++){
			if(i==m-1){
				tmpdummy=cur;
			}
			if(i==m){
				mnode=cur;
			}
			next=cur.next;
			if(i>m&&i<=n){
				mnode.next=next;//防止断链
				cur.next=tmpdummy.next;
				tmpdummy.next=cur;
			}
			cur=next;
		}
		return dummy.next;
		
	}
}
