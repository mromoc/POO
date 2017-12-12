import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ComponenteJOptionPane extends JFrame{
	
	JOptionPane ventana;
	JLabel texto1;
	JTextField cuadro;
	JPasswordField cuadrocontraseña;
	JButton boton;
	JButton boton2;
	JTextField cuadrobox;
	JCheckBox negrita;
	JCheckBox cursiva;
	JTextField cuadroradio;
	
	public ComponenteJOptionPane() {
		
		super("Titulo de la ventana");//Al tener como herencia a JFrame podremos usar sus metodos sin necesidad de inicializar un JFrame.
		setSize(400,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER, 20, 5)); //espaciado entre componentes = 50 pixeles, espaciado con bordes =5 pixel
		
		/*-----------------------JLabel--------------------------*/
		
		
		texto1 =new JLabel("nombre");
		add(texto1);
		
		/*------------------jLabel con imagen--------------------*/
		
		Icon icono=new ImageIcon("C:\\Users\\mromo\\Desktop\\asd.png");
		texto1 =new JLabel("texto bajo la imagen",icono,SwingConstants.CENTER);//INICIALIZA EL TEXTO CON LA IMAGEN EN CENTRO
		texto1.setHorizontalTextPosition(SwingConstants.CENTER);//MUEVE EL TEXTO HORIZONTALMENTE
		texto1.setVerticalTextPosition(SwingConstants.BOTTOM);//MUEVE EL TEXTO VERTICALMENTE
		texto1.setToolTipText("Descripcion para JLabel");//AÑADE UNA DESCRIPCION
		add(texto1);
		
		/*----------------------JTextField----------------------*/
		
		
		cuadro = new JTextField(5);//Crear una ventana con espaciado 5
		cuadro.setEditable(false);//Hace ineditable el cuadro de texto
		cuadro.setToolTipText("Cuadro de texto ineditable");//AÑADE DESCRIPCION
		add(cuadro);
		cuadro = new JTextField(5);//Crea ventana con espaciado 5 editable
		add(cuadro);
		
		/*-------------------JpasswordField---------------------*/
		
		
		//Crea un cuadro de contraseña con texto dentro(el largo del nombre sera el largo de el objeto)
		cuadrocontraseña = new JPasswordField("Contra");
		add(cuadrocontraseña);

		/*-------Accion con jtextfield y JPasswordField*--------*/
		
		//Al momento de introducir un dato en el cuadro y presionar enter, imprimen lo que han ingresado
		Accion manejador = new Accion();
		cuadro.addActionListener(manejador);
		cuadrocontraseña.addActionListener(manejador);
		
		/*----------------------JButton------------------------*/
		
		
		boton = new JButton("Boton :v");
		add(boton);
		boton.addActionListener(manejador);
		
		/*----------------JButton con Imagen------------------*/
		
		
		boton2=new JButton(icono);
		add(boton2);
		boton2.addActionListener(manejador);
		
		/*----------------------JCheckBox---------------------*/
		
		
		cuadrobox=new JTextField("Texto de JcheckBox");
		cuadrobox.setFont(new Font("Serif",Font.PLAIN,14));
		add(cuadrobox);
		negrita = new JCheckBox("Negrita");
		cursiva = new JCheckBox("Cursiva");
		negrita.addActionListener(manejador);
		cursiva.addActionListener(manejador);
		add(negrita);
		add(cursiva);
		setVisible(true);
	}
	
	private class Accion implements ActionListener{
		int valNegrita= Font.PLAIN ,valCursiva = Font.PLAIN;
		public void actionPerformed(ActionEvent evento) {
			String cadena="";
			if(evento.getSource()==cuadro) {
				cadena=String.format("%S", evento.getActionCommand());
				JOptionPane.showMessageDialog(null,cadena);
			}else if(evento.getSource()==cuadrocontraseña) {
				cadena=String.format("%S",new String(cuadrocontraseña.getPassword()));
				JOptionPane.showMessageDialog(null,cadena);
			}
			if(evento.getSource()==boton) {
				cadena=String.format("%S", cuadro.getText());
				JOptionPane.showMessageDialog(null,cadena);
			}
			if(evento.getSource()==boton2) {
				//Tambien es posible declarar de esta forma y no seria necesaria la variable string
				JOptionPane.showMessageDialog(null,String.format("%S",cuadrocontraseña.getText()));
			}
			if(evento.getSource()==negrita) {
				valNegrita=negrita.isSelected() ? Font.BOLD : Font.PLAIN;
			}
			if(evento.getSource()==cursiva) {
				valCursiva=cursiva.isSelected() ? Font.ITALIC : Font.PLAIN;
			}
			cuadrobox.setFont(new Font("Serif",valCursiva+valNegrita,14));

			
		}
	}
	
	/*Modulo que muestra las posibilidades de ventanas disponibles de JOptionPane*/
	void Joptionpane() {
		
		ventana.showMessageDialog(null, "INFORMACION QUE IMPRIME","Nombre de la ventana",JOptionPane.PLAIN_MESSAGE);
		ventana.showMessageDialog(null, "INFORMACION QUE IMPRIME","Nombre de la ventana",JOptionPane.INFORMATION_MESSAGE);
		ventana.showMessageDialog(null, "INFORMACION QUE IMPRIME","Nombre de la ventana",JOptionPane.WARNING_MESSAGE);
		ventana.showMessageDialog(null, "INFORMACION QUE IMPRIME","Nombre de la ventana",JOptionPane.QUESTION_MESSAGE);
		String variable;
		variable=JOptionPane.showInputDialog("Ingresa algun dato y se asignara a variable");
		ventana.showMessageDialog(null, "variable= "+ variable, "Nombre de ventana", JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void main(String[] args) {
		ComponenteJOptionPane teste =new ComponenteJOptionPane();
		//teste.Joptionpane();
		JFrame testee =new JFrame();
		
	}
}
