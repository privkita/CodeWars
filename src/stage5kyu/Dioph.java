package stage5kyu;

import java.util.ArrayList;

public class Dioph {

	public static String solEquaStr(long n) {
		
		ArrayList<String> result = new ArrayList<String>();

		for (long x = (n/2)+1; x >= 0; x--) {
			for (long y = (x/2)+1; y >=0; y--) {
				if ( (x - 2*y) * (x + 2*y) == n) {
					result.add("[" + x + ", " + y + "]");
				}
			}
		}
			
		
    return result.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// solEquaStr(90005) --> "[[45003, 22501], [9003, 4499], [981, 467], [309, 37]]"
		
		System.out.println(solEquaStr(90005));
	}

}
