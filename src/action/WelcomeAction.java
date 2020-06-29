package action;

import java.util.*;

import dao.ProductManagementDAO;
import pojo.Product;

public class WelcomeAction {
	
	List<Product> products;
	
	public void initializePeoducts() {
		products = ProductManagementDAO.getAllProducts();
	}
	
	public String execute() {
		initializePeoducts();
		return "success";
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "WelcomeAction [products=" + products + "]";
	}
	
}
