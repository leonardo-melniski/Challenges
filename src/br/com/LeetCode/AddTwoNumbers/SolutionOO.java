package br.com.LeetCode.AddTwoNumbers;

class SolutionOO implements Solution {
	
	int carry = 0;
	
	ListNode result;
	ListNode iresult;
	
	ListNode l1, l2;
	
	public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
		l1 = list1;
		l2 = list2;
		
		firstAddNode();
		
		addWhileExistNode();
		
		addCarryNodeIfWillNeeded();
		
		return result;
	}
	
	private void addCarryNodeIfWillNeeded() {
		if (carry > 0) {
			iresult.next = new ListNode(carry);
		}
	}
	
	private void addWhileExistNode() {
		while (l1 != null || l2 != null) {
			int v1 = l1 != null ? l1.val : 0;
			int v2 = l2 != null ? l2.val : 0;
			
			increaseNodeOnListResult(addValues(v1, v2));
			
			if(l1 != null) l1 = l1.next;
			if(l2 != null) l2 = l2.next;
		}
	}
	
	private void increaseNodeOnListResult(int newValue) {
		iresult.next = new ListNode(newValue);
		iresult = iresult.next;
	}
	
	private int addValues(int x, int y) {
		int val = x + y + carry;
		int value = val % 10 ;    // carry in
		this.carry = val / 10;    // carry out
		return value;
	}
	
	private void firstAddNode() {
		carry = 0;
		this.result = new ListNode(addValues(l1.val, l2.val));
		iresult = result;
		l1 = l1.next;
		l2 = l2.next;
	}
	
}