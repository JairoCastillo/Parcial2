
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.JLabel;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class PanelDerecho extends JPanel implements ActionListener{

	private JLabel JLNombre,JLApellido,JLEdad,JLPuesto;
	private JButton JBMostrar;
	
	public PanelDerecho() {
		setLayout( new GridBagLayout( ) );
		Border borde = BorderFactory.createTitledBorder( "Panel Derecho" );
        setBorder( borde );
        
        GridBagConstraints constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 0;
        constraint.fill = GridBagConstraints.BOTH;
        Insets insets = new Insets(5, 10, 5, 10);
        constraint.insets = insets;
       
        
        JBMostrar= new JButton("Mostrar Medallistas");
        JBMostrar.addActionListener(this);
        JBMostrar.setActionCommand("Mostrar Medallistas");
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 1;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(JBMostrar, constraint );
        
	        setLayout( new BorderLayout( ) );
			JLabel imagen1 = new JLabel();
			ImageIcon icono1 = new ImageIcon("img/oro.PNG");
			imagen1.setIcon(icono1);
			imagen1.setHorizontalAlignment( JLabel.CENTER );
			add( imagen1, BorderLayout.CENTER );
		
		    setLayout( new BorderLayout( ) );
			JLabel imagen2 = new JLabel();
			ImageIcon icono2 = new ImageIcon("img/plata.PNG");
			imagen2.setIcon(icono2);
			imagen2.setHorizontalAlignment( JLabel.CENTER );
			add( imagen2, BorderLayout.CENTER );
		
		    setLayout( new BorderLayout( ) );
			JLabel imagen3 = new JLabel();
			ImageIcon icono3 = new ImageIcon("img/bronce.PNG");
			imagen3.setIcon(icono3);
			imagen3.setHorizontalAlignment( JLabel.CENTER );
			add( imagen3, BorderLayout.CENTER );
		
	
	
	}

	public void actionPerformed(ActionEvent e) {
		
		
	}









}


