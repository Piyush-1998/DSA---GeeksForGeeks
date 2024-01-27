package Strings_10;
import java.util.*;

public class AddString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = "11";
		String num2 = "123";
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		String big = num1.length()>=num2.length()?num1:num2;
		String small = num1.length()<num2.length()?num2:num1;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i <big.length(); i++) {
			int b = big.charAt(big.length()-i-1)-'0';
			int s = i<small.length() ? (small.charAt(small.length()-i-1))-'0' : '0';
			sum = sum+b+s;
			sb.append(sum%10);
			sum /=10;
		}
		if(sum>0) sb.append(sum);
		System.out.println(sb.reverse().toString());
		

	}

}
