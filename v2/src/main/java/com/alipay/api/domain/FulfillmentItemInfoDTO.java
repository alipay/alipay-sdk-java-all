package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品信息
 *
 * @author auto create
 * @since 1.0, 2026-07-09 10:21:02
 */
public class FulfillmentItemInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4199674993526745735L;

	/**
	 * 外部商户的商品编码
	 */
	@ApiField("sku_code")
	private String skuCode;

	public String getSkuCode() {
		return this.skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

}
