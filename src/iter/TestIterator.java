package iter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);

		list = Arrays.asList(1, 2, 3);

		List<Integer> list1 = new ArrayList<Integer>() {
			{
				this.add(1);
				add(2);
				add(3);
			}
		};
		// Varianta cu foreach

		for (Integer i : list) {
			System.out.println(i);
		}
		// Varianta cu iterator
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {
		//while (true) {

			Integer i = iter.next();
			System.out.println(i);
		}
		//iter = list1.iterator();
		System.out.println("##############################");
		list.forEach((Integer s) -> { System.out.println(s); });

		list.forEach(System.out::println);
	}

}
