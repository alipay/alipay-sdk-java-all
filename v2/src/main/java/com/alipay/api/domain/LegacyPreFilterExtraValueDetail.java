package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 前置筛选值配置
 *
 * @author auto create
 * @since 1.0, 2025-09-05 16:57:38
 */
public class LegacyPreFilterExtraValueDetail extends AlipayObject {

	private static final long serialVersionUID = 3743588845785129665L;

	/**
	 * 筛选值
	 */
	@ApiField("value")
	private String value;

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
