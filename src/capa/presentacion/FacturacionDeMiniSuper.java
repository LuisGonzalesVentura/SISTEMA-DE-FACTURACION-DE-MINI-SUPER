package capa.presentacion;
import java.time.LocalDate;
import java.time.LocalTime;

import capa.logica.Libreria;
import capa.logica.Producto;
import capa.logica.TADLista;
import capa.logica.TADListaProductos;
import capa.presentacion.Ejercicio1;

public class FacturacionDeMiniSuper {
	private static TADListaProductos Lp= new TADListaProductos();
	private static Libreria L = new Libreria();
	private static Libreria Li = new Libreria();

	private static int menu()
	{
		L.mostrarMensaje("\n\n\n\n\n");
		L.mostrarMensaje("FACTURA DE MINI SUPER\n");
		L.mostrarMensaje("\n");
		L.mostrarMensaje("1. REGISTAR PRODUCTO\n");
		L.mostrarMensaje("2. REGISTRAR CLIENTE\n");				
		L.mostrarMensaje("3. MODIFICAR PRODUCTO\n");
		L.mostrarMensaje("4. BUSCAR PRODUCTO\n");
		L.mostrarMensaje("5. BORRAR PRODUCTO\n");
		L.mostrarMensaje("6. FACTURACION\n");
		L.mostrarMensaje("7. SALIR\n");
		
		return L.leerNumEntPos("Opcion:");
	}
	
	private static int menuModificar()
	{
		L.mostrarMensaje("\n\n\n\n\n");
		L.mostrarMensaje("MODIFICAR PRODUCTO\n");
		
		L.mostrarMensaje("1. NUMERO DE PRODUCTO\n");
		L.mostrarMensaje("2. NOMBRE PRODUCTO\n");
		L.mostrarMensaje("3. CANTIDAD\n");
		L.mostrarMensaje("4. PRECIO \n");
		L.mostrarMensaje("5. NINGUNO\n");
		L.mostrarMensaje(Lp.mostrarLista());
		return L.leerNumEntPos("Opcion:");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto p;
		int pos=0, opcion=0,opc=0;
		String nombre="";
		do
		{
			opcion=menu();
			switch (opcion)
			{
			case 1: 
				p = new Producto();
				L.mostrarMensaje("\n\n\n\n\n");
				
		
				
				
				L.mostrarMensaje(" DATOS PRODUCTOS\n");
				L.mostrarMensaje("------------------------------------\n");
				p.setnumerodeproducto(L.leerDato("NUMERO DE PRODUCTO: ").toUpperCase());
				p.setNombre(L.leerDato(" NOMBRE DE PRODUCTOS:").toUpperCase());
				
				p.setCantidad(L.leerDato(" CANTIDAD DE PRODUCTOS:"));
				p.setPrecio(L.leerNumRealPos(" PRECIO DE PRODUCTOS:"));
				
				
				Lp.insertarAlFinal(p);
				break;
			case 2:
			 
				p = new Producto();
				L.mostrarMensaje("\n\n\n\n\n");
				
		
				
				
				L.mostrarMensaje(" DATOS CLIENTE\n");
				L.mostrarMensaje("------------------------------------\n");
				p.setcarnet(L.leerDato("CARNET DEL CLIENTE: ").toUpperCase());
				p.setnombrecli(L.leerDato(" NOMBRE CLIENTE:").toUpperCase());
				
			
				
				
				Lp.insertarAlFinal(p);
				break;
			case 3:
				nombre = L.leerDato("NUMERO PRODUCTO:").toUpperCase();
				pos = Lp.buscaElemento(nombre);
				if (pos==-1)
				{
					L.mostrarMensaje("EL "+nombre+" NO EXISTE");
					L.pausa("PRESIONE CUALQUIER TECLA...");
				}
				else
					opc = menuModificar();
					p = new Producto();
					p = Lp.extraerElemento(pos);
					switch(opc)
					{
					
					case 1: 
						p.setnumerodeproducto(L.leerDato("NUMERO DE PRODUCTO"));
						break;
					case 2: 
						p.setNombre(L.leerDato("NOMBRE PRODUCTO:"));
						break;
						
					case 3:	
						p.setCantidad(L.leerDato("CANTIDAD PRODUCTO:"));
						break;
					case 4:	
						p.setPrecio(L.leerNumRealPos("PRECIO PRODUCTO:"));
						break;
					}
					Lp.reemplazar(Lp.extraerElemento(pos), p);
				break;
			case 4:
				nombre = L.leerDato("NUMERO DE PRODUCTO:").toUpperCase();
				pos = Lp.buscaElemento(nombre);
				if (pos==-1)
					L.mostrarMensaje("EL "+nombre+" NO EXISTE");
				
				else
				{
					L.mostrarMensaje("------------------------------------\n");
					L.mostrarMensaje("DATOS DEL PRODUCTO \n");
					
					
					L.mostrarMensaje("NUMERO PRODUCTO "+Lp.extraerElemento(pos).getnumerodeproducto()+"\n");
					
					L.mostrarMensaje("NOMBRE PRODUCTO "+Lp.extraerElemento(pos).getNombre()+"\n");
					L.mostrarMensaje("CANTIDAD PRODUCTO "+Lp.extraerElemento(pos).getCantidad()+"\n");
					L.mostrarMensaje("PRECIO PRODUCTO"+Lp.extraerElemento(pos).getPrecio()+"\n");
				
				}
				L.pausa("PRESIONE CUALQUIER TECLA...");
				break;
			case 5:
				nombre = L.leerDato("NUMERO:").toUpperCase();
				pos = Lp.buscaElemento(nombre);
				if (pos==-1)
				{
					L.mostrarMensaje("EL "+nombre+" NO EXISTE");
					L.pausa("PRESIONE CUALQUIER TECLA...");
				}
				
				else
					if (L.confirmar("¿ESTÁ SEGURO DE BORRAR?")=='S')
						Lp.borrar(Lp.extraerElemento(pos));
				break;
			case 6:

				
				
					L.mostrarMensaje("CANCELADO");
				L.mostrarMensaje("\n\n\n\n\n");
				L.mostrarMensaje("               FACTURA\n");
				L.mostrarMensaje("              MINI SUPER\n");
				L.mostrarMensaje("\n\n");
				L.mostrarMensaje("DATOS CLIENTE\n");
				L.mostrarMensaje("------------------------------------\n");
				L.mostrarMensaje("NIT: "+Lp.extraerElemento(pos).getcarnet()+"\n");
				L.mostrarMensaje("NOMBRE CLIENTE: "+Lp.extraerElemento(pos).getnombrecli()+"\n");
				
				L.mostrarMensaje("------------------------------------\n");
				L.mostrarMensaje("DATOS PRODUCTOS\n");
				L.mostrarMensaje("------------------------------------\n");
				L.mostrarMensaje("NUMERO PRODUCTO: "+Lp.extraerElemento(pos).getnumerodeproducto()+"\n");				
				L.mostrarMensaje("NOMBRE PRODUCTO: "+Lp.extraerElemento(pos).getNombre()+"\n");
				L.mostrarMensaje("CANTIDAD PRODUCTO: "+Lp.extraerElemento(pos).getCantidad()+"\n");
				L.mostrarMensaje("PRECIO PRODUCTO: "+Lp.extraerElemento(pos).getPrecio()+"\n");
				L.mostrarMensaje("------------------------------------\n");
				
				
				LocalTime horaActual=LocalTime.now();
				System.out.println("HORA ACTUAL: "+ horaActual);
				LocalDate FechaActual=LocalDate.now();
				System.out.println(" FECHA ACTUAL: "+ FechaActual);
				
				break;
			
		}
			
			
			
		}while (opcion!=7);		
				
			
		
	}

}
