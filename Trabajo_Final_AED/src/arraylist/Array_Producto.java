package arraylist;

import java.util.ArrayList;
import clases.Producto;

public class Array_Producto {
	//Array Privado Cliente
	private ArrayList <Producto> aProducto;
	//Constructor
	public Array_Producto() {
		aProducto = new ArrayList <Producto>();
		adicionar(new Producto("Maleta", 250.0, 15, 10, 100));
		adicionar(new Producto("Mochila", 100.0, 40, 20, 100));
		adicionar(new Producto("Bolso", 65.0, 75, 30, 100));
	}
	//Métodos Básicos
	public void adicionar(Producto nuevoProducto) {
		aProducto.add(nuevoProducto);
	}
	public Producto obtener(int i) {
		return aProducto.get(i);
	}
	public int tamano() {
		return aProducto.size();
	}
	public void eliminar(Producto producto) {
		aProducto.remove(producto);
	}
	//Método Buscar con For Each
	public Producto buscar(int codigo) {
	    for (Producto producto : aProducto) {
	        if (producto.getCodProd() == codigo) {
	            return producto;
	        }
	    }
		   return null;
	}
}
