package demo.ranjith.simple;

public class CountOfCharacters {

	public static void main(String[] args) {
		
		String str="zinna";
		
		char c[]=str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			int count=1;
		for(int j=i+1;j<str.length();j++) {
			if(c[i]==c[j]) {
				count++;
				c[j]=c[j-1];
				
			}
		}

		System.out.println(c[i]+" repeated "+count);
			
		}
	}

}
