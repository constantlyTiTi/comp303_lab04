package application.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idproduct")
	private Long _productId;
	
	@Column(name = "name")
	private String _productName;
	
	@Column(name = "price")
	private double _price;
	/* private int _quantity; */

	public Product() {
	}

//	public Product(@JsonProperty("product_name") String productName, @JsonProperty("price") double price) {
//
//
//		this._price = price;
//		this._productName = productName;
//	}
//
	@JsonCreator
	public Product(@JsonProperty("product_name") String productName, @JsonProperty("price") double price,
			@JsonProperty("product_id") Long productId) {

			_productId = productId;

		this._price = price;
		this._productName = productName;
	}

	public Long get_productId() {
		return _productId;
	}

	/*
	 * public void set_productId(long _id) { this._productId = _id; }
	 */

	public String getProductName() {
		return _productName;
	}

	public void setProductName(String productName) {
		this._productName = productName;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double _price) {
		this._price = _price;
	}

//	public JSONObject mapJson() {
//		JSONObject mapObj = new JSONObject();
//		mapObj.put("product_name", this.getProductName());
//		mapObj.put("product_id", this.get_productId());
//		mapObj.put("price", this.get_price());
//		return mapObj;
//	}
}
