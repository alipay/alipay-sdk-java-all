package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ManjiangTestabc
 *
 * @author auto create
 * @since 1.0, 2022-05-05 12:07:24
 */
public class ManjiangTestabc extends AlipayObject {

	private static final long serialVersionUID = 6286954854488797992L;

	/**
	 * 1
	 */
	@ApiField("t")
	private String t;

	public String getT() {
		return this.t;
	}
	public void setT(String t) {
		this.t = t;
	}

}
