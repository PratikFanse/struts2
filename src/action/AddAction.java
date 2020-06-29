package action;

import dao.ProductManagementDAO;
import pojo.Product;

public class AddAction {
	Integer prodId;
	String prodName;
	String prodCategory;
	Integer prodPrice;
	
	public String execute() {
		String statusCode ="";
		
		Product product = new Product(prodId,  prodName,  prodCategory, prodPrice);
		int recordAdded=0;
		System.out.println("test"+prodId);
		if(prodId != null &&  prodName!=null)
		recordAdded = ProductManagementDAO.addProduct(product);
		if(recordAdded ==1 )
			statusCode = "success";
		else
			statusCode = "error";
		return statusCode;
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
