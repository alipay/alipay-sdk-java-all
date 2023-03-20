package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.creditbank.user.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 01:31:21
 */
public class AlipayCommerceEducateCreditbankUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1644425718413653528L;

	/** 
	 * 学分银行id
	 */
	@ApiField("cb_id")
	private String cbId;

	public void setCbId(String cbId) {
		this.cbId = cbId;
	}
	public String getCbId( ) {
		return this.cbId;
	}

}
