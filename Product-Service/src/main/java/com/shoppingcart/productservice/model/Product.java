package com.shoppingcart.productservice.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Product")
public class Product {
	
	@Id
	private int productId;
	private String productType;
	private String productName;
	private String category;
	private double price;
	private String description;
	private String image;
	
	public Product() {
	}

	public Product(int productId, String productType, String productName, String category, double price,
			String description, String image) {
		super();
		this.productId = productId;
		this.productType = productType;
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.description = description;
		this.image = image;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productType=" + productType + ", productName=" + productName
				+ ", category=" + category + ", price=" + price + ", description=" + description + ", image=" + image
				+ "]";
	}

	
	
	

}
