package pojo;

public class Product {
	
	int prodId;
	String prodName;
	String prodCategory;
	Integer prodPrice;
	
	public Product() {}

	public Product(int prodId, String prodName, String prodCategory, Integer productPrice) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodCategory = prodCategory;
		this.prodPrice = productPrice;
	}

	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdCategory() {
		return prodCategory;
	}
	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}

	public Integer getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(Integer productPrice) {
		this.prodPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodCategory=" + prodCategory
				+ ", productPrice=" + prodPrice + "]";
	}
	
}
