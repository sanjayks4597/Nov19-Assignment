package Stack;

import java.util.Stack;

public class ReveseString {

	public static String revese(String s) {
		String s2="";
		Stack<Character> stk=new Stack<>();
			
			for(int i=0;i<s.length();i++)
			{
				stk.push(s.charAt(i));
			}
			while(!stk.isEmpty())
			{
				char ch=(char)stk.peek();
				s2=s2+ch;
				stk.pop();
				
			}
			return s2;
	}
	public static void main(String[] args) {
		String s="hi i am arun";
		String []str=s.split(" ");
		String s1="";
		for(int i=str.length-1;i>=0;i--)
		{
			s1=s1+revese(str[i])+" ";
		}
		System.out.println(s1.trim());
	}

}
