package stage7kyu;

public class Solution {
	
	static int stray(int[] numbers) {
		
		if (numbers[0] != numbers[1] && numbers[0] != numbers[2]) 
			return numbers[0];
	    for (int i : numbers) 
	    	if (i != numbers[0]) 
	    		return i;
	    return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
