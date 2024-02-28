package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预发上测试
 *
 * @author auto create
 * @since 1.0, 2021-12-06 11:09:22
 */
public class AlipayOpenPublicXwbtestabcdBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2618524828713193513L;

	/**
	 * 1111112141414
	 */
	@ApiField("s")
	private String s;

	public String getS() {
		return this.s;
	}
	public void setS(String s) {
		this.s = s;
	}

}
