package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.card.history.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserAccountCardHistoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6324112981857886375L;

	/** 
	 * 正确
	 */
	@ApiField("response")
	private String response;

	public void setResponse(String response) {
		this.response = response;
	}
	public String getResponse( ) {
		return this.response;
	}

}
