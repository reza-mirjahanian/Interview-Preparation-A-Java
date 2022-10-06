
package org.example;

public class L2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode curr = dummyHead;
		int carry = 0;
		while (l1 != null || l2 != null || carry != 0) {
			int x = (l1 != null) ? l1.val : 0;
			int y = (l2 != null) ? l2.val : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
		}
		return dummyHead.next;
	}

	static ListNode createListNode(Iterable<Integer> ints) {
		ListNode prev = null;
		ListNode l = null;
		for (Integer i : ints) {
			if (prev == null) {
				l = prev = new ListNode(i);
			}
			else {
				prev.next = new ListNode(i);
				prev = prev.next;
			}
		}
		printListNode(l);
		return l;
	}

	private static void printListNode(ListNode l) {
		if (l == null) return;
		System.out.print(l.val);
		while (l.next != null) {
			l = l.next;
			System.out.print("->" + l.val);
		}
		System.out.println();
	}

	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder("[");
			ListNode l = this;
			sb.append(l.val);
			while (l.next != null) {
				sb.append(",").append(l.next.val);
				l = l.next;
			}
			sb.append("]");
			return sb.toString();
		}
	}
}