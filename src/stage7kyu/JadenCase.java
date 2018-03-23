package stage7kyu;

public class JadenCase {
	
	public static String toJadenCase(String phrase) {
		
		if (phrase != null && phrase != "") {
		String[] words = phrase.split(" ");
		phrase = "";
		for (String word : words) {
			String[] letters = word.split("");
			letters[0] = letters[0].toUpperCase();		
			word = "";
			for(String letter : letters)
				word += letter;
			phrase += word + " ";
		}
		phrase = phrase.trim();
		return phrase;
		} else 		
			return null;
	}

	public static void main(String[] args) {

		System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
	}

}
