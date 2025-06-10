package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新成功的sku信息
 *
 * @author auto create
 * @since 1.0, 2025-02-13 23:23:31
 */
public class SkuCodeUpdateSuccessInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6435581483542659596L;

	/**
	 * 商家自定义当前sku的店内码/货号
	 */
	@ApiField("source_sku_code")
	private String sourceSkuCode;

	public String getSourceSkuCode() {
		return this.sourceSkuCode;
	}
	public void setSourceSkuCode(String sourceSkuCode) {
		this.sourceSkuCode = sourceSkuCode;
	}

}
