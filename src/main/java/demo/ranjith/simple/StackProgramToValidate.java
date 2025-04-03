package demo.ranjith.simple;

import java.util.Stack;

public class StackProgramToValidate {

	public static void main(String[] args) {
        String str="{()}{[()()]}";
        usingMethod(str);
	}
	
	private static boolean isReserve(char top,char current) {
		if ((top=='(' && current==')') ||(top=='{' && current=='}') ||(top=='[' && current==']')) {
			return true;
		}
		
		return false;
	}
	
	private static void usingMethod(String str) {
		Stack<Character> stack=new Stack<>();
		int count=0;
		for(char c:str.toCharArray()) {
			if(stack.isEmpty()) {
				//stack.push(c);
				stack.add(c);
				System.out.println(c+":"+count++);
			}else {
			if(isReserve(stack.peek(),c)) {
				//stack.pop();
				stack.remove(stack.peek());
			}else {
				//stack.push(c);
				stack.add(c);
			}
			}
		}
		System.out.println(stack.isEmpty());
		
	}

}
