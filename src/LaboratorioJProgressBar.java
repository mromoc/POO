import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

public class LaboratorioJProgressBar {
	JProgressBar bar;
	JButton boton;
	JPanel panel;
	int progreso;
	void Ventana() {
		JFrame frame = new JFrame("JProgressBar");
		bar =new JProgressBar(0,100);
		bar.setValue(0);
		bar.setStringPainted(true);
		frame.add(bar,BorderLayout.NORTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,200);
		Progreso(frame,bar);
	}
	
	void Progreso(JFrame ventana, JProgressBar bar) {
		boton = new JButton("Continuar con pasos de a 5");
		ventana.add(boton,BorderLayout.SOUTH);
		ventana.setVisible(true);
		boton.addActionListener(
		new ActionListener() {
		public void actionPerformed( ActionEvent e )
		{
			progreso +=5;
			bar.setValue(progreso);
			if(progreso == 100) {
				JOptionPane.showMessageDialog(null, "Ya se cargo el Archivo ");
			}
			}
		});
		
		
	}

	public static void main(String[] args) {
		LaboratorioJProgressBar lab =new LaboratorioJProgressBar();
		lab.Ventana();
	}
}
