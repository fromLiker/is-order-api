/**
 * 
 */
package com.dsw.security.order;

//import lombok.Data;

/**
 * @author Liker
 *
 */
//@Data
public class OrderInfo {
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	private Long id;
	
	private Long productId;
	
}
