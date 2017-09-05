
public class Main {
	public static void main(String[] args) {
		A superobjeto= new A();
		B subobjeto=new B();
		superobjeto.i=10;
		superobjeto.j=20;
		System.out.println("Contenido del super objeto: ");
		superobjeto.showij();
		/*La subclase, en este caso B tiene acceco a todos los miembros public de su superclase*/
		subobjeto.i=7;
		subobjeto.j=8;
		subobjeto.k=9;
		System.out.println("contenido del subojeto:");
		subobjeto.showij();
		subobjeto.showk();
		System.out.println("Suma de i , j y k en subobjeto: ");
		subobjeto.suma();
	}
}
