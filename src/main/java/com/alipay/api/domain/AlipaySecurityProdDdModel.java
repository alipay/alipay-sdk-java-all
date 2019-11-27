package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ada
 *
 * @author auto create
 * @since 1.0, 2016-02-17 13:59:52
 */
public class AlipaySecurityProdDdModel extends AlipayObject {

	private static final long serialVersionUID = 7814141266186559912L;

	/**
	 * dd
	 */
	@ApiField("dd")
	private String dd;

	public String getDd() {
		return this.dd;
	}
	public void setDd(String dd) {
		this.dd = dd;
	}

}
