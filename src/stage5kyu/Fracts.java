package stage5kyu;

public class Fracts {
	
	public static String convertFrac(long[][] lst) {
		
		long den = 1;
		for (int j = 0; j < 1000; j++) {
			int i = 0;
			while (i < lst.length)
				if (den % lst[i][1] == 0)
					i++;
				else
					den++;
		}
		String ans = "";
		for (int i = 0; i < lst.length; i++) {
			long counter = (lst[i][0] * den) / lst[i][1];
			lst[i][0] = counter;
			ans += "(" + lst[i][0] + "," + den + ")";
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[][] lst;
		lst = new long[][] { {1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7} };
		System.out.println(convertFrac(lst));
		
	}
	
}
