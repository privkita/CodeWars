package stage6kyu;

import java.util.List;

public class SmileFaces2 {
	
	public static int countSmileys(List<String> arr) {
		
		return (int)arr.stream().filter(x -> x.matches("[:;][-~]?[)D]")).count();
		
	}

	public static void main(String[] args) {

		

	}

}
