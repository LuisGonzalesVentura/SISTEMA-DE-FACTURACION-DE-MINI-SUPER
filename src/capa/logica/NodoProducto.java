package capa.logica;


public class NodoProducto {
	private Producto dato;
	private NodoProducto enlace;
	public NodoProducto (Producto dato)
	{
		this.dato = dato;
		enlace = null;
	}
	public Producto getDato() {
		return dato;
	}
	public void setDato(Producto dato) {
		this.dato = dato;
	}
	public NodoProducto getEnlace() {
		return enlace;
	}
	public void setEnlace(NodoProducto enlace) {
		this.enlace = enlace;
	}
	
	
}
