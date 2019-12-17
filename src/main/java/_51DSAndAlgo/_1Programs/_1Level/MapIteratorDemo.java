package _51DSAndAlgo._1Programs._1Level;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;
/*
 * Ways to iterate Map 
 * 1.values() method-Key cann't be accessed via value
 *		a)for/for-each loop
 *		b)iterator
 *		c)forEach method
 *		d)stream()
 *		e)forEachRemaing() method
 *		f)Stream.of()????????????
 * 2.keySet() method 
 * 		a)for/for-each loop
 *		b)iterator
 *		c)forEach method
 *		d)stream()
 *		e)forEachRemaing() method
 *		f)Stream.of()????????????
 * 3.entrySet() method 
 * 		a)for/for-each loop
 *		b)iterator
 *		c)forEach method
 *		d)stream()
 *		e)forEachRemaing() method
 *		f)Stream.of()????????????
 * 4.forEach() method on map
 * 		
 * 

 */
public class MapIteratorDemo {

	public static void main(String[] args) {
		Map<Integer, String> fruitMap = new HashMap<Integer, String>();
		fruitMap.put(1, "Mango");
		fruitMap.put(2, "Apple");
		fruitMap.put(3, "Orange");
		// iterationUsingValues(fruitMap);
		// iterationUsingKeySet(fruitMap);
		// iterationUsingEntrySet(fruitMap);

		// iterationUsingIteratorWithValues(fruitMap);
		// iterationUsingIteratorWithKeySet(fruitMap);
		// iterationUsingIteratorWithEntrySet(fruitMap);

		// iterationUsingForeachMethodWithValues(fruitMap);
		// iterationUsingForeachMethodWithKeySet(fruitMap);
		// iterationUsingForeachMethodWithEntrySet(fruitMap);
		// iterationUsingForEachMethodWIthMapItself(fruitMap);

		// iterationUsingStreamsWithValues(fruitMap);
		// iterationUsingStreamsWithKeySet(fruitMap);
		// iterationUsingStreamsWithEntrySet(fruitMap);

		// iterationUsingForEachRemainingWithValues(fruitMap);
		// iterationUsingForEachRemainingWithKeySet(fruitMap);
		// iterationUsingForEachRemainingWithEntrySet(fruitMap);

		iterationUsingStreamsOfWithValues(fruitMap);
		iterationUsingStreamsOfWithKeySet(fruitMap);
		iterationUsingStreamsOfWithEntrySet(fruitMap);

	}

	private static void iterationUsingValues(Map<Integer, String> fruitMap) {
		String constant = "Key cann't be accessed via value";
		for (String value : fruitMap.values()) {
			System.out.println("Key value: " + constant + " Value: " + value);
		}
	}

	private static void iterationUsingKeySet(Map<Integer, String> fruitMap) {
		for (Integer key : fruitMap.keySet()) {
			System.out.println("Key value: " + key + " Value: " + fruitMap.get(key));
		}
	}

	private static void iterationUsingEntrySet(Map<Integer, String> fruitMap) {
		for (Map.Entry<Integer, String> entry : fruitMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}
	}

	private static void iterationUsingIteratorWithValues(Map<Integer, String> fruitMap) {
		Iterator<String> iterate = fruitMap.values().iterator();
		String constant = "Key cann't be accessed via value";
		while (iterate.hasNext()) {
			String value = iterate.next();
			System.out.println("Key: " + constant + " Value: " + value);
		}
	}

	private static void iterationUsingIteratorWithKeySet(Map<Integer, String> fruitMap) {
		Iterator<Integer> iterate = fruitMap.keySet().iterator();
		while (iterate.hasNext()) {
			Integer key = iterate.next();
			System.out.println("Key: " + key + " Value: " + fruitMap.get(key));
		}
	}

	private static void iterationUsingIteratorWithEntrySet(Map<Integer, String> fruitMap) {
		Iterator<Map.Entry<Integer, String>> iterate = fruitMap.entrySet().iterator();
		while (iterate.hasNext()) {
			Map.Entry<Integer, String> entry = iterate.next();
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}
	}

	private static void iterationUsingForeachMethodWithValues(Map<Integer, String> fruitMap) {
		String constant = "Key cann't be accessed via value";
		fruitMap.values().forEach((value) -> {
			System.out.println("Key: " + constant + " value: " + value);
		});
	}

	private static void iterationUsingForeachMethodWithKeySet(Map<Integer, String> fruitMap) {
		fruitMap.keySet().forEach((key) -> {
			System.out.println("Key: " + key + " value: " + fruitMap.get(key));
		});
	}

	private static void iterationUsingForeachMethodWithEntrySet(Map<Integer, String> fruitMap) {
		fruitMap.entrySet().forEach((entry) -> {
			System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue());
		});
	}

	private static void iterationUsingForEachMethodWIthMapItself(Map<Integer, String> fruitMap) {
		fruitMap.forEach((key, value) -> {
			System.out.println("Key: " + key + " value: " + value);
		});
	}

	private static void iterationUsingStreamsWithValues(Map<Integer, String> fruitMap) {
		String constant = "Key cann't be accessed via value";
		fruitMap.values().stream().forEach(value -> System.out.println("Key: " + constant + " Value: " + value));
	}

	private static void iterationUsingStreamsWithKeySet(Map<Integer, String> fruitMap) {
		fruitMap.keySet().stream().forEach((key) -> {
			System.out.println("Key: " + key + " Value: " + fruitMap.get(key));
		});
	}

	private static void iterationUsingStreamsWithEntrySet(Map<Integer, String> fruitMap) {
		fruitMap.entrySet().stream()
				.forEach(entry -> System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue()));
	}

	private static void iterationUsingForEachRemainingWithValues(Map<Integer, String> fruitMap) {
		String constant = "Key cann't be accessed via value";
		fruitMap.values().iterator()
				.forEachRemaining(value -> System.out.println("Key : " + constant + "   Value : " + value));
	}

	private static void iterationUsingForEachRemainingWithKeySet(Map<Integer, String> fruitMap) {
		fruitMap.keySet().iterator()
				.forEachRemaining(key -> System.out.println("Key : " + key + "   Value : " + fruitMap.get(key)));
	}

	private static void iterationUsingForEachRemainingWithEntrySet(Map<Integer, String> fruitMap) {
		fruitMap.entrySet().iterator().forEachRemaining(
				entry -> System.out.println("Key : " + entry.getKey() + "   Value : " + entry.getValue()));
	}

	private static void iterationUsingStreamsOfWithValues(Map<Integer, String> fruitMap) {
		String constant = "Key cann't be accessed via value";
		Stream.of(fruitMap.values()).forEach((value) -> {
			System.out.println("Key : " + constant + "   Value : " + value);
		});
	}

	private static void iterationUsingStreamsOfWithKeySet(Map<Integer, String> fruitMap) {
		Stream.of(fruitMap.keySet()).forEach((key) -> {
			System.out.println("Key : " + key + "   Value : " + fruitMap.get(key));
		});
	}

	private static void iterationUsingStreamsOfWithEntrySet(Map<Integer, String> fruitMap) {
		// Stream.of(fruitMap.entrySet()).forEach((entry) -> {
		// System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue());
		// });
		Stream.of(fruitMap.entrySet()).forEach((entry) -> {
			System.out.println(entry);
		});
	}

}
