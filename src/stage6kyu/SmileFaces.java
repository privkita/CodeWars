package stage6kyu;

import java.util.List;

public class SmileFaces {
	
	public static int countSmileys(List<String> arr) {
		
		String[] comparator = {":)", ":D", ";)", ";D", ":-)", ":-D", ";-)", ";-D", ":~)", ":~D", ";~)", ";~D"};
		int counter = 0;
		
		if (arr.size() != 0) {
			for (String smile : arr)
				for (String smileCom : comparator)
					if (smile.equals(smileCom))
						counter++;
			return counter;
		} else
			return 0;
	}

	public static void main(String[] args) {

		

	}

}
