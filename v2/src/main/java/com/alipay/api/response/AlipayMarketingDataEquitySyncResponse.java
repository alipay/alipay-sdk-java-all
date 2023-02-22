package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.data.equity.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 09:01:41
 */
public class AlipayMarketingDataEquitySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5747762319345336328L;

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
