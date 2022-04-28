//BUSCAR UN IF MAL CERRADO Y LA CONCHA DE SU HERMANA, DESPUES DE ESO MIRAR EL ULTIMO VIDEO Y TERMINASTE


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{
	private JMenuBar mb;
	private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
	private JMenuItem miCalculo, miRojo, miNegro, miMorado, miElCreador, miSalir, miNuevo;
	private JLabel labelLogo, labelBievenido, labelTitle, labelNombre, labelAParterno, labelAMaterno,
				   labelDepartamento, labelAntiguedad, labelResultado, labelfooter;
	private JTextField txtNombreTrabajador, txtAPaternoTrabajador, txtAMaternoTrabajador;
	private JComboBox comboDepartamento, comboAntiguedad;
	private JScrollPane scrollpane1;
	private JTextArea textarea1;
	String nombreUsuario = "";

	public Principal(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//esta linea de codigo hace que los programas no queden en segundo plano(Demonio)
		setTitle("Pantalla Principal");
		getContentPane().setBackground(new Color(255,0,0));
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		Bienvenido ventanabienvenida = new Bienvenido();
		nombreUsuario = ventanabienvenida.texto;

		mb = new JMenuBar();
		mb.setBackground(new Color(255,0,0));
		setJMenuBar(mb);

		menuOpciones = new JMenu("Opciones");
		menuOpciones.setBackground(new Color(255,0,0));
		menuOpciones.setFont(new Font("Andale Mono", 1, 14));
		menuOpciones.setForeground(new Color(255,255,255));
		mb.add(menuOpciones);

		menuCalcular = new JMenu("Calcular");
		menuCalcular.setBackground(new Color(255,0,0));
		menuCalcular.setFont(new Font("Andale Mono", 1, 14));
		menuCalcular.setForeground(new Color(255,255,255));
		mb.add(menuCalcular);

		menuAcercaDe  = new JMenu("Acerca de");
		menuAcercaDe.setBackground(new Color(255,0,0));
		menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
		menuAcercaDe.setForeground(new Color(255,255,255));
		mb.add(menuAcercaDe);

		menuColorFondo = new JMenu("Color de Fondo");
		menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
		menuColorFondo.setForeground(new Color(255,0,0));
		menuOpciones.add(menuColorFondo);

		miCalculo = new JMenuItem("Vacaciones");
		miCalculo.setFont(new Font("Andale Mono",1,14));
		miCalculo.setForeground(new Color(255,0,0));
		menuCalcular.add(miCalculo);
		miCalculo.addActionListener(this);

		miRojo = new JMenuItem("Rojo");
		miRojo.setFont(new Font("Andale Mono",1,14));
		miRojo.setForeground(new Color(255,0,0));
		menuColorFondo.add(miRojo);
		miRojo.addActionListener(this);

		miNegro = new JMenuItem("Negro");
		miNegro.setFont(new Font("Andale Mono",1,14));
		miNegro.setForeground(new Color(255,0,0));
		menuColorFondo.add(miNegro);
		miNegro.addActionListener(this);

		miMorado = new JMenuItem("Morado");
		miMorado.setFont(new Font("Andale Mono",1,14));
		miMorado.setForeground(new Color(255,0,0));
		menuColorFondo.add(miMorado);
		miMorado.addActionListener(this);

		miNuevo = new JMenuItem("Nuevo");
		miNuevo.setFont(new Font("Andale Mono",1,14));
		miNuevo.setForeground(new Color(255,0,0));
		menuOpciones.add(miNuevo);
		miNuevo.addActionListener(this);

		miElCreador = new JMenuItem("El creador");
		miElCreador.setFont(new Font("Andale Mono",1,14));
		miElCreador.setForeground(new Color(255,0,0));
		menuAcercaDe.add(miElCreador);
		miElCreador.addActionListener(this);

		miSalir = new JMenuItem("Salir");
		miSalir.setFont(new Font("Andale Mono",1,14));
		miSalir.setForeground(new Color(255,0,0));
		menuOpciones.add(miSalir);
		miSalir.addActionListener(this);

		ImageIcon imagen = new ImageIcon("images/logo-coca.png");
		labelLogo = new JLabel(imagen);
		labelLogo.setBounds(5,5,250,100);
		add(labelLogo);

		labelBievenido = new JLabel("Bienvenido " + nombreUsuario);
		labelBievenido.setBounds(280,30,300,50);
		labelBievenido.setFont(new Font("Andale Mono",1,32));
		labelBievenido.setForeground(new Color(255,255,255));
		add(labelBievenido);

		 labelTitle = new JLabel("Datos del Trabajador para el calculo de vacaciones");
		 labelTitle.setBounds(45,140,900,25);
		 labelTitle.setFont(new Font("Andale Mono", 0 ,24));
		 labelTitle.setForeground(new Color(255,255,255));
		 add(labelTitle);

		 labelNombre = new JLabel("Nombre :");
		 labelNombre.setBounds(25,188,180,25);
		 labelNombre.setFont(new Font("Andale Mono",1,12));
		 labelNombre.setForeground(new Color(255,255,255));
		 add(labelNombre);

		 txtNombreTrabajador = new JTextField();
		 txtNombreTrabajador.setBounds(25,213,150,25);
		 txtNombreTrabajador.setBackground(new java.awt.Color(224,224,224));
		 txtNombreTrabajador.setFont(new Font("Andale Mono",1,14));
		 txtNombreTrabajador.setForeground(new java.awt.Color(255,0,0));
		 add(txtNombreTrabajador);

		 labelAParterno = new JLabel("Apellido Paterno:");
		 labelAParterno.setBounds(25,248,180,25);
		 labelAParterno.setFont(new Font("Andale Mono",1,14));
		 labelAParterno.setForeground(new Color(225,255,255));
		 add(labelAParterno);

		 txtAPaternoTrabajador = new JTextField();
		 txtAPaternoTrabajador.setBounds(25,273,150,25);
		 txtAPaternoTrabajador.setBackground(new java.awt.Color(224,224,224));
		 txtAPaternoTrabajador.setFont(new Font("Andale Mono",1,14));
		 txtAPaternoTrabajador.setForeground(new java.awt.Color(255,0,0));
		 add(txtAPaternoTrabajador);

		 labelAMaterno = new JLabel("Apellido Materno:");
		 labelAMaterno.setBounds(25,308,180,25);
		 labelAMaterno.setFont(new Font("Andale Mono",1,14));
		 labelAMaterno.setForeground(new Color(225,255,255));
		 add(labelAMaterno);

		 txtAMaternoTrabajador = new JTextField();
		 txtAMaternoTrabajador.setBounds(25,334,150,25);
		 txtAMaternoTrabajador.setBackground(new java.awt.Color(224,224,224));
		 txtAMaternoTrabajador.setFont(new Font("Andale Mono",1,14));
		 txtAMaternoTrabajador.setForeground(new java.awt.Color(255,0,0));
		 add(txtAMaternoTrabajador);

		 labelDepartamento = new JLabel("Selecciona el Departamento:");
		 labelDepartamento.setBounds(220,180,190,25);
		 labelDepartamento.setFont(new Font("Andale Mono",1,12));
		 labelDepartamento.setForeground(new Color(255,255,255));
		 add(labelDepartamento);

		 comboDepartamento = new JComboBox();
		 comboDepartamento.setBounds(220,213,220,25);
		 comboDepartamento.setBackground(new java.awt.Color(224,224,224));
		 comboDepartamento.setFont(new java.awt.Font("Andale Mono",1,14));
		 comboDepartamento.setForeground(new java.awt.Color(225,0,0));
		 add(comboDepartamento);
		 comboDepartamento.addItem("");
		 comboDepartamento.addItem("Atencion al Cliente");
		 comboDepartamento.addItem("Departamento de Logistica");
		 comboDepartamento.addItem("Departamento de Gerencia");
		 
		 labelAntiguedad = new JLabel("Selecciona la Antiguedad");
		 labelAntiguedad.setBounds(220,248,180,25);
		 labelAntiguedad.setFont(new Font("Andale Mono",1,12));
		 labelAntiguedad.setForeground(new Color(255,255,255));
		 add(labelAntiguedad);

		 comboAntiguedad = new JComboBox();
		 comboAntiguedad.setBounds(220,273,220,25);
		 comboAntiguedad.setBackground(new java.awt.Color(224,224,224));
		 comboAntiguedad.setFont(new java.awt.Font("Andale Mono",1,14));
		 comboAntiguedad.setForeground(new java.awt.Color(225,0,0));
		 add(comboAntiguedad);
		 comboAntiguedad.addItem("");
		 comboAntiguedad.addItem("1 ano de servicio");
		 comboAntiguedad.addItem("2 a 6 anos de servicio");
		 comboAntiguedad.addItem("7 anos o mas de servicio");

		 labelResultado = new JLabel("Resultado del Calculo");
		 labelResultado.setBounds(220,307,180,25);
		 labelResultado.setFont(new Font("Andale Mono",1,12));
		 labelResultado.setForeground(new Color(255,255,255));
		 add(labelResultado);

		 textarea1 = new JTextArea();
		 textarea1.setEditable(false);
		 textarea1.setBackground(new Color(224,224,224));
		 textarea1.setFont(new Font("Andale Mono",1,11));
		 textarea1.setForeground(new Color(255,0,0));
		 textarea1.setText("\n    Aqui aparece el resultado del calculo de las vacaciones.");
		 scrollpane1 = new JScrollPane(textarea1);
		 scrollpane1.setBounds(220,333,385,90);
		 add(scrollpane1);

		 labelfooter = new JLabel("2017 The Coca-Cola Company | Todos los derechos reservados");
		 labelfooter.setBounds(135,445,500,30);
		 labelfooter.setFont(new java.awt.Font("Andale Mono",1,12));
		 labelfooter.setForeground(new java.awt.Color(255,255,255));
		 add(labelfooter);

	}//out constructor	

public void actionPerformed(ActionEvent evento){
	if(evento.getSource() == miCalculo){
		String nombreTrabajador = txtNombreTrabajador.getText();
		String ap = txtAPaternoTrabajador.getText();
		String am = txtAMaternoTrabajador.getText();
		String departamento = comboDepartamento.getSelectedItem().toString();
		String antiguedad = comboAntiguedad.getSelectedItem().toString(); 
		int vacaciones = 0;

		if(nombreTrabajador.equals("") || ap.equals("") || am.equals("") || am.equals("") ||
			departamento.equals("") || antiguedad.equals("")){
			JOptionPane.showMessageDialog(null, "Debes completar Todos los campos.");
		}else {
			if(departamento.equals("Atencion al Cliente")){
				if(antiguedad.equals("1 ano de servicio")){
					vacaciones = 6;
					textarea1.setText("\n    El trabajador " + nombreTrabajador + " " + " " + am +
									  "\n    quien labora en " + departamento + " con " + antiguedad +
									  "\n    recibe " + vacaciones + " dias de vacaciones." );
				}//out 1 ano de servicio
				if(antiguedad.equals("2 a 6 anos de servicio")){
					vacaciones = 14;
					textarea1.setText("\n    El trabajador " + nombreTrabajador + " " + " " + am +
									  "\n    quien labora en " + departamento + " con " + antiguedad +
									  "\n    recibe " + vacaciones + " dias de vacaciones." );
				}//out if 2 a 6 anos de servicio
				if(antiguedad.equals("7 o mas anos de servicio")){
					vacaciones = 20;
					textarea1.setText("\n    El trabajador " + nombreTrabajador + " " + " " + am +
									  "\n    quien labora en " + departamento + " con " + antiguedad +
									  "\n    recibe " + vacaciones + " dias de vacaciones." );
				}//out if 7 o mas anos de servicio
			}//out if atencion al cliente
			if(departamento.equals("Departamento de Logisitica")){
				if(antiguedad.equals("1 ano de servicio")){
					vacaciones = 7;
					textarea1.setText("\n    El trabajador " + nombreTrabajador + " " + " " + am +
									  "\n    quien labora en " + departamento + " con " + antiguedad +
									  "\n    recibe " + vacaciones + " dias de vacaciones." );
				}//out 1 ano de servicio
				if(antiguedad.equals("2 a 6 anos de servicio")){
					vacaciones = 15;
					textarea1.setText("\n    El trabajador " + nombreTrabajador + " " + " " + am +
									  "\n    quien labora en " + departamento + " con " + antiguedad +
									  "\n    recibe " + vacaciones + " dias de vacaciones." );
				}//out if 2 a 6 anos de servicio
				if(antiguedad.equals("7 o mas anos de servicio")){
					vacaciones = 22;
					textarea1.setText("\n    El trabajador " + nombreTrabajador + " " + " " + am +
									  "\n    quien labora en " + departamento + " con " + antiguedad +
									  "\n    recibe " + vacaciones + " dias de vacaciones." );
				}//out if 7 o mas anos de servicio
			}//out if departamento de logistica
			if(departamento.equals("Departamente de Gerencia")){
				if(antiguedad.equals("1 ano de servicio")){
					vacaciones = 10;
					textarea1.setText("\n    El trabajador " + nombreTrabajador + " " + " " + am +
									  "\n    quien labora en " + departamento + " con " + antiguedad +
									  "\n    recibe " + vacaciones + " dias de vacaciones." );
				}//out 1 ano de servicio
				if(antiguedad.equals("2 a 6 anos de servicio")){
					vacaciones = 20;
					textarea1.setText("\n    El trabajador " + nombreTrabajador + " " + " " + am +
									  "\n    quien labora en " + departamento + " con " + antiguedad +
									  "\n    recibe " + vacaciones + " dias de vacaciones." );
				}//out if 2 a 6 anos de servicio
				if(antiguedad.equals("7 o mas anos de servicio")){
					vacaciones = 30;
					textarea1.setText("\n    El trabajador " + nombreTrabajador + " " + " " + am +
									  "\n    quien labora en " + departamento + " con " + antiguedad +
									  "\n    recibe " + vacaciones + " dias de vacaciones." );
				}//out if 7 o mas anos de servicio
			}//out departamento de gerencia


		}//out else de mi Calculo

	}//out if 	
	if(evento.getSource() == miRojo){
		getContentPane().setBackground(new Color(255,0,0));
		mb.setBackground(new Color(255,0,0));
	}//out if
	if(evento.getSource() == miNegro){
		getContentPane().setBackground(new Color(0,0,0));
		mb.setBackground(new Color(0,0,0));
	}//out if
	if(evento.getSource() == miMorado){
		getContentPane().setBackground(new Color(51,0,51));
		mb.setBackground(new Color(51,0,51));
	}//out if
	if(evento.getSource() == miNuevo){
		txtNombreTrabajador.setText("");
		txtAPaternoTrabajador.setText("");
		txtAMaternoTrabajador.setText("");
		comboAntiguedad.setSelectedIndex(0);
		comboDepartamento.setSelectedIndex(0);
		textarea1.setText("\n    Aqui aparece el resultado del calculo de las vacaciones.");

	}//out if
	if(evento.getSource() == miSalir){
		Bienvenido ventanabienvenida = new Bienvenido();
		ventanabienvenida.setBounds(0,0,350,450);
		ventanabienvenida.setVisible(true);
		ventanabienvenida.setResizable(false);
		ventanabienvenida.setLocationRelativeTo(null);
		this.setVisible(false);
	}//out if
	if(evento.getSource() == miElCreador){
		JOptionPane.showMessageDialog(null,"Creado por ney mi primer interfaz grafica, es media\n" + 
										   "berreta pero bueno se hizo lo que se pudo gracias por todo :)");
	}//out if
}//out evento

public static void main(String args[]){
	Principal ventanaPrincipal = new Principal();
	ventanaPrincipal.setBounds(0,0,640,535);
	ventanaPrincipal.setVisible(true);
	ventanaPrincipal.setResizable(false);
	ventanaPrincipal.setLocationRelativeTo(null);
}//out main

}//out class