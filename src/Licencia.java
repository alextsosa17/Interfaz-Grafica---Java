import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{
	private JButton boton1, boton2;
	private JTextArea textarea1;
	private JCheckBox check1;
	private JLabel label1, label2;
	private JScrollPane scrollpane1;
	String nombre = "";

	public Licencia(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//esta linea de codigo hace que los programas no queden en segundo plano(Demonio)
		setTitle("Licencia de uso");
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		Bienvenido ventanaBienvenido = new Bienvenido();
		nombre = ventanaBienvenido.texto;//asi recupero la variable de la otra interfaz grafica

		label1 = new JLabel("TERMINOS Y CONDICIONES");
		label1.setBounds(215,5,200,30);
		label1.setFont(new Font("Andale Mono", 1, 14));
		label1.setForeground(new Color(0, 0, 0));
		add(label1);

		textarea1 = new JTextArea();
		textarea1.setEditable(false);//esto sirve para ver si es editable el text area
		textarea1.setFont(new Font("Andale Mono",0 ,9));
		textarea1.setText("\n\n          TÉRMINOS Y CONDICIONES" +
                    "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA GEEKIPEDIA DE ERNESTO." +
                    "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRAFICAS." +
                    "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                    "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                    "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED" + 
                    "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                    "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
                    "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + 
                    "\n          http://www.youtube.com/ernestoperezm");

		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(10, 40, 575 ,200);
		add(scrollpane1);

		check1 = new JCheckBox("Yo " + nombre + " Acepto");
		check1.setBounds(10,250,300,30);
		check1.addChangeListener(this);
		add(check1);

		boton1 = new JButton("Continuar");
		boton1.setBounds(10,290,100,30);
		boton1.addActionListener(this);
		boton1.setEnabled(false);//boton inactivo
		add(boton1);

		boton2 = new JButton("No Acepto");
		boton2.setBounds(120,290,100,30);
		boton2.addActionListener(this);
		boton2.setEnabled(true);//boton activo
		add(boton2);

		
    ImageIcon imagen = new ImageIcon("images/coca-cola.png");
    label2 = new JLabel(imagen);  
    label2.setBounds(315,135,300,300);
    add(label2);
	}//out contructor

public void stateChanged(ChangeEvent evento){
	if(check1.isSelected() == true){
		boton1.setEnabled(true);
		boton2.setEnabled(false);
	}//out if
	else{
		boton1.setEnabled(false);
		boton2.setEnabled(true);
	}//out else
}//out evento check

public void actionPerformed(ActionEvent evento){
	if(evento.getSource() == boton2){
		Bienvenido ventanabienvenida = new Bienvenido();
		ventanabienvenida.setBounds(0,0,350,450);
		ventanabienvenida.setVisible(true);
		ventanabienvenida.setResizable(false);
		ventanabienvenida.setLocationRelativeTo(null);
		this.setVisible(false);
	}//out if
	if(evento.getSource() == boton1){
		Principal ventanaPrincipal = new Principal();
		ventanaPrincipal.setBounds(0,0,640,535);
		ventanaPrincipal.setVisible(true);
		ventanaPrincipal.setResizable(false);
		ventanaPrincipal.setLocationRelativeTo(null);	
		this.setVisible(false);
	}
}//out evento botones

public static void main(String args[]){
	Licencia ventanalicencia = new Licencia();
	ventanalicencia.setBounds(0,0,600,400);
	ventanalicencia.setVisible(true);
	ventanalicencia.setResizable(false);
	ventanalicencia.setLocationRelativeTo(null); 

}//out main


}//out class