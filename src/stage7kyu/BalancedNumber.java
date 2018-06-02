package stage7kyu;

import java.util.Arrays;

public class BalancedNumber {

	public static String balancedNum(long number) {
		
		String answer = "";
		
		char[] charArray = ((Long)number).toString().toCharArray();
		int[] numberArray = new int[charArray.length];
		for(int i = 0; i < charArray.length; i++)
			numberArray[i] = Character.getNumericValue(charArray[i]);
		
		if(numberArray.length < 3)
			return answer = "Balanced";
		else {
		
			if (numberArray.length % 2 != 0) {
				int balance = numberArray.length/2;
				Arrays.parallelPrefix(numberArray, 0, balance, (x, y) -> x + y);
				Arrays.parallelPrefix(numberArray, balance+1, numberArray.length, (x, y) -> x + y);
				if (numberArray[balance-1] == numberArray[numberArray.length-1])
					answer = "Balanced";
				else
					answer = "Not Balanced";
			}
			if (numberArray.length % 2 == 0) {
				int balance = numberArray.length/2;
				Arrays.parallelPrefix(numberArray, 0, balance-1, (x, y) -> x + y);
				Arrays.parallelPrefix(numberArray, balance+1, numberArray.length, (x, y) -> x + y);
				if (numberArray[balance-2] == numberArray[numberArray.length-1])
					answer = "Balanced";
				else
					answer = "Not Balanced";
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		System.out.println(BalancedNumber.balancedNum(543654757));
		
		System.out.println(BalancedNumber.balancedNum(12344321));
	
	}
	
}
