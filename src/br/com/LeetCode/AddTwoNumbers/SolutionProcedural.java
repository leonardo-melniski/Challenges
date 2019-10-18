package br.com.LeetCode.AddTwoNumbers;

class SolutionProcedural implements Solution {
	
	public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
		
		ListNode anchor  = new ListNode(0);
		ListNode curr = anchor;
		ListNode l1 = list1, l2 = list2;
		int carry = 0;
		
		while(l1 != null || l2 != null){
			int x = l1 != null ? l1.val : 0;
			int y = l2 != null ? l2.val : 0;
			int val = x + y + carry;
			carry = val / 10;
			curr.next = new ListNode(val % 10);
			curr = curr.next;
			if(l1 != null) l1 = l1.next;
			if(l2 != null) l2 = l2.next;
		}
		if(carry > 0) curr.next = new ListNode(carry);
		
		return anchor.next;
	}

}