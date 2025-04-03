package demo.ranjith.simple;


public class ExcahngeTheVowel {

	public static void main(String[] args) {
		String str="kranthikumar";
		char[] ch= {'a','e','i','o','u'};
		int count=0;
		for(char c:ch)
		{
			String string=c+"";
			if(str.contains(string)) {
				count++;
			}
		}
		char[] newCh= new char[count];
		int k=0;
		for(char c:ch) {
			String string=c+"";
			if(str.contains(string)) {
			   newCh[k++]=c;
			}
		}
		char[] result=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<newCh.length;j++) {
				if(str.charAt(i)==newCh[j]) {
					if(j==newCh.length-1) {
						result[i]=newCh[0];
					}else {
						result[i]=newCh[j+1];
					}
					
				}
				}
				
		}
		System.out.println( new String(result));
		

	}

}
