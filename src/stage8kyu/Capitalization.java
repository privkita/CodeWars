package stage8kyu;

public class Capitalization {
	
	public static String capitalizeWord(String word) {
		String[] letters = word.split("");
		letters[0] = letters[0].toUpperCase();		
		word = "";
		for(String letter : letters)
			word += letter;
		return word;
		}

	public static void main(String[] args) {
		
		
		System.out.println(capitalizeWord("barbara"));
	}

}
