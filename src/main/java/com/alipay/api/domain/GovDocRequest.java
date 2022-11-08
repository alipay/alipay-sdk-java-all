package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * GovDocRequest
 *
 * @author auto create
 * @since 1.0, 2020-07-07 12:08:33
 */
public class GovDocRequest extends AlipayObject {

	private static final long serialVersionUID = 1856664135935439962L;

	/**
	 * 请求
	 */
	@ApiField("gov_doc_request")
	private String govDocRequest;

	/**
	 * 12121
	 */
	@ApiField("test")
	private String test;

	public String getGovDocRequest() {
		return this.govDocRequest;
	}
	public void setGovDocRequest(String govDocRequest) {
		this.govDocRequest = govDocRequest;
	}

	public String getTest() {
		return this.test;
	}
	public void setTest(String test) {
		this.test = test;
	}

}
