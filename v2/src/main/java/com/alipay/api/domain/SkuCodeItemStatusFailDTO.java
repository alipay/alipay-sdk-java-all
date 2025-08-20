package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过skuCode上下架商品操作失败信息
 *
 * @author auto create
 * @since 1.0, 2025-05-30 15:08:24
 */
public class SkuCodeItemStatusFailDTO extends AlipayObject {

	private static final long serialVersionUID = 7132448415612486922L;

	/**
	 * 描述信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 商家商品sku编码
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
