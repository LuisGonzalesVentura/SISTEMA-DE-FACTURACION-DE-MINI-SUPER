package capa.logica;

public class TADListaProductos 

{
	private NodoProducto cabeza;
	
	
	public TADListaProductos()
	{
		cabeza=null;
	}
	public NodoProducto getCabeza() {
		return cabeza;
	}
	public void setCabeza(NodoProducto cabeza) {
		this.cabeza = cabeza;
	}
	public void insertarAlPrincipio(Producto dato)
	{
		NodoProducto paux=new NodoProducto(dato);
		if (cabeza==null)
			cabeza=paux;
		else
		{
			paux.setEnlace(cabeza);
			cabeza=paux;
			
		}
	}
	
	public void insertarAlFinal(Producto dato)
	{
		NodoProducto paux=new NodoProducto(dato);
		NodoProducto ultimo;
		if (cabeza==null)
			cabeza=paux;
		else
		{
			ultimo = cabeza;
			while (ultimo.getEnlace()!=null)
				ultimo=ultimo.getEnlace();
			ultimo.setEnlace(paux);
			
		}
	}
	
	public String insertarAntesDe(Producto nuevo, Producto buscado)
	{
		NodoProducto paux;
		NodoProducto pbus;
		if(cabeza==null)
			return ("LISTA VACÍA");
		else
		{
			if (cabeza.getDato().equals(buscado))
				insertarAlPrincipio(nuevo);
			else
			{
			paux=new NodoProducto(nuevo);
			pbus=cabeza;
			while((pbus.getEnlace()!=null) &&
				   (!pbus.getEnlace().getDato().getNombre().equals(buscado)))
				   pbus=pbus.getEnlace();
			if(pbus.getEnlace()==null)
				return("NO EXISTE EL ELEMENTO: "+buscado);
			else
			{
				paux.setEnlace(pbus.getEnlace());
				pbus.setEnlace(paux);
			}
			}
			return ("");
		}
	}
	
	public int buscaElemento(String dato)
	{
		int pos=0;
		NodoProducto paux=cabeza;
		while ((paux!=null) && (!paux.getDato().getnumerodeproducto().equals(dato)))
		{
			paux=paux.getEnlace();
			pos++;
		}
		if(paux==null)
			return -1;
		else
			return pos;
	}
	
	public Producto extraerElemento(int pos)
	{
		int c=0;
		NodoProducto paux=cabeza;
		while ((paux!=null) && (c!=pos))
		{
			paux=paux.getEnlace();
			c++;
		}
		if(paux==null)
			return null;
		else
			return paux.getDato();
	}
	
	public String insertarDespuesDe(Producto nuevo, Producto buscado)
	{
		NodoProducto paux;
		NodoProducto pbus;
		if(cabeza==null)
			return ("LISTA VACÍA");
		else
		{
			paux=new NodoProducto(nuevo);
			pbus=cabeza;
			while((pbus!=null) && (!pbus.getDato().getNombre().equals(buscado)))
				   pbus=pbus.getEnlace();
			if(pbus==null)
				return("NO EXISTE EL ELEMENTO: "+buscado);
			else
			{
				paux.setEnlace(pbus.getEnlace());
				pbus.setEnlace(paux);
			}
			
			return ("");
		}
	}
	public String mostrarLista()
	{
		String lista="";
		NodoProducto paux=cabeza;
		while (paux!=null)
		{
			lista+=paux.getDato().getNombre()+"\n";
			paux=paux.getEnlace();
		}
		return lista;
	}
	
	public int longitud()
	{
		int c=0;
		NodoProducto paux=cabeza;
		if (cabeza==null)
			return 0;
		else
		{
			while(paux!=null)
			{
				c++;
				paux=paux.getEnlace();
			}
			return c;
		}
	}
	
	public String borrar(Producto buscado)
	{
		NodoProducto paux;
		NodoProducto psig;
		if (cabeza==null)
			return "EL ELEMENTO "+buscado+" NO EXISTE";
		else
			if (buscado==cabeza.getDato())
			{
				paux=cabeza;
				cabeza=cabeza.getEnlace();
				paux=null;
				System.gc();
				return "";
			}
			else
			{
				paux=cabeza;
				while ((paux.getEnlace()!=null)&&
						(!buscado.equals(paux.getEnlace())))
					paux=paux.getEnlace();
				if(paux.getEnlace()==null)
					return "EL ELEMENTO "+buscado+" NO EXISTE";
				else
				{
					psig=paux.getEnlace();
					paux.setEnlace(psig.getEnlace());
					psig=null;
					System.gc();
					return "";
				}
						
			
			}
	}

	public String reemplazar(Producto buscado, Producto nuevo)
	{
		NodoProducto paux;
		if (cabeza==null)
			return "EL ELEMENTO "+buscado+" NO EXISTE";
		else
		{
			paux=cabeza;
			while ((paux!=null) &&
					(!buscado.equals(paux.getDato())))
				paux = paux.getEnlace();
			if (paux==null)
				return "EL ELEMENTO "+buscado+" NO EXISTE";
			else
				paux.setDato(nuevo);
			return "";
		}
	}
	
}
