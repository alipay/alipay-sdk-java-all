package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新成功的sku信息
 *
 * @author auto create
 * @since 1.0, 2025-02-13 23:23:32
 */
public class SkuUpdateSuccessInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8714417181918571183L;

	/**
	 * 商家自定义当前sku的店内码/货号
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
