import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class EJ1 {

	File archivo= new File("archivo.txt");
	private byte radio;
	float area,circunferencia;
	final float PI=3.14159F;
	
	void PedirRadio() {
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingresa el radio");
		radio=teclado.nextByte();
		teclado.close();
		CrearArchivo();
		
	}
	void CrearArchivo() {
		if(!archivo.exists()) {//consulta si el archivo existe
			try{
				archivo.createNewFile();//crea el archivo
			}catch (IOException ex) { //segmento necesario
				ex.printStackTrace();//para hacer funcionar la linea 18
			}
		}
	}
	void ImprimirEnArchivo(){
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
	void CalcularCircunferencia(){
		circunferencia=2*PI*radio;
		System.out.println("la circunferencia es :"+ circunferencia);
	}
}
