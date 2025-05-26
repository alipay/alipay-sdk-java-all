package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品信息，包括商品skuId、商品数量、商品单价
 *
 * @author auto create
 * @since 1.0, 2019-09-30 18:02:03
 */
public class GoodsInformation extends AlipayObject {

	private static final long serialVersionUID = 8753842282235186837L;

	/**
	 * 购买的商品个数
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 基于alipay商品库的skuId
	 */
	@ApiField("sku_id")
	private String skuId;

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
