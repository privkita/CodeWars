package stage6kyu;

public class ToCamelCase {
	
	static String toCamelCase(String s) {
		
		String[] words = s.split("-|_");
		String newWord = words[0];
		
		for (int i = 1; i < words.length; i++) 
			newWord += (words[i].substring(0, 1).toUpperCase()) + words[i].substring(1, words[i].length());
				
		return newWord;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "the-stealth-warrior";
		
		System.out.println(toCamelCase(input));
	}

}
