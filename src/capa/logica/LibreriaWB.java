package capa.logica;

import javax.swing.JOptionPane;

public class LibreriaWB {
	
	public String leerDato(String mensaje)
	{
		return JOptionPane.showInputDialog(null,mensaje);
	}

}
