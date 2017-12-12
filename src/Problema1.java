import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/*Se pide construir un algoritmo que permita 
 calcular el valor de Area y circunferecia dado el radio*/

public class Problema1{
	File archivo = new File("archivo.txt");
	private int radio;
	float area,circunferencia;
	final float PI=3.14159F;
	
	void PedirRadio() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingreda el radio");
		radio=teclado.nextInt();
		teclado.close();
		CrearArchivo();
	}
	
	void CrearArchivo() {
		if(!archivo.exists()) {
			try{ archivo.createNewFile();
		}catch (IOException ex) { 
		ex.printStackTrace();}
		}
	}
	
	void ImprimirEnArchivo() {
		try {
			FileWriter fw=new FileWriter(archivo,false);
            fw.append("Radio :"+ radio +" Area "+ area +" Circunferencia "+ circunferencia);
            fw.close();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	void CalculaArea() {
		area=PI*radio*radio;
        System.out.println("el area es :"+ area);
	}
	
	void CalcularCircunferencia() {
		circunferencia=2*PI*radio;
		System.out.println("la circunferencia es :"+ circunferencia);
	}
	
	public static void main(String[] args) {
		Problema1 ejercicio= new Problema1();
		ejercicio.PedirRadio();
		ejercicio.CalculaArea();
		ejercicio.CalcularCircunferencia();
		ejercicio.ImprimirEnArchivo();
	}
}