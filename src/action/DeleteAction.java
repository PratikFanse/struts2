package action;

import dao.ProductManagementDAO;

public class DeleteAction {
	Integer prodId;
	
	public String execute() {
		int status = ProductManagementDAO.deleteProduct(prodId);
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
	
	
	
}
