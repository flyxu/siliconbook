package silicon;

public class sort_26 {
	public static ListNode mergetwoLists(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode curl = dummy;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				curl.next = l1;
				l1 = l1.next;
			} else {
				curl.next = l2;
				l2 = l2.next;
			}
			curl = curl.next;
		}
		if (l1 != null) {
			curl.next = l1;
		}
		if (l2 != null) {
			curl.next = l2;
		}
		return dummy.next;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(5);
		ListNode node2 = new ListNode(15);
		ListNode node3 = new ListNode(10);
		ListNode node4 = new ListNode(15);
		ListNode node5 = new ListNode(20);
		node1.next = node2;
		node3.next = node4;
		node4.next = node5;

		// System.out.println(Arrays.toString(node1));
		System.out.println(node3);
	}

}
