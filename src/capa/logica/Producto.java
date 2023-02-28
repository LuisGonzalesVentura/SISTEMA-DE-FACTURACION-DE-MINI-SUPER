package capa.logica;

public class Producto {
	
		private String nombre;
		private double precio;
		private String cantidad;
		private String carnet;
		private String nombrecli;
		private String numero;
		
		public Producto()
			{
				nombre="";
				precio=0;
				
			}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}
		

		public String getCantidad() {
			return cantidad;
		}

		public void setCantidad(String cantidad) {
			this.cantidad = cantidad;
		}


public String getnombrecli() {
	return nombrecli;
}

public void setnombrecli(String nombre) {
	this.nombrecli = nombrecli;
}
public String  getcarnet() {
	return carnet;
}

public void setcarnet(String precio) {
	this.carnet = carnet;
}



public String getnumerodeproducto()
		{
	return numero;
}

public void setnumerodeproducto(String numero)
{
	this.numero = numero;
}


}
