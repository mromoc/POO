/*Ejemplo de Herencia Simple*/
public class Main {
	public static void main(String[] args) {
		Empleado Emp=new Empleado();
		Ejecutivo jefe=new Ejecutivo();
		Emp.DatosEmpleado("Juan", 430000);
		Emp.ImprimirDatos();
		Emp.AumentarSueldo(100);
		Emp.ImprimirDatos();
		/*En este caso un ejecutivo es un empleado
		 pero un empleado no es un ejecutivo
		 esto se debe a que ejecutivoes una subclase
		 de empleado*/
		jefe.DatosEmpleado("Pedro", 1000000);
		jefe.AsignarPresupuesto(30000);
		jefe.AumentarSueldo(100);
		/*Empleados y ejecutivos son objetos apartes*/
		jefe.ImprimirDatos();
		Emp.ImprimirDatos();
	}
}
