import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class colecciones {
	
	public static void main(String [] args) {
		//Set
		HashSet<String> hset = new HashSet<String>();
		hset.add("hola");
		hset.add("Como");
		hset.add("estas");
		System.out.println(hset);
		hset.remove("Como");
		System.out.println(hset);
		
		TreeSet<String> tset = new TreeSet<String>();
		tset.add("Hola");
		tset.add("Como");
		tset.add("Estas");
		System.out.println(tset);
		tset.remove("Hola");
		System.out.println(tset);
		
		
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();
		lhset.add("Habia una vez");
		lhset.add("Un barco chiquito");
		System.out.println(lhset);
		lhset.remove("Habia una vez");
		System.out.println(lhset);
		
		
		//List
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Hi");
		alist.add("How");
		alist.add("How");
		System.out.println(alist);
		alist.remove(1);
		System.out.println(alist);
		
		LinkedList<String> list = new LinkedList<String>();
		//Map
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "asd");
		hmap.put(2, "dwdwd");
		hmap.put(3, "PAZ");
		System.out.println(hmap);
		hmap.remove(1);
		System.out.println(hmap);
		TreeMap<Integer, String> tmap =new TreeMap<Integer, String>();
		LinkedHashMap<Integer,String> lhmap = new LinkedHashMap<Integer,String>();
	}
}
