package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ssss
 *
 * @author auto create
 * @since 1.0, 2018-02-01 21:41:53
 */
public class AlipaySecurityProdSssBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4335826152517539491L;

	/**
	 * 111
	 */
	@ApiField("sss")
	private String sss;

	public String getSss() {
		return this.sss;
	}
	public void setSss(String sss) {
		this.sss = sss;
	}

}
