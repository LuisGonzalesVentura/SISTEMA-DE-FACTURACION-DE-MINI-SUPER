package capa.presentacion;

import capa.logica.Libreria;
import capa.logica.Producto;
import capa.logica.TADLista;

public class Ejercicio1 {
	
		// TODO Auto-generated method stub
		private static Libreria Li = new Libreria();
		private static TADLista L = new TADLista();
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Producto dato=new Producto();
			String datoC;
			do
			{
				datoC=Li.leerDato("INGRESE EL NOMBRE");
				dato.setNombre(datoC);
				if (!datoC.equals("*"))
					L.insertarAlPrincipio(datoC);
			}while(!datoC.equals("*"));
			Li.mostrarMensaje(L.mostrarLista());
		}
		
		


}
