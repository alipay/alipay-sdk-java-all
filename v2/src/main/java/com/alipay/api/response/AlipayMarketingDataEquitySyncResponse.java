package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.data.equity.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-19 16:21:42
 */
public class AlipayMarketingDataEquitySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4281661393668282298L;

	/** 
	 * true/false
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
