import java.util.Scanner;
/*Se pide construir un algoritmo donde dado un dato 
indicado por el compas se transforme  a una orientacion*/

public class Problema2 {
	static double dato;
	void Entrada() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingrese Grados para obtener la orientacion correspondiente");
		dato=teclado.nextDouble();
		teclado.close();
	
	}
	boolean esigual() {
		if(dato==0 || dato == 90 || dato == 180 || dato == 270 || dato==360 ) {
			return true;
		}else return false;
	}
	
	void igual() {
		if(dato==0)
			System.out.println("La orientacion es 0° norte");
		else if(dato==90)
			System.out.println("La orientacion es 0° este");
		else if(dato==180)
			System.out.println("La orientacion es 0° sur");
		else if(dato==270)
			System.out.println("La orientacion es 0° oeste");
		else if(dato==360)
			System.out.println("La orientacion es 0° norte");	
	}
	
	void desigual() {
		if(dato<90)
			System.out.println("La orientacion es "+dato+"° nor este");
		else if(dato<180)
			System.out.println("La orientacion es "+(180-dato)+"° sur este");
		else if(dato<270)
			System.out.println("La orientacion es "+(dato-180)+"° sur");
		else if(dato<360)
			System.out.println("La orientacion es "+(360-dato)+"° oeste");
	}
	
	public static void main(String[] args) {
		Problema2 Ej = new Problema2();
		Ej.Entrada();
		if(dato<0 || dato>360) {
			System.out.println("Debe introducir un dato valido entre 0 y 360");
		}else if(Ej.esigual()) {
			Ej.igual();
		}else if(!Ej.esigual()) {
			Ej.desigual();
		}
	}

}
