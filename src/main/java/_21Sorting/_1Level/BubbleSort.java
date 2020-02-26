package _21Sorting._1Level;

public class BubbleSort {

	void bubbleSort(int arr[]) {
		int innerLoopCounter = 0;
		int swapCounter = 0;
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) { // run from first cell to last cell
			for (int j = 0; j < n - i - 1; j++) // run from first cell to "last cell - iteration"
			{
				innerLoopCounter++;
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapCounter++;
				}
			}
		}
		System.out.println("innerLoopCounter " + innerLoopCounter);
		System.out.println("swapCounter " + swapCounter);
	}

	void bubbleSort2(int arr[]) {
		int innerLoopCounter = 0;
		int swapCounter = 0;
		boolean isSwappped=false;
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) { // run from first cell to last cell
			isSwappped=false;
			for (int j = 0; j < n - i - 1; j++) // run from first cell to "last cell - iteration"
			{
				innerLoopCounter++;
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapCounter++;
					isSwappped=true;
				}
			}
			if(!isSwappped) {
				break;
			}
		}
		System.out.println("innerLoopCounter " + innerLoopCounter);
		System.out.println("swapCounter " + swapCounter);
	}

	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		BubbleSort ob = new BubbleSort();
		int arr[] = {11,2,3,4,5,6 };
		System.out.println("Array to be sorted...");
		ob.printArray(arr);

		ob.bubbleSort(arr);
		ob.bubbleSort2(arr);

		System.out.println("Sorted Array...");
		ob.printArray(arr);

	}

}// end of class