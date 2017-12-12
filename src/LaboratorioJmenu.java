import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LaboratorioJmenu{
	public static void crearventana(JFrame V) {
		V.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		V.setSize(400, 200);
		V.setVisible(true);
	}
	public static void crearmenus(JFrame vent) {
		JMenuBar barra =new JMenuBar();
		vent.setJMenuBar(barra);
		JMenu nombrepestaña1,nombrepestaña2;
		barra.add(nombrepestaña1 = new JMenu("Archivo"));
		JMenuItem item1,item2;
		nombrepestaña1.add(item1 =new JMenuItem("Hola"));
		nombrepestaña1.addSeparator();
		nombrepestaña1.add(item2 = new JMenuItem("Chau"));
		barra.add(nombrepestaña2 = new JMenu("Editar"));
		
		item1.addActionListener(
				new ActionListener() {
				public void actionPerformed( ActionEvent e )
				{
					JLabel texto = new JLabel("BUM!! ACCION DE BOTON");
					vent.add(texto,BorderLayout.NORTH);
					vent.setVisible(true);
				}
				});
		item2.addActionListener(
				new ActionListener() {
				public void actionPerformed( ActionEvent e )
				{
					JFrame ventananueva =new JFrame("Ventana Nueva");
					ventananueva.setSize(400, 200);
					JLabel text =new JLabel("ESTE BOTON ABRE UNA NUEVA VENTANA");
					ventananueva.add(text,BorderLayout.CENTER);
					ventananueva.setVisible(true);
				}
				});
	}
	public static void main(String[] args) {
		JFrame Ventana =new JFrame("BARRA DE MENU");
		crearmenus(Ventana);
		crearventana(Ventana);
	}
}
