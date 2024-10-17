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
	
	//Constructor
	public Venta(int codClt, int codProd, int cant, double pre) {
		//Autogenerado y Correlativo a partir de 3001
		this.codVenta = contCodVenta;
		this.codClt = codClt;
		this.codProd = codProd;
		this.cant = cant;
		this.pre = pre;
		this.fecha = generarFechaActual();
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
}
