package stage7kyu;

public class SmallestIntegerFinder {
	
	public static int findSmallestInt(int[] args) {
		
		int min = args[0];
		for(int number : args) {
			if (number < min)
				min = number;
		}
		return min;
	}

	public static void main(String[] args) {
		
		int[] numbers = {34, 15, 88, 2};
		int[] numbers2 = {34, -345, -1, 100};
		
		System.out.println(findSmallestInt(numbers));
		System.out.println(findSmallestInt(numbers2));
	}

}
