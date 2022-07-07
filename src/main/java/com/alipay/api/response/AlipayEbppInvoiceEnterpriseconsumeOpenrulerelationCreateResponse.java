package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.enterpriseconsume.openrulerelation.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-01 10:56:07
 */
public class AlipayEbppInvoiceEnterpriseconsumeOpenrulerelationCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8727624476963561642L;

	/** 
	 * 是否成功
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
