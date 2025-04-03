package demo.ranjith.simple;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedFirstCharacter {
	public static void main(String[] args) {
		String string = "hello worldshe";
		findTheFirstNonRepeatedCharacter(string);
	}

	static void findTheFirstNonRepeatedCharacter(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (char ch : str.toCharArray()) {
			if (map.get(ch) == 1 && ch != ' ') {
				System.out.println(ch);
				break;
			}
		}
	}
}
