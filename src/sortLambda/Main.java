package sortLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String... args) {
		List<String> list = new ArrayList<String>() {
			{
				add("Aala");
				add("portocala");
				add("Bulina");
				add("Bubulina");
				add("ceapa");
				add("xfactor");
			}
		};
		System.out.println(list);
		// Sortare naturala
		Collections.sort(list);
		System.out.println(list);
		// Sortare in reverse
		Collections.sort(list,new Comparator<String>() {

			@Override
			public int compare(String pO1, String pO2) {
				return -pO1.compareTo(pO2);
			}
		});
		System.out.println(list);
		// Sortare crescator dupa lungime
		Collections.sort(list, (String s1,String s2) -> { return s1.length() - s2.length();});
		System.out.println(list);
		list.sort(Comparator.comparing(String::length));

	}
}
