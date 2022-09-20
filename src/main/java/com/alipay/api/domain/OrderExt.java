package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单扩展数据
 *
 * @author auto create
 * @since 1.0, 2020-03-05 11:54:16
 */
public class OrderExt extends AlipayObject {

	private static final long serialVersionUID = 7796493755523617947L;

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
