package _1Programs._2Level;

import java.util.HashMap;
import java.util.TreeMap;

public class SortHashMapKey {

	public static void main(String[] args) {
		System.out.println("Sorted HashMap: ");
		m1();
	}

	private static void m1() {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Ram");
		hashMap.put(2, "Shyam");
		hashMap.put(5, "Sita");
		hashMap.put(4, "Gita");
		hashMap.put(3, "Puja");
		System.out.println(hashMap);

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.putAll(hashMap);
	}

}
