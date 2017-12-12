import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Jradiobutton extends JFrame{
	JTextField cuadro;
	Font tipoletrasimple;
	Font tipoletranegrita;
	Font tipoletracursiva;
	Font tipoletranegritacursiva;
	JRadioButton simpleradiobutton;
	JRadioButton negritaradiobutton;
	JRadioButton cursivaradiobutton;
	JRadioButton negritacursivaradiobutton;
	ButtonGroup grupoopciones;
	public Jradiobutton() {
		super("JRadioButton teste");
		setLayout(new FlowLayout());
		cuadro = new JTextField("JRadioButton teste");
		add(cuadro);
		simpleradiobutton = new JRadioButton ("simple",true);
		negritaradiobutton = new JRadioButton ("negrita",false);
		cursivaradiobutton = new JRadioButton ("cursiva", false);
		negritacursivaradiobutton = new JRadioButton ("negrita/cursiva",false);
		add(simpleradiobutton);
		add(negritaradiobutton);
		add(cursivaradiobutton);
		add(negritacursivaradiobutton);
		
		grupoopciones = new ButtonGroup();
		grupoopciones.add(simpleradiobutton);
		grupoopciones.add(negritaradiobutton);
		grupoopciones.add(cursivaradiobutton);
		grupoopciones.add(negritacursivaradiobutton);
		
		tipoletrasimple = new Font("Serif",Font.PLAIN,14);
		tipoletranegrita = new Font("Serif",Font.BOLD,14);
		tipoletracursiva = new Font("Serif",Font.ITALIC,14);
		tipoletranegritacursiva = new Font("Serif",Font.ITALIC+Font.BOLD,14);
		cuadro.setFont(tipoletrasimple);
		
		simpleradiobutton.addItemListener(new manejador (tipoletrasimple));
		negritaradiobutton.addItemListener(new manejador(tipoletranegrita));
		cursivaradiobutton.addItemListener(new manejador(tipoletracursiva));
		negritacursivaradiobutton.addItemListener(new manejador(tipoletranegritacursiva));
		
	}
	
	private class manejador implements ItemListener{
		Font tipoletra;
		public manejador(Font fuente) {
			tipoletra=fuente;
		}
		public void itemStateChanged(ItemEvent evento) {
			cuadro.setFont(tipoletra);
		}
	}
	
	public static void main(String[] args) {
		Jradiobutton teste = new Jradiobutton();
		teste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		teste.setLocationRelativeTo(null);
		teste.setSize(350,100);
		teste.setVisible(true);
	}

}
