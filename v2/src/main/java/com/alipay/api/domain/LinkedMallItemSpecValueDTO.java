package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 规格值
 *
 * @author auto create
 * @since 1.0, 2024-06-07 13:59:54
 */
public class LinkedMallItemSpecValueDTO extends AlipayObject {

	private static final long serialVersionUID = 7391983472867686246L;

	/**
	 * 规格值
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
