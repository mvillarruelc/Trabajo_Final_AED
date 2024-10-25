package arraylist;

import java.util.ArrayList;
import clases.Cliente;

public class Array_Cliente {
	//Array Privado Cliente
	private ArrayList <Cliente> aCliente;
	//Constructor
	public Array_Cliente() {
		aCliente = new ArrayList <Cliente>();
		adicionar(new Cliente("Hernan", "Cuentas", "Av. 13 Enero 2274", "987660529", "75389744"));
		adicionar(new Cliente("Estrella", "Hilarion", "Av. Jorge Basadre Este 823", "923634526", "73826172"));
		adicionar(new Cliente("Junior", "Rodriguez", "Jr. agua marina 203", "982738273", "29382712"));
	}
	//Métodos Básicos
	public void adicionar(Cliente nuevoCliente) {
		aCliente.add(nuevoCliente);
	}
	public Cliente obtener(int i) {
		return aCliente.get(i);
	}
	public int tamano() {
		return aCliente.size();
	}
	public void eliminar(Cliente cliente) {
		aCliente.remove(cliente);
	}
	//Método Buscar con For Each
	public Cliente buscar(int codigo) {
	    for (Cliente cliente : aCliente) {
	        if (cliente.getCodClt() == codigo) {
	            return cliente;
	        }
	    }
	    return null;
	}
}
