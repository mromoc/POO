/*Se pide elaborar una aplicacion que realice lo siguiente
 * a) Tras pulsar hola muestre chao
 * b) Botones centrados
 * c) Ventana con dimension 200 x 200
 * d) Al pulsar el cierre termine la aplicacion
 * e) Incorporar 2 acciones adicionales
 * 
 * 
 * Acciones adicionales por mi parte:
 * Tras pulsar chao abre otra ventana con texto y un boton
 * Tras pulsar el boton cambia el texto*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class laboratorioSwing {
	public static void main(String[] args) {
		JFrame V = new JFrame();
		JFrame V2 = new JFrame();
		JFrame V3= new JFrame();
		JButton B3 = new JButton("Push");
		JButton B2 = new JButton("Chao");
		JButton B = new JButton("Hola");
		JLabel txt = new JLabel();
		JLabel txt2 = new JLabel();
		JLabel txt3 = new JLabel();
        V.setSize(200,200);
        V.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        V.add(B);
        B.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent evento){
        		V2.setSize(200,200);
        		V2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                V2.add(B2);
                V2.setVisible(true);
        	}
        });
        B2.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent evento) {	
        		V3.setSize(200,200);
        		V3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		txt2.setText("ADIOS");
        		V3.add(txt2, BorderLayout.NORTH);
        		txt.setText("UN GUSTO");
        		V3.add(txt, BorderLayout.SOUTH);
        		V3.add(B3, BorderLayout.EAST);
        		V3.add(txt3, BorderLayout.WEST);
        		V3.setVisible(true);
        	}
        });
        B3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evento){
        		txt.setText("Texto");
        		txt3.setText("Texto dinamico wow!");
        		txt2.setText("Cambio de texto");
        	}
        });
        V.setVisible(true);
	}
}
