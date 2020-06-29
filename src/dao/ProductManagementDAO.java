package dao;

import java.util.*;

import dbutil.DBUtil;
import pojo.Product;
import java.sql.*;

public class ProductManagementDAO {
	
	public static List<Product> getAllProducts(){
	List<Product> productList = new ArrayList<Product>();
	try {
		Connection con = DBUtil.getCon();
		Statement st = con.createStatement();
		ResultSet rs= st.executeQuery("select * from product");
		while(rs.next()) {
			Product product = new Product(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
			productList.add(product);
		}
		DBUtil.closeConnection(con);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return productList;
	}
	
	public static int addProduct(Product product) {
		int status=0;
		
		try {
			Connection con= DBUtil.getCon();
			PreparedStatement ps = con.prepareStatement("insert into product values(?,?,?,?)");
			ps.setInt(1, product.getProdId());
			ps.setString(2, product.getProdName());
			ps.setString(3, product.getProdCategory());
			ps.setInt(4, product.getProdPrice());
			status=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}
	
	public static Product getProductById(int productId) {
		Product product = null;
		try {
			Connection con = DBUtil.getCon();
			PreparedStatement ps = con.prepareStatement("Select * from product where prod_id = ?");
			ps.setInt(1, productId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				product = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return product;
	}
	
	
	public static int updateProduct(Product product) {
		int status=0;
		try {
			Connection con= DBUtil.getCon();
			PreparedStatement ps = con.prepareStatement("update product set name=?, category=?, price=?  where prod_id=?");
			ps.setString(1, product.getProdName());
			ps.setString(2, product.getProdCategory());
			ps.setInt(3, product.getProdPrice());
			ps.setInt(4, product.getProdId());
			status=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}
	
	public static int deleteProduct(Integer prodId) {
		int status=0;
		
		try {
			Connection con= DBUtil.getCon();
			PreparedStatement ps = con.prepareStatement("delete from product where prod_id=?");
			ps.setInt(1, prodId);
			status=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}
	
}
