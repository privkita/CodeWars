package stage6kyu;

import java.util.ArrayList;
import java.util.HashMap;

public class EnoughIsEnough {
	
	public static int[] deleteNth(int[] elements, int maxOcurrences) {
		ArrayList<Integer> list = new ArrayList();
		HashMap<Integer, Integer> map = new HashMap();
		int counter;
		for (int element : elements) {
			
			if (map.containsKey(element)) {
				counter = map.get(element);
				map.put(element, ++counter);
				if (counter <= maxOcurrences)
					list.add(element);
			} else {
				map.put(element, counter = 1);
				if (counter <= maxOcurrences)
					list.add(element);

			}
		}
		return list.stream().mapToInt(i->i).toArray();
	}


	public static void main(String[] args) {
		
		int[] elements = {1,2,3,1,2,1,2,3};
		
		for(int element : deleteNth(elements, 2))
			System.out.println(element + " ");
	}

}
