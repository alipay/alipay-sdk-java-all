package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业业务订单同步扩展字段
 *
 * @author auto create
 * @since 1.0, 2025-06-05 14:30:55
 */
public class EcOrderExtInfo extends AlipayObject {

	private static final long serialVersionUID = 3531148558949959155L;

	/**
	 * 键值
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
