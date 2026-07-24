package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-16 10:17:55
 */
public class LucContactWayInfo extends AlipayObject {

	private static final long serialVersionUID = 1139869639446452378L;

	/**
	 * 联系方式类型: MOBILE-手机号码 / PHONE-固定电话
	 */
	@ApiField("type")
	private String type;

	/**
	 * 联系方式值（电话号码）
	 */
	@ApiField("value")
	private String value;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
