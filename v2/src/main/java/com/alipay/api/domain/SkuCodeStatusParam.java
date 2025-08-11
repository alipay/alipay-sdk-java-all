package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 要操作上下架商品的skuCode和操作类型信息
 *
 * @author auto create
 * @since 1.0, 2025-05-30 15:08:24
 */
public class SkuCodeStatusParam extends AlipayObject {

	private static final long serialVersionUID = 8786651625938683634L;

	/**
	 * 商家商品sku编码
	 */
	@ApiField("sku_code")
	private String skuCode;

	/**
	 * 商品状态, 0上架, -1下架
	 */
	@ApiField("status")
	private String status;

	public String getSkuCode() {
		return this.skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
