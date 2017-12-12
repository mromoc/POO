import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Jlistteste extends JFrame{
	JList listacolores;
	JList listacopia;
	JButton botoncopiar;
	String colores[]= {"Negro","Azul","Gris Oscuro","Gris","Verde"};
	public Jlistteste() {
		super("JList teste");
		setLayout(new FlowLayout());
		listacolores=new JList(colores);
		listacolores.setVisibleRowCount(3);
		listacolores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(listacolores));
		botoncopiar=new JButton("copiar>>");
		botoncopiar.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent evento) {
						listacopia.setListData(listacolores.getSelectedValues());
					}
				});
		add(botoncopiar);
		listacopia=new JList();
		listacopia.setVisibleRowCount(3);
		listacopia.setFixedCellWidth(100);
		listacopia.setFixedCellHeight(15);
		listacopia.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		add(new JScrollPane(listacopia));
	}
	
	public static void main(String[] args) {
		Jlistteste teste = new Jlistteste();
		teste.setSize(350,140);
		teste.setLocationRelativeTo(null);
		teste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		teste.setVisible(true);
	}

}
