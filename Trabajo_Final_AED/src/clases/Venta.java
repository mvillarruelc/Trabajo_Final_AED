package clases;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Venta {
	
	//Código Autogenerado y Correlativo
	private static int contCodVenta = 3001; //Contador Código Venta
	
	//Atributos Privados
	private int codVenta; //Código Venta
	private int codClt; //Código Cliente
	private int codProd; //Código Producto
	private int cant; //Cantidad
	private double pre; //Precio
	private String fecha; //Fecha en formato mm/dd/aaaa
	
	//Atributos Privados para Reportes
	private String nomClt; //Nombre Cliente
	private String apeClt; //Apellido Cliente
	private String nomProd; //Nombre Producto
	private double subTot; //Importe Sub Total
	private double igv; //Importe de IGV
	private double tot; //Importe Total a Pagar
	
	//Constructor
	public Venta(int codClt, int codProd, int cant, double pre, String nomClt, String apeClt, String nomProd, double subTot, double igv, double tot) {
		//Autogenerado y Correlativo a partir de 3001
		this.codVenta = contCodVenta;
		this.codClt = codClt;
		this.codProd = codProd;
		this.cant = cant;
		this.pre = pre;
		this.fecha = generarFechaActual();
		
		this.nomClt = nomClt;
		this.apeClt = apeClt;
		this.nomProd = nomProd;
		this.subTot = subTot;
		this.igv = igv;
		this.tot = tot;
		//Aumento Contador Código Venta
		contCodVenta ++;
	}
	
	//Método de Fecha Formato mm/dd/aaaa
	private String generarFechaActual() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");  // Formato de fecha
        return sdf.format(new Date());  // Fecha actual formateada
    }
	
	//Métodos Get y Set
	public int getCodVenta() {
		return codVenta;
	}
	public void setCodVenta(int codVenta) {
		this.codVenta = codVenta;
	}
	public int getCodClt() {
		return codClt;
	}
	public void setCodClt(int codClt) {
		this.codClt = codClt;
	}
	public int getCodProd() {
		return codProd;
	}
	public void setCodProd(int codProd) {
		this.codProd = codProd;
	}
	public int getCant() {
		return cant;
	}
	public void setCant(int cant) {
		this.cant = cant;
	}
	public double getPre() {
		return pre;
	}
	public void setPre(double pre) {
		this.pre = pre;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	//Métodos Get y Set de Reporte
	public String getNomClt() {
		return nomClt;
	}

	public void setNomClt(String nomClt) {
		this.nomClt = nomClt;
	}

	public String getApeClt() {
		return apeClt;
	}

	public void setApeClt(String apeClt) {
		this.apeClt = apeClt;
	}

	public String getNomProd() {
		return nomProd;
	}

	public void setNomProd(String nomProd) {
		this.nomProd = nomProd;
	}

	public double getSubTot() {
		return subTot;
	}

	public void setSubTot(double subTot) {
		this.subTot = subTot;
	}

	public double getIgv() {
		return igv;
	}

	public void setIgv(double igv) {
		this.igv = igv;
	}

	public double getTot() {
		return tot;
	}

	public void setTot(double tot) {
		this.tot = tot;
	}
}
