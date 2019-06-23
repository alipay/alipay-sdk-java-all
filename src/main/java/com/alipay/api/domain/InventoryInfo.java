package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 押品资产信息描述
 *
 * @author auto create
 * @since 1.0, 2018-02-08 14:44:32
 */
public class InventoryInfo extends AlipayObject {

	private static final long serialVersionUID = 8729586561168954616L;

	/**
	 * 资产数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 资产类型id编号
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
