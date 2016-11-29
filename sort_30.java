package silicon;

public class sort_30 {
	public static ListNode addtwonumbers(ListNode l1,ListNode l2){
		ListNode iter1=l1;
		ListNode inte2=l2;
		ListNode head=null;
		ListNode tail=null;
		int carry=0;
		int sum=0;
		while(l1!=null||l2!=null||carry!=0){
			int num1=l1==null?0:l1.val;
			int num2=l2==null?0:l2.val;
			sum=num1+num2+carry;
			carry=sum/10;
			if(head==null){
				head=new ListNode(sum%10);;
				tail=head;
			}
			else{
				tail.next=new ListNode(sum%10);
				tail=tail.next;
			}
			l1=l1.next;
			l2=l2.next;
		}
		return head;	
	}

}
