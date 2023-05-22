package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.creditbank.user.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 10:10:03
 */
public class AlipayCommerceEducateCreditbankUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3249231668269192554L;

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
