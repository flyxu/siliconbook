package silicon;

public class sort_27 {
	public int getcirclelength(ListNode head){
		if(head==null||head.next==null){return 0;}
		ListNode slow=head;
		ListNode fast=head;
		int length;
		while(fast!=null&&fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast){
				length=getLength(slow);
				return length;
			}
		}
		return 0;
		
	}
	public int getLength(ListNode node){
		ListNode cur=node;
		int length=1;
		while(cur.next!=node){
			length++;
			cur=cur.next;
		}
		return length;
	}

}
