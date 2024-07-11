package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品结构
 *
 * @author auto create
 * @since 1.0, 2024-06-04 20:13:48
 */
public class ProductVO extends AlipayObject {

	private static final long serialVersionUID = 7565583646365395918L;

	/**
	 * 商品id
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 采购方id
	 */
	@ApiField("purchaser_id")
	private String purchaserId;

	/**
	 * 数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getPurchaserId() {
		return this.purchaserId;
	}
	public void setPurchaserId(String purchaserId) {
		this.purchaserId = purchaserId;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
