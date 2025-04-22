package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能体行业业务扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-02-27 10:43:10
 */
public class AIChatBizExtInfo extends AlipayObject {

	private static final long serialVersionUID = 5729622181577881817L;

	/**
	 * 键
	 */
	@ApiField("ext_key")
	private String extKey;

	/**
	 * 值
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
