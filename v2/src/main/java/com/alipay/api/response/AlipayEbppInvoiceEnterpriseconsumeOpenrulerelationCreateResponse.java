package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.enterpriseconsume.openrulerelation.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 21:36:48
 */
public class AlipayEbppInvoiceEnterpriseconsumeOpenrulerelationCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5664571947225431838L;

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
