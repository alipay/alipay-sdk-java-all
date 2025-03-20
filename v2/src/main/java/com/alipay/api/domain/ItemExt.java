package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品扩展
 *
 * @author auto create
 * @since 1.0, 2020-07-23 15:13:58
 */
public class ItemExt extends AlipayObject {

	private static final long serialVersionUID = 1394495796516271721L;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_key")
	private String extKey;

	/**
	 * 扩展信息值
	 */
	@ApiField("ext_value")
	private String extValue;

	public String getExtKey() {
		return this.extKey;
	}
	public void setExtKey(String extKey) {
		this.extKey = extKey;
	}

	public String getExtValue() {
		return this.extValue;
	}
	public void setExtValue(String extValue) {
		this.extValue = extValue;
	}

}
