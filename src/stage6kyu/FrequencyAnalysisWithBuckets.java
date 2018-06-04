package stage6kyu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FrequencyAnalysisWithBuckets {

	public static ArrayList<ArrayList<Integer>> bucketize(final int[] arr) {
		
		ArrayList<ArrayList<Integer>> frequencyList = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i <= arr.length; i++)
			frequencyList.add(i, new ArrayList<Integer>());

		for (int i = 0; i < arr.length; i++) {
			int number = arr[i];
			int counter = 0;

			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == number)
					counter++;
			}
			if (!frequencyList.get(counter).contains(number))
				frequencyList.get(counter).add(number);

		}
		for (int i = 0; i < frequencyList.size(); i++) {
			if (!frequencyList.get(i).isEmpty())
				frequencyList.get(i).sort((int2, int1) -> int2 - int1);
			if (frequencyList.get(i).isEmpty())
				frequencyList.set(i, null);
		}

		return frequencyList; // Do your magic!
	}

	public static void main(String[] args) {

//		int[] arr = new int[] { 7, 7, 7, 7, 8, 6 };
		int[] arr = new int[] { 8, 8, 4, 4};
		// int[] arr = new int[]{4,5,6};
		ArrayList<ArrayList<Integer>> actual = FrequencyAnalysisWithBuckets.bucketize(arr);
		System.out.println(actual.size());

		for (int i = 0; i < actual.size(); i++)
			System.out.println(actual.get(i));
		
		System.out.println("--------------");

		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		list.add(null);
		list.add(null);
		{
			ArrayList<Integer> entry = new ArrayList<Integer>();
			entry.add(4);
			entry.add(8);
			list.add(entry);
		}
		list.add(null);
		list.add(null);

		
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		

	}

}
