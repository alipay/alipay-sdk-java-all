package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新失败的sku信息，包含失败描述
 *
 * @author auto create
 * @since 1.0, 2025-02-13 23:23:33
 */
public class SkuUpdateFailInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1123332683143398555L;

	/**
	 * 提示信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 商家自定义当前sku的店内码/货号
	 */
	@ApiField("sku_code")
	private String skuCode;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getSkuCode() {
		return this.skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

}
