package be.businesstraining.javabeans;

// Exemple d'un JavaBeans (Web, Interfaces graphiques)
//  - Avoir des Properties (attributes + setters/getters)
//  - Avoir un constructeur par défaut
public class Product {
	
	private String code;
	private double unitPrice;
	private boolean available;

	public Product() {
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	
}
