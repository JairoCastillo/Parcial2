
import java.awt.*;
import javax.swing.*;

public class Jframe extends JFrame{
	PanelDerecho panelDerecho;
	PanelIzquierdo panelIzquierdo;

	Jframe(){
		super("Medallistas");
		iniciar();
		componente();
		setVisible(true);
		 pack();
		setLocationRelativeTo( null );
	}
	
public Jframe iniciar(){
		
		Dimension dims = new Dimension(800, 750);
		this.setSize(dims);
		this.setPreferredSize(dims);
		this.getContentPane( ).setLayout( new BorderLayout( ) );
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return this;
	}

public void componente() {
	
	panelDerecho = new PanelDerecho();
	add(panelDerecho, BorderLayout.CENTER );
	 
	panelIzquierdo= new PanelIzquierdo();
    add(panelIzquierdo, BorderLayout.WEST );
 }
}