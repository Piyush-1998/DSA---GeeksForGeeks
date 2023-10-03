package Stack_12;

import java.util.Stack;

public class nextGreaterElement {
	
	public static int[] greaterelement(int[] nums) {
		Stack<Integer> st = new Stack<>();
		for(int i =nums.length-1; i>=0; i--) {
			st.push(nums[i]);
		}
		int[] greater = new int[nums.length];
		for(int i =nums.length-1; i>=0; i--) {
			while(!st.empty()&&st.peek()<=nums[i]) {
				st.pop();
			}
			greater[i] = st.empty()?-1:st.peek();
			st.push(nums[i]);
		}
		return greater;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {11,13,3,10,7,21,26};
		greaterelement(arr);
	}

}
