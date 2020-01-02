package _1Programs._2Level;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapElementsOfList {

	public static void main(String[] args) {
		getSwappedList();
	}

	private static void getSwappedList() {
		List list = new ArrayList();
		list.add("Ram");
		list.add("Shyam");
		list.add("Sita");
		list.add("Gita");
		System.out.println("Before swapping: "+list);
		System.out.print("After swapping: ");
		Collections.swap(list, 1, 2);
		System.out.println(list);
	}
}
