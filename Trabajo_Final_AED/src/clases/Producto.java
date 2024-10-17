package clases;

public class Producto {
	
	//Código Autogenerado y Correlativo
	private static int contCodProd = 2001; //Contador Código Producto
	
	//Atributos Privados
	private int codProd; //Código Producto
	private String nom; //Nombre
	private double pre; //Precio
	private int StkActual; //Stock Actual
	private int StkMin; //Stock Mínimo
	private int StkMax; //Stock Máximo
	
	//Constructor
	public Producto(int codProd, String nom, double pre, int stkActual, int stkMin, int stkMax) {
		this.codProd = contCodProd;
		this.nom = nom;
		this.pre = pre;
		StkActual = stkActual;
		StkMin = stkMin;
		StkMax = stkMax;
		//Autogenerado y Correlativo a partir de 2001
		contCodProd ++;
	}

	//Métodos Get y Set
	public int getCodProd() {
		return codProd;
	}

	public void setCodProd(int codProd) {
		this.codProd = codProd;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPre() {
		return pre;
	}

	public void setPre(double pre) {
		this.pre = pre;
	}

	public int getStkActual() {
		return StkActual;
	}

	public void setStkActual(int stkActual) {
		StkActual = stkActual;
	}

	public int getStkMin() {
		return StkMin;
	}

	public void setStkMin(int stkMin) {
		StkMin = stkMin;
	}

	public int getStkMax() {
		return StkMax;
	}

	public void setStkMax(int stkMax) {
		StkMax = stkMax;
	}
}
