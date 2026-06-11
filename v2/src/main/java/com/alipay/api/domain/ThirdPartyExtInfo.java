package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-04 11:27:53
 */
public class ThirdPartyExtInfo extends AlipayObject {

	private static final long serialVersionUID = 7289476256855217187L;

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
