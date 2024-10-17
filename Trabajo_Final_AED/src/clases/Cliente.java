package clases;

public class Cliente {
	
	//Código Autogenerado y Correlativo
	private static int contCodClt = 1001; //Contador Código Cliente
	
	//Atributos Privados
	private int codClt; //Código Cliente
	private String nom; //Nombre
	private String ape; //Apellido
	private String direc; //Dirección
	private String tlf; //Teléfono
	private String dni; //DNI
	
	//Constructor
	public Cliente(int codClt, String nom, String ape, String direc, String tlf, String dni) {
		this.codClt = contCodClt;
		this.nom = nom;
		this.ape = ape;
		this.direc = direc;
		this.tlf = tlf;
		this.dni = dni;
		//Autogenerado y Correlativo a partir de 1001
		contCodClt ++;
	}
	
	//Métodos Get y Set
	public int getCodClt() {
		return codClt;
	}
	public void setCodClt(int codClt) {
		this.codClt = codClt;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getApe() {
		return ape;
	}
	public void setApe(String ape) {
		this.ape = ape;
	}
	public String getDirec() {
		return direc;
	}
	public void setDirec(String direc) {
		this.direc = direc;
	}
	public String getTlf() {
		return tlf;
	}
	public void setTlf(String tlf) {
		this.tlf = tlf;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
}
