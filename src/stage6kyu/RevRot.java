package stage6kyu;

import java.util.ArrayList;

public class RevRot {

	public static String revRot(String strng, int sz) {

		ArrayList<char[]> chunks = new ArrayList<char[]>();
//		String newStrng = "";
		StringBuilder sb = new StringBuilder();

		if (sz == 0 || strng.length() == 0 || strng.length() < sz)
			return sb.toString();

		for (int i = sz; i < strng.length(); i += sz) {
			if (strng.substring(i - sz, i).length() == sz)
				chunks.add(strng.substring(i - sz, i).toCharArray());
		}

		for (char[] chunk : chunks) {
			double sum = 0;
			for (char number : chunk)
				sum += Math.pow(Character.getNumericValue(number), 3);

			if (sum % 2 == 0) {
				for (int i = (chunk.length - 1); i >= 0; i--)
					sb.append(chunk[i]);
//					newStrng += chunk[i];
			} else {
				for (int i = 1; i < chunk.length; i++)
					sb.append(chunk[i]);
				sb.append(chunk[0]);
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {

		String s = "733049910872815764";

		System.out.println(revRot(s, 5));

	}

}
