package demo.ranjith.simple;

public class IsAlphabetPresent {
	public static void main(String[] args) {
		String str = "abcdefghjiklnmopqrstuvewxyz345dfgg";
		boolean bool = isAlphabetPresentOrNot(str);
		System.out.print(bool);
	}

	static boolean isAlphabetPresentOrNot(String str) {
		String string = "abcdefghijklmnopqrstuvwxyz";
		for (char c : string.toCharArray()) {
			if (!(str.contains(Character.toString(c)))) {
				System.out.println("str is not contain all alphabets ");
				return false;
			}
		}
		System.out.println("str is contain all alphabets");
		return true;
	}

}
