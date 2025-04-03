package demo.ranjith.simple;

public class findTheLongestSubStringPalindrome {
	
	public static void main(String[] args) {
		String str="cbbd";
		String result=isPalindrome(str);
		System.out.println(result);
	}
	public static String expand(String str,int begin, int end) {
		while(begin>=0 && end<str.length() && str.charAt(begin)==str.charAt(end)) {
			begin--;
			end++;
		}
		return str.substring(begin+1,end);
	}
	
	
	
	public static String isPalindrome(String str) {
		int count=0;
		if(str.length()<=1) {
			return str;
		}
		String sub=str.substring(0,1);
		for(int i=0;i<str.length()-1;i++) {
			String even=expand(str,i,i);
			String odd=expand(str,i,i+1);
			
			if(even.length()>count || odd.length()>count) {
				count+=even.length()>odd.length() ? even.length() :odd.length();
				sub=even.length()>odd.length() ? even:odd;
			}
		}
		
		
		
		
		
		return sub;
	}

}
