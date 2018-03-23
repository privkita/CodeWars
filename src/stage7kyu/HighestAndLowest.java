package stage7kyu;

public class HighestAndLowest {
	
	public static String HighAndLow(String numbers) {
	    
		String[] numbersTable = numbers.split(" ");
		int min = Integer.valueOf(numbersTable[0]);
		int max = Integer.valueOf(numbersTable[0]);
		for (int i = 0; i < numbersTable.length; i++) {
			if (Integer.valueOf(numbersTable[i]) < min)
				min = Integer.valueOf(numbersTable[i]);
			if (Integer.valueOf(numbersTable[i]) > max)
				max = Integer.valueOf(numbersTable[i]);
		}
			
	    return max + " " + min;
	  }

	public static void main(String[] args) {
		
		String numbers = "1 2 3 4 5";
		String numbers2 = "1 2 -3 4 5";
		String numbers3 = "1 9 3 4 -5";
		
		System.out.println(HighAndLow(numbers));
		System.out.println(HighAndLow(numbers2));
		System.out.println(HighAndLow(numbers3));
	}

}
