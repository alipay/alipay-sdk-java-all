package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.data.equity.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 23:11:52
 */
public class AlipayMarketingDataEquitySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6329947258835565826L;

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
