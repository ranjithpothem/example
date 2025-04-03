package demo.ranjith.simple;



public class WordSplitter {
    public static void main(String[] args) {
       // String input = "abcgefd::a,ab,abc,abcg,b,c,dog,e,efd,zzzz";
    	//String input="baseball::a,all,b,ball,bas,base,cat,code,d,e,quit,z";
    	String input="hellocat::apple,bat,cat,goodbye,hello,yellow,why";
        String[] parts = input.split("::");

        if (parts.length != 2) {
            System.out.println("Invalid input format. Please provide input in the format 'word::dictionary'.");
            return;
        }

        String word = parts[0];
        String dictionaryStr = parts[1];
        String[] dictionary = dictionaryStr.split(",");

        for (String firstWord : dictionary) {
            if (word.startsWith(firstWord)) {
                String secondWord = word.substring(firstWord.length());
                if (containsWord(secondWord, dictionary)) {
                    System.out.println(firstWord + "," + secondWord);
                    return;
                }
            }
        }

        System.out.println("not possible");
    }

    private static boolean containsWord(String target, String[] dictionary) {
        for (String word : dictionary) {
            if (word.equals(target)) {
                return true;
            }
        }
        return false;
    }
}
