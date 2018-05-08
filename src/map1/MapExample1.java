package map1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapExample1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<>();
		map.put("pufi", Integer.valueOf(33)); // new Integer(33) // 33
		String gigi = "5";
		Integer mihai = Integer.valueOf(gigi); // new Integer(gigi)
		map.put("fifi", 55);
		map.put("test",66);
		map.put("fifi", 15);
		//map.put("nini", null);
		System.out.println(map.size());
		System.out.println("map['fifi']=" + map.get("fifi"));
		System.out.println("map['nini']=" + map.get("nini"));
		System.out.println("map has key 'nini' = " + map.containsKey("nini"));
		// null -> Optional.
		Integer oldValue = map.remove("nini");
		//map.clear();

		for(String k : map.keySet()) {
			System.out.println("key:" + k);
			System.out.println("value:" + map.get(k));

		}
		for(Integer v : map.values()) {
			System.out.println("value:" + v);

		}
		for( Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());

		}
	}

}
