import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenido extends JFrame implements ActionListener{
	private JButton boton1;
	private JLabel label1, label2, label3, label4;
	private JTextField textfield1;
	public static String texto = "";

	public Bienvenido(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Bienvenido");
		getContentPane().setBackground(new Color(255,0,0));
		setIconImage(new ImageIcon(getClass().getResource("C:\Users\Compaq Presario\Desktop\Portafolios\Java Inicial\Proyecto inicial\Img/icon.png")).getImage());
		//colocarlo en el icono	//objeto	//nombre de clase	//cargar la imagen//obterner imagen
		//LABEL 1
		ImageIcon imagen = new ImageIcon("C:\Users\Compaq Presario\Desktop\Portafolios\Java Inicial\Proyecto inicial\Img/logo-coca.png");//creo un nuevo objeto para ponerlo en un label			
		label1 = new JLabel(imagen);//como cree un objeto que es una imagen, lo coloco aqui adentro
		label1.setBounds(25,15,300,150);
		add(label1);
		//LABEL 2
		label2 = new JLabel("Sistema de Control Vacacional");
		label2.setBounds(35,135,300,30);
		label2.setFont(new Font("Andale Mono", 3, 18));//cambiar la fuante("tipografia",0 = normal/1 = negrita/ 2 =cursiva /3=negrita y cursiva, tamaño de la letra en px) 
		label2.setForeground(new Color(255,255,255));//cambiar el color de fuente
		add(label2);
		
		//LABEL 3
		label3 = new JLabel("Ingrese su nombre");
		label3.setBounds(45,212,200,30);
		label3.setFont(new Font("Andale Mono", 1, 12));//cambiar la fuante("tipografia",0 = normal/1 = negrita/ 2 =cursiva /3=negrita y cursiva, tamaño de la letra en px) 
		label3.setForeground(new Color(255,255,255));//cambiar el color de fuente
		add(label3);

		//LABEL 4
		label4 = new JLabel("2017 The Coca-Cola Company");
		label4.setBounds(85,375,300,30);
		label4.setFont(new Font("Andale Mono", 1, 12));//cambiar la fuante("tipografia",0 = normal/1 = negrita/ 2 =cursiva /3=negrita y cursiva, tamaño de la letra en px) 
		label4.setForeground(new Color(255,255,255));//cambiar el color de fuente
		add(label4);

		textfield1 = new JTextField();
		textfield1.setBounds(45,240,255,25);
		textfield1.setBackground(new Color(224,224,224));
		textfield1.setFont(new Font("Andale Mono", 1, 14));
		textfield1.setForeground(new Color(255,0,0));
		add(textfield1);

		boton1 = new JButton("Ingresar");
		boton1.setBounds(125,280,100,30);
		boton1.setBackground(new Color(255,255,255));
		boton1.setFont(new Font("Andale Mono", 1, 14));
		boton1.setForeground(new Color(255,0,0));
		boton1.addActionListener(this);
		add(boton1);

	}//out constructor
public void actionPerformed(ActionEvent evento){
	
	if(evento.getSource() == boton1){
		texto = textfield1.getText().trim();
	if(texto.equals("")){
		JOptionPane.showMessageDialog(null, "Debes ingresa tu nombre.");

	}//out if
	else{
		Licencia ventanalicencia = new Licencia();
		ventanalicencia.setBounds(0,0,600,400);
		ventanalicencia.setVisible(true);
		ventanalicencia.setResizable(false);
		ventanalicencia.setLocationRelativeTo(null);
		this.setVisible(false);
	}//out else
	}//out if
}//out evento boton

public static void main(String args[]){
	Bienvenido ventanabienvenida = new Bienvenido();
	ventanabienvenida.setBounds(0,0,350,450);
	ventanabienvenida.setVisible(true);
	ventanabienvenida.setResizable(false);
	ventanabienvenida.setLocationRelativeTo(null);



}//out main




}//out class