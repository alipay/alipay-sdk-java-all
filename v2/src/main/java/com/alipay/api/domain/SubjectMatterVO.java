package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标的
 *
 * @author auto create
 * @since 1.0, 2025-10-16 14:04:42
 */
public class SubjectMatterVO extends AlipayObject {

	private static final long serialVersionUID = 8714736578522112266L;

	/**
	 * 标的key
可选值
1.province-省份
2.city-城市
3.country-地区
4.address-详细地址
	 */
	@ApiField("key")
	private String key;

	/**
	 * 标的值
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
