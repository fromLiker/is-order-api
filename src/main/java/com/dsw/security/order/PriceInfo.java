/**
 * 
 */
package com.dsw.security.order;

import java.math.BigDecimal;

//import lombok.Data;

/**
 * @author Liker
 *
 */
//@Data
public class PriceInfo {
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	private Long id;
	
	private BigDecimal price;

}