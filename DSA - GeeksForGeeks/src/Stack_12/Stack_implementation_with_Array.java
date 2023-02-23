package Stack_12;

class MyStack {
	int arr[];
	int cap;
	int top;
	
	MyStack(int c) {
		top =-1;
		cap = c;
		arr = new int[cap];
	}
	
	void push(int x) {
		top++;
		arr[top]=x;
	}
	
	int pop() {
		int res = arr[top];
		top--;
		return res;
	}
	
	int size() {
		return top+1;
	}
	boolean isEmpty() {
		return(top==-1);
	}
	int peek() {
		return arr[top];
	}
}

public class Stack_implementation_with_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack s = new MyStack(5);
		s.push(10);
		s.push(20);
		System.out.println(s.pop());
		s.push(30);
		System.out.println(s.size());
		System.out.println(s.peek());
	}

}

