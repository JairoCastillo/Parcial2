
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Image;
import javax.swing.ImageIcon;

public class PanelDerecho extends JPanel{

	private JLabel JLNombre,JLApellido,JLEdad,JLPuesto;
	
	public PanelDerecho() {
		setLayout( new BorderLayout( ) );
		JLabel imagen3 = new JLabel();
		ImageIcon icono3 = new ImageIcon("");
		imagen3.setIcon(icono3);
		imagen3.setHorizontalAlignment( JLabel.CENTER );
		add( imagen3, BorderLayout.CENTER );
		setBackground( Color.ORANGE);
	}
}

