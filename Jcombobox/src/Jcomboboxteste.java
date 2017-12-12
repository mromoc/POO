import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Jcomboboxteste extends JFrame{
	
	JComboBox caja;
	JLabel etiqueta;
	String nombre[]= {"Pajaro","Buho","Camaron","Pez"};
	Icon icono[]= {
			new ImageIcon(getClass().getResource("C:\\\\Users\\\\mromo\\\\Desktop\\\\Pajaro.png")),//Icono[0]
			new ImageIcon(getClass().getResource("C:\\\\Users\\\\mromo\\\\Desktop\\\\Buho.png")),//Icono[1]
			new ImageIcon(getClass().getResource("C:\\\\Users\\\\mromo\\\\Desktop\\\\Camaron.png")),//Icono[2]
			new ImageIcon(getClass().getResource("C:\\\\Users\\\\mromo\\\\Desktop\\\\Pez.png"))//Icono[3]
	};
	public Jcomboboxteste() {
		super("JComboBox teste");
		setLayout(new FlowLayout());
		caja = new JComboBox(nombre);
		caja.setMaximumRowCount(3);//Muestra 3 filas
		caja.addItemListener(
				new ItemListener() {
					public void itemStateChanged(ItemEvent evento) {
						if(evento.getStateChange()== ItemEvent.SELECTED) {
							etiqueta.setIcon(icono[caja.getSelectedIndex()]);
						}
					}
				});
		add(caja);
		etiqueta = new JLabel(icono[0]);
		add(etiqueta);
	}
	
	
	
	public static void main() {
		Jcomboboxteste teste = new Jcomboboxteste();
		teste.setLocationRelativeTo(null);
		teste.setSize(350,150);
		teste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		teste.setVisible(true);
	}
}