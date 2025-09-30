package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过skuCode上下架商品操作成功信息
 *
 * @author auto create
 * @since 1.0, 2025-05-30 15:08:24
 */
public class SkuCodeItemStatusSuccessDTO extends AlipayObject {

	private static final long serialVersionUID = 1688239664988381958L;

	/**
	 * 商家商品sku编码
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
