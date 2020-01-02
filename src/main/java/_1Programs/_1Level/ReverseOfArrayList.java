package _1Programs._1Level;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseOfArrayList {

	public static void main(String[] args) {
		getReverseOfArrayList();
	}

	private static void getReverseOfArrayList() {
		List list = new ArrayList();
		list.add("Ram");
		list.add("Shyam");
		list.add("Sita");
		list.add("Gita");
		list.add("Puja");
		System.out.println("Before sorting ArrayList: " + list);
		Collections.reverse(list);
		System.out.println("After sorting ArrayList: " + list);
	}

}
