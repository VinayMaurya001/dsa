package _51DSAndAlgo._1Programs._2Level;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveArrayDuplicates {

	public static void main(String[] args) {
		String[] stringArray = { "Ram", "Shyam", "Sita", "Ram" };
		boolean isArrayContainDuplicates = isDuplicate(stringArray);
		if (isArrayContainDuplicates) {
			System.out.println("The array contains duplicate");
		} else {
			System.out.println("The array does not contain duplicate");
		}
	}

	private static boolean isDuplicate(String[] stringArray) {
		boolean isDuplicate = false;
		List stringArrayInList = Arrays.asList(stringArray);
		Set set = new HashSet(stringArrayInList);
		if ((set.size() != stringArrayInList.size())) {
			isDuplicate = true;
		}
		return isDuplicate;
	}

}
