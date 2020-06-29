package action;

import dao.ProductManagementDAO;
import pojo.Product;

public class UpdateAction {
	Integer prodId;
	String prodName;
	String prodCategory;
	Integer prodPrice;
	
	public String execute() {
		Product product = new Product(prodId,prodName,prodCategory,prodPrice);
		int status = ProductManagementDAO.updateProduct(product);
		if(status==1)
			return "success";
		else 
			return "error";
	}
	
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
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
	public void setProdPrice(Integer prodPrice) {
		this.prodPrice = prodPrice;
	}
	
	
	
}
