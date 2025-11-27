package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关单接口-扩展字段
 *
 * @author auto create
 * @since 1.0, 2025-03-26 21:29:54
 */
public class CloseExtendParams extends AlipayObject {

	private static final long serialVersionUID = 6897252798827496848L;

	/**
	 * 标识是否通过其他方式履约
	 */
	@ApiField("is_fulfilled")
	private String isFulfilled;

	public String getIsFulfilled() {
		return this.isFulfilled;
	}
	public void setIsFulfilled(String isFulfilled) {
		this.isFulfilled = isFulfilled;
	}

}
