package Stack_12;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class balanced_parenthesis {
	
	static boolean isBalanced(String str) {
		Deque<Character> s = new ArrayDeque<>();
		for(int i = 0; i<str.length(); i++) {
			char x = str.charAt(i);
			if(x=='('||x=='{'||x=='[') s.push(x);
			else {
				if(s.isEmpty()==true)	return false;
				else if(matching(s.peek(),x)==false) {
					return false;
				}
				else {
					s.pop();
				}
			}
		}
		return (s.isEmpty()==true);
	}
	
	static boolean matching(char a, char b) {
		return ((a=='('&&b==')')||
				(a=='{'&&b=='}')||
				(a=='['&&b==']'));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextLine()) {
			String str = sc.nextLine();
			if(isBalanced(str)) {
				System.out.println("String is a balanced parenthesis");
			}
			else {
				System.out.println("String is not a balanced parenthesis");
			}
		}
		
	}

}
