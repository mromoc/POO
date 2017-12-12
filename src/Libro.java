public class Libro {
	private int id;
	private String titulo;
	
	public Libro(int id, String titulo) {
		//Asigna id y titulo haciendo referencia al objeto Libro
		this.id=id;
		this.titulo=titulo;
	}
	//Retorna el id y el titulo como un String completo
	public String toString() {
		return id + ": " + titulo;
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof Libro)) {
			
		}
		return this.id == ((Libro)o).id;
	}
	
	public int hashCode() {
		return id;
	}
}