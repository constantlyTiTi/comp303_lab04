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
/*import org.json.JSONObject;*/

@Entity
@Table(name="review")
public class ProductReview {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idreview")
	private Long _productReviewId;
	
	@Column(name = "idproduct")
	private Long _productId;
	
	@Column(name = "user_name")
	private String _userName;
	
	@Column(name = "review")
	private String _review;
	
	@Column(name = "rate")
	private double _rate;
	
	@Column(name = "quantity")
	private int _quantity;
	
	public ProductReview() {}
	

//	public ProductReview(@JsonProperty("id") long productId, 
//			@JsonProperty("user_name") String userName,
//			@JsonProperty("review") String review,
//			@JsonProperty("rate") double rate,
//			@JsonProperty("quantity") int quantity) {
//		
//		_productId = productId;
//		_userName = userName;
//		_review = review;
//		_rate = rate;
//		_quantity = quantity;
//		
//	}
//	
	@JsonCreator
	public ProductReview(@JsonProperty("reivew_id") Long reviewId,
			@JsonProperty("id") Long productId, 
			@JsonProperty("user_name") String userName,
			@JsonProperty("review") String review,
			@JsonProperty("rate") double rate,
			@JsonProperty("quantity") int quantity) {
		_productReviewId = reviewId;
		
		_productId = productId;
		_userName = userName;
		_review = review;
		_rate = rate;
		_quantity = quantity;
		
	}
	
	public int get_quantity() {
		return _quantity;
	}
	public void set_quantity(int _quantity) {
		this._quantity = _quantity;
	}
	public Long get_productReviewId() {
		return _productReviewId;
	}

	/*
	 * public void set_productReviewId(double _productReviewId) {
	 * this._productReviewId = _productReviewId; }
	 */
	public long get_productId() {
		return _productId;
	}
	public void set_productId(long _productId) {
		this._productId = _productId;
	}
	public String get_userName() {
		return _userName;
	}
	public void set_userName(String _userName) {
		this._userName = _userName;
	}
	public String get_review() {
		return _review;
	}
	public void set_review(String _review) {
		this._review = _review;
	}
	public double get_rate() {
		return _rate;
	}
	public void set_rate(double _rate) {
		this._rate = _rate;
	}
	
	public void autoMapper(ProductReview review) {
		this._rate = review._rate;
		this._review = review._review;
	}
	
//	 public JSONObject mapJson() {
//		 JSONObject mapObj = new JSONObject();
//		 mapObj.put("reivew_id", this.get_productReviewId());
//		 mapObj.put("id", this.get_productId());
//		 mapObj.put("user_name", this.get_userName());
//		 mapObj.put("review", this.get_review());
//		 mapObj.put("rate", this.get_rate());
//		 mapObj.put("quantity", this.get_quantity());
//		 return mapObj;
//	 }
}
