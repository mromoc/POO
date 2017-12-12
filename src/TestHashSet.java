import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	public static void main(String[] args) {
		Libro libro1 = new Libro(1, "Java for Dummies");
		// libro duplicado en la variable libro1Dup.
		Libro libro1Dup = new Libro(1, "Java for the Dummies");
		Libro libro2 = new Libro(2, "Java for more Dummies");
		Libro libro3 = new Libro(3, "more Java for more Dummies");
		
		Set<Libro> set1 = new HashSet<Libro>();
		//Agregamos
		set1.add(libro1);
        set1.add(libro1Dup);
        set1.add(libro1);
        set1.add(libro3);
        set1.add(null);
        set1.add(null);
        set1.add(libro2);
        //Imprimimos
        System.out.println(set1);
        //Eliminamos
        set1.remove(libro1);
        set1.remove(libro3);
        //Imprimimos
        System.out.println(set1);
	}
}