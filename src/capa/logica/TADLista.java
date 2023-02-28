package capa.logica;

public class TADLista {
	private Nodo cabeza;
	public TADLista()
	{
		cabeza=null;
	}
	public Nodo getCabeza() {
		return cabeza;
	}
	public void setCabeza(Nodo cabeza) {
		this.cabeza = cabeza;
	}
	public void insertarAlPrincipio(String dato)
	{
		Nodo paux=new Nodo(dato);
		if (cabeza==null)
			cabeza=paux;
		else
		{
			paux.setEnlace(cabeza);
			cabeza=paux;
			
		}
	}
	
	public void insertarAlFinal(String dato)
	{
		Nodo paux=new Nodo(dato);
		Nodo ultimo;
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
	
	public String insertarAntesDe(String nuevo, String buscado)
	{
		Nodo paux;
		Nodo pbus;
		if(cabeza==null)
			return ("LISTA VACÍA");
		else
		{
			if (cabeza.getDato().equals(buscado))
				insertarAlPrincipio(nuevo);
			else
			{
			paux=new Nodo(nuevo);
			pbus=cabeza;
			while((pbus.getEnlace()!=null) &&
				   (!pbus.getEnlace().getDato().equals(buscado)))
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
	
	public boolean buscaElemento(String dato)
	{
		Nodo paux=cabeza;
		while ((paux!=null) && (paux.getDato()!=dato))
			paux=paux.getEnlace();
		return (!(paux==null));
	}
	public String insertarDespuesDe(String nuevo, String buscado)
	{
		Nodo paux;
		Nodo pbus;
		if(cabeza==null)
			return ("LISTA VACÍA");
		else
		{
			paux=new Nodo(nuevo);
			pbus=cabeza;
			while((pbus!=null) && (!pbus.getDato().equals(buscado)))
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
		Nodo paux=cabeza;
		while (paux!=null)
		{
			lista+=paux.getDato()+"\n";
			paux=paux.getEnlace();
		}
		return lista;
	}
	
	public int longitud()
	{
		int c=0;
		Nodo paux=cabeza;
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
	
	public String borrar(String buscado)
	{
		Nodo paux;
		Nodo psig;
		if (cabeza==null)
			return "EL ELEMENTO "+buscado+" NO EXISTE";
		else
			if (buscado.equals(cabeza.getDato()))
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

	public String reemplazar(String buscado, String nuevo)
	{
		Nodo paux;
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
