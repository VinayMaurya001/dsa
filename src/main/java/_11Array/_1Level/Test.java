package _11Array._1Level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// arrayToArrayList0();
		// arrayToArrayList1();
		// arrayToArrayList2();
		// arrayToTreeSet();
		// arrayListToArray1();
		// arrayListToArray2();

		searchInArray();
	}

	private static void arrayToArrayList0() {
		String[] cityArr = { "Boston", "Chicago", "San Francisco", "New York" };
		List<String> cityList = new ArrayList<String>();
		for (String element : cityArr) {
			cityList.add(element);
		}
		System.out.println(cityList);
	}

	private static void arrayToArrayList1() {
		String[] cityArr = { "Boston", "Chicago", "San Francisco", "New York" };
		ArrayList<String> cityList = new ArrayList<String>(Arrays.asList(cityArr));
		System.out.println(cityList);
		List<String> cityList2 = (List<String>) Arrays.asList(cityArr);
		System.out.println(cityList2);

	}

	private static void arrayToArrayList2() {
		String[] cityArr = { "Boston", "Boston", "San Francisco", "New York" };
		ArrayList<String> cityList = new ArrayList<String>();
		Collections.addAll(cityList, cityArr);
		System.out.println(cityList);

	}

	private static void arrayToTreeSet() {
		String[] cityArr = { "Boston", "Boston", "San Francisco", "New York" };
		ArrayList<String> cityList = new ArrayList<String>();
		Collections.addAll(cityList, cityArr);
		System.out.println(cityList);
		Set<String> citySet = new TreeSet(cityList);
		System.out.println(citySet);
	}

	private static void arrayListToArray1() {
		String[] cityArr = new String[4];
		ArrayList<String> cityList = new ArrayList<String>();
		cityList.add("Boston");
		cityList.add("Boston");
		cityList.add("San Francisco");
		cityList.add("New York");
		System.out.println(cityList);
		System.out.println(Arrays.toString(cityList.toArray()));
	}

	private static void arrayListToArray2() {
		String[] cityArr = new String[4];
		ArrayList<String> cityList = new ArrayList<String>();
		cityList.add("Boston");
		cityList.add("Boston");
		cityList.add("San Francisco");
		cityList.add("New York");
		System.out.println(cityList);
		int i = 0;
		for (String element : cityList) {
			cityArr[i++] = element;
		}
		System.out.println(Arrays.toString(cityArr));
	}

	private static void searchInArray() {
		String[] inputArray = new String[] { "D", "H", "B", "R" };
		System.out.println(Arrays.asList(inputArray).contains("B")); // true
		System.out.println(Arrays.asList(inputArray).contains("G")); // false
	}
	
}
