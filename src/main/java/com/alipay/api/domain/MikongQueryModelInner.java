package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * MikongQueryModelInner
 *
 * @author auto create
 * @since 1.0, 2017-04-11 16:14:03
 */
public class MikongQueryModelInner extends AlipayObject {

	private static final long serialVersionUID = 7515611828722278811L;

	/**
	 * bb
	 */
	@ApiField("aa")
	private String aa;

	public String getAa() {
		return this.aa;
	}
	public void setAa(String aa) {
		this.aa = aa;
	}

}
