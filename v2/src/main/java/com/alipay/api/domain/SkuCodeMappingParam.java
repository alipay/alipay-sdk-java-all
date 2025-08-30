package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店商品旧skuCode和新skuCode的映射关系
 *
 * @author auto create
 * @since 1.0, 2025-02-13 23:23:31
 */
public class SkuCodeMappingParam extends AlipayObject {

	private static final long serialVersionUID = 1673269369997199698L;

	/**
	 * 商家自定义当前的店内码/货号
	 */
	@ApiField("source_sku_code")
	private String sourceSkuCode;

	/**
	 * 商家自定义需要修改成的新店内码/货号
	 */
	@ApiField("target_sku_code")
	private String targetSkuCode;

	public String getSourceSkuCode() {
		return this.sourceSkuCode;
	}
	public void setSourceSkuCode(String sourceSkuCode) {
		this.sourceSkuCode = sourceSkuCode;
	}

	public String getTargetSkuCode() {
		return this.targetSkuCode;
	}
	public void setTargetSkuCode(String targetSkuCode) {
		this.targetSkuCode = targetSkuCode;
	}

}
