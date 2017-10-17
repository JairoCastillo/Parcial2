import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import Publicidad0.persona;


public class PanelIzquierdo extends JPanel implements ActionListener{
	private String nombre,apellido,direccion,tipo;
	private int cedula,numero,edad,peso,altura,celular,puesto;
	
	private JLabel Lnombre,Lapellido,Ltipo,Lnumero,Ledad,Lpeso,Laltura,Lcelular,Ldireccion,Lpuesto;
	private JButton Bagregar;
	private JTextField Tnombre,Tapellido,Ttipo,Tnumero,Tedad,Tpeso,Taltura,Tcelular,Tdireccion,Tpuesto;
	
	private usuario Usuario;
	static List<usuario> listaUsuario=new ArrayList<usuario>();
	
	public PanelIzquierdo() {
		setLayout( new GridBagLayout( ) );
		Border borde = BorderFactory.createTitledBorder( "Panel Izquierdo" );
        setBorder( borde );
        GridBagConstraints constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 0;
        constraint.fill = GridBagConstraints.BOTH;
        Insets insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        
        Lnombre=new JLabel("Nombre");
        Lnombre.setForeground(Color.BLUE);
        constraint.gridx = 0;
        constraint.gridy = 1;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(Lnombre, constraint );
        
        Tnombre=new JTextField();
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 2;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add( Tnombre, constraint );
        
        Lapellido=new JLabel("Apellido");
        Lapellido.setForeground(Color.BLUE);
        constraint.gridx = 0;
        constraint.gridy = 3;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(Lapellido, constraint );
        
        Tapellido=new JTextField();
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 4;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add( Tapellido, constraint );
        
        Ltipo=new JLabel("Tipo");
        Ltipo.setForeground(Color.BLUE);
        constraint.gridx = 0;
        constraint.gridy = 5;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(Ltipo, constraint );
        
        Ttipo=new JTextField();
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 6;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add( Ttipo, constraint );
        
        Lnumero=new JLabel("Numero");
        Lnumero.setForeground(Color.BLUE);
        constraint.gridx = 0;
        constraint.gridy = 7;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(Lnumero, constraint );
        
        Tnumero=new JTextField();
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 8;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add( Tnumero, constraint );
        
        Ledad=new JLabel("Edad");
        Ledad.setForeground(Color.BLUE);
        constraint.gridx = 0;
        constraint.gridy = 9;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(Ledad, constraint );
        
        Tedad=new JTextField();
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 10;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add( Tedad, constraint );
        
        Lpeso=new JLabel("Peso");
        Lpeso.setForeground(Color.BLUE);
        constraint.gridx = 0;
        constraint.gridy =11;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(Ltipo, constraint );
        
        Tpeso=new JTextField();
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 12;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add( Tpeso, constraint );
        
        Laltura=new JLabel("Altura");
        Laltura.setForeground(Color.BLUE);
        constraint.gridx = 0;
        constraint.gridy = 13;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(Laltura, constraint );
        
        Taltura=new JTextField();
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 14;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add( Taltura, constraint );
        
        Lcelular=new JLabel("Celular");
        Lcelular.setForeground(Color.BLUE);
        constraint.gridx = 0;
        constraint.gridy = 15;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(Lcelular, constraint );
        
        Tcelular=new JTextField();
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 16;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add( Tcelular, constraint );
        
        Ldireccion=new JLabel("Direccion");
        Ldireccion.setForeground(Color.BLUE);
        constraint.gridx = 0;
        constraint.gridy = 17;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(Ldireccion, constraint );
        
        Tdireccion=new JTextField();
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 18;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add( Tdireccion, constraint );
        
        Lpuesto=new JLabel("Puesto");
        Lpuesto.setForeground(Color.BLUE);
        constraint.gridx = 0;
        constraint.gridy = 19;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(Lpuesto, constraint );
        
        Tpuesto=new JTextField();
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 20;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add( Tpuesto, constraint );
        
        Bagregar = new JButton("Agregar");
        Bagregar.addActionListener(this);
        Bagregar.setActionCommand("Agregar");
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 21;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add( Bagregar, constraint );
        
        
	}
	public void actionPerformed(ActionEvent e) {
		if("Agregar".equals(e.getActionCommand())) {
			if(validarUsuario()) {
				nombre=Tnombre.getText();
				apellido=Tapellido.getText();
				tipo=Ttipo.getText();
				numero=Integer.parseInt(Tnumero.getText());
				edad=Integer.parseInt(Tedad.getText());
				peso=Integer.parseInt(Tpeso.getText());
				altura=Integer.parseInt(Taltura.getText());
				celular=Integer.parseInt(Tcelular.getText());
				direccion=Tdireccion.getText();
				puesto=Integer.parseInt(Tpuesto.getText());
				
				Usuario=new usuario(nombre,apellido,tipo,numero,edad,peso,altura,celular,direccion,puesto);
				listaUsuario.add(Usuario);
				JOptionPane.showMessageDialog(this,"Registro completo.","Mensaje",JOptionPane.INFORMATION_MESSAGE);
				
				Tnombre.setText("");
				Tapellido.setText("");
				Ttipo.setText("");
				Tnumero.setText("");
				Tedad.setText("");
				Tpeso.setText("");
				Taltura.setText("");
				Tcelular.setText("");
				Tdireccion.setText("");
				Tpuesto.setText("");
				
			}
		}
	}
	public boolean validarUsuario() {
	if(Tnombre.getText().equals("")||Tapellido.getText().equals("")||Ttipo.getText().equals("")||Tnumero.getText().equals("")||Tedad.getText().equals("")||Tpeso.getText().equals("")||Taltura.getText().equals("")||Tcelular.getText().equals("")||Tdireccion.getText().equals("")||Tpuesto.getText().equals("")) {
		return false;
	}
	}
}
