package capa.logica;

import java.util.Scanner;

public class Libreria {
	
	private Scanner teclado;
	public Libreria()
	{
		teclado = new Scanner(System.in);
	}
	
	public String leerDato(String mensaje)
	{
		mostrarMensaje(mensaje+" ");
		return teclado.nextLine();
	}	
	public int leerNumEntPos(String mensaje)
	{
		int n;
		do
		{
			mostrarMensaje(mensaje);
			n= Integer.parseInt(teclado.nextLine());
		}while (n<0);
		return n;
	}
	public double leerNumRealPos(String mensaje)
	{
		double n;
		do
		{
			mostrarMensaje(mensaje);
			n= Double.parseDouble(teclado.nextLine());
		}while (n<=0);
		return n;
	}
	
	public char confirmar(String mensaje)
	{
		char r;
		do
			r = leerDato(mensaje).charAt(0);
		while ((r!='N') && (r!='S'));
		return r;
	}
	public String pausa(String mensaje)
	{
		String r;
			r = leerDato(mensaje);
		return r;
	}
	public void mostrarMensaje(String mensaje)
	{
		System.out.print(mensaje+" ");
	}

	public void insertarAlPrincipio(String datoC) {
		// TODO Auto-generated method stub
		
	}

}
