package clases;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Registrar {
	
	//Atributos Privados
	private String usuario;
	private String contra;
	private int cantUsuarios;
	private String fCreacion;
	
	//Constructor
	public Registrar(String usuario, String contra, int cantUsuarios, String fCreacion) {
		this.usuario = usuario;
		this.contra = contra;
		this.cantUsuarios = cantUsuarios;
		this.fCreacion = fCreacion;
		//Aumento de Cantidad de Usuarios
		cantUsuarios ++;
	}
	
	//Métodos Get y Set
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContra() {
		return contra;
	}
	public void setContra(String contra) {
		this.contra = contra;
	}
	public int getCantUsuarios() {
		return cantUsuarios;
	}
	public void setCantUsuarios(int cantUsuarios) {
		this.cantUsuarios = cantUsuarios;
	}
	public String getfCreacion() {
		return fCreacion;
	}
	public String obtenerFechaActual() {
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		return sdf.format(new Date());
	}
	@Override
	public String toString() {
		return usuario + ";" + contra + ";" + fCreacion;
	}
}
