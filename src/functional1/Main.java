package functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>() {
			{
				add("aaa");
				add("bbbb");
				add("ccccc");
			}
		};
		Stream<String> strm = list.stream();
		strm.forEach(System.out::println);
		
		strm = list.stream();
		strm.filter((String s) -> { return s.startsWith("a");})
		  .forEach(System.out::println);
		
		strm = list.stream();
		strm.map((s) -> s.length()).forEach(System.out::println);
	}

}
