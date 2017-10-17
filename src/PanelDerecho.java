
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

public class PanelDerecho extends JPanel{

	private JLabel JLNombre,JLApellido,JLEdad,JLPuesto;
	
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
       
	}








}

