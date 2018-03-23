package stage6kyu;

public class MissingLetter {
	
	public static char findMissingLetter(char[] array) {
		char missingLetter = ((char)(array[0] - 1));
		for (int i = 0; i < array.length; i++) {
			if (array[i] == (missingLetter + 1))
				missingLetter = (array[i]);
			else
				return missingLetter = (char)(missingLetter + 1);
		}
	    return missingLetter;
	}
	public static void main(String[] args) {

		char[] array = {'a','b','c','d','f'};
		char[] array2 = {'O','Q','R','S'};
		System.out.println(findMissingLetter(array));
		System.out.println(findMissingLetter(array2));
	}

}
