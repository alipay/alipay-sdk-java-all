package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新失败的sku信息，包含失败描述
 *
 * @author auto create
 * @since 1.0, 2025-02-13 23:23:31
 */
public class SkuCodeUpdateFailInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5183765547181911751L;

	/**
	 * 提示信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 商家自定义当前sku的店内码/货号
	 */
	@ApiField("source_sku_code")
	private String sourceSkuCode;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getSourceSkuCode() {
		return this.sourceSkuCode;
	}
	public void setSourceSkuCode(String sourceSkuCode) {
		this.sourceSkuCode = sourceSkuCode;
	}

}
