package stage7kyu;

public class Accumul {
	
	public static String accum(String s) {
		String[] list = s.split("");
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < list.length; i++) {
			builder.append(list[i].toUpperCase());
			for (int j = 0; j < i; j++)
				builder.append(list[i].toLowerCase());
			if (i < list.length - 1)
				builder.append("-");
		}
		return builder.toString().trim();
	    }

	public static void main(String[] args) {

		System.out.println(Accumul.accum("abcd"));
		System.out.println(Accumul.accum("RqaEzty"));
		System.out.println(Accumul.accum("cwAt"));
	}

}
