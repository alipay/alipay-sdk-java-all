package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 嗷嗷
 *
 * @author auto create
 * @since 1.0, 2024-02-01 11:28:18
 */
public class AlipaySecurityAzeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3394447834511234876L;

	/**
	 * 1
	 */
	@ApiField("in_a")
	private String inA;

	public String getInA() {
		return this.inA;
	}
	public void setInA(String inA) {
		this.inA = inA;
	}

}
