package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品尺寸，product_height：高度，product_width：宽度，product_deep：深度
 *
 * @author auto create
 * @since 1.0, 2023-09-20 13:44:57
 */
public class ProductSize extends AlipayObject {

	private static final long serialVersionUID = 7138786262492178678L;

	/**
	 * 商品深度
	 */
	@ApiField("product_deep")
	private String productDeep;

	/**
	 * 商品的高度
	 */
	@ApiField("product_height")
	private String productHeight;

	/**
	 * 商品宽度
	 */
	@ApiField("product_width")
	private String productWidth;

	public String getProductDeep() {
		return this.productDeep;
	}
	public void setProductDeep(String productDeep) {
		this.productDeep = productDeep;
	}

	public String getProductHeight() {
		return this.productHeight;
	}
	public void setProductHeight(String productHeight) {
		this.productHeight = productHeight;
	}

	public String getProductWidth() {
		return this.productWidth;
	}
	public void setProductWidth(String productWidth) {
		this.productWidth = productWidth;
	}

}
