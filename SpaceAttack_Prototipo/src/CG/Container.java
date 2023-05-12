package CG;

import javax.swing.JFrame;
import Elementos.Fase01;

public class Container extends JFrame {
	public Container() {
		add(new Fase01());
		setTitle("Galaxy War");
		setSize(1024,728);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		setLocationRelativeTo(null);
		this.setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[]args) {
		new Container();
	}
	
	
}
