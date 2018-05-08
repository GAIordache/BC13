package map2;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.TreeMap;

/**
 * 
 * Key type MUST BE IMMUTABLE
 *
 */
public class MapExample2 {

	public static void main(String[] args) {
		Map<NumePersoana, Persoana> persoane = new HashMap<>();
		NumePersoana np1 = new NumePersoana("FN1", "LN1");
		Persoana p1 = new Persoana(np1, 33);
		persoane.put(np1, p1);
		NumePersoana np2 = new NumePersoana("FN2", "LN2");
		Persoana p2 = new Persoana(np2, 33);
		persoane.put(np2, p2);
		System.out.println(persoane.size());
		// np2.setNume("FN1");
		// np2.setPrenume("LN1");
		System.out.println("key1 vs key2:" + np1.equals(np2));
		System.out.println(persoane.size());
		for (NumePersoana np : persoane.keySet()) {
			System.out.println(np);
		}
		Random rnd = new Random();
		for (int i = 3; i < 10000; i++) {
			NumePersoana np = new NumePersoana("FN" + i, "LN" + i);
			Persoana p = new Persoana(np, 10 + rnd.nextInt(70));
			persoane.put(np, p);
		}
		//System.out.println(persoane);
		Map<String, Integer> numarPersoanePeCategoriiVarsta = new HashMap<>();
		for (Persoana p : persoane.values()) {
			int interval = p.getVarsta() / 10;
			String cheie = "" + (interval * 10) + "-" + (interval * 10 + 9);

			// numarPersoanePeCategoriiVarsta.put(cheie, numarPersoanePeCategoriiVarsta.get(cheie) != null ? numarPersoanePeCategoriiVarsta.get(cheie) + 1 : 1);

			if (numarPersoanePeCategoriiVarsta.containsKey(cheie)) {
				Integer oldCount = numarPersoanePeCategoriiVarsta.get(cheie);
				int newCount = oldCount + 1;
				// Integer newCount = Integer.valueOf(oldCount.intValue() + 1);
				numarPersoanePeCategoriiVarsta.put(cheie, newCount);
				// numarPersoanePeCategoriiVarsta.put(cheie,
				// numarPersoanePeCategoriiVarsta.get(cheie) + 1);

			} else {
				numarPersoanePeCategoriiVarsta.put(cheie, 1);
			}
		}
		System.out.println(numarPersoanePeCategoriiVarsta);
		// verificam suma valorilor din map
		int suma = 0;
		for(Integer v : numarPersoanePeCategoriiVarsta.values()) {
			suma += v;
		}
		System.out.println("Numar per varsta total:" + suma + ", numar persoane:" + persoane.size());
		
		 System.out.println(numarPersoanePeCategoriiVarsta.values().stream().reduce(Integer::sum).get());
	}

}
