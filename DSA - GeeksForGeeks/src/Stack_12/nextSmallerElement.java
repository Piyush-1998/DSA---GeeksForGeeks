package Stack_12;

import java.util.Stack;

public class nextSmallerElement {
	
	public static int[] smallerelement(int[] nums) {
		Stack<Integer> st = new Stack<>();
		for(int i =nums.length-1; i>=0; i--) {
			st.push(nums[i]);
		}
		int[] smaller = new int[nums.length];
		for(int i =nums.length-1; i>=0; i--) {
			while(!st.empty()&&st.peek()>=nums[i]) {
				st.pop();
			}
			smaller[i] = st.empty()?-1:st.peek();
			st.push(nums[i]);
		}
		return smaller;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {11,13,3,10,7,21,26};
		smallerelement(arr);

	}

}
