
public class Empleado {
	String Nombre;
	int NumeroEmpleados,Sueldo;
	static private int contador=0;
	public void DatosEmpleado(String nom,int suel){
		this.Nombre=nom;
		this.Sueldo=suel;
		NumeroEmpleados=contador++;
	}
	public void AumentarSueldo(int porcentaje){
		Sueldo+=(Sueldo*porcentaje/100);
	}
	public void ImprimirDatos() {
		System.out.println("Empleado: "+ Nombre +"Sueldo: "+ Sueldo);
	}
}

class Ejecutivo extends Empleado{
	int presupuesto;
	void AsignarPresupuesto(int P) {
		presupuesto=P;
	}
}
