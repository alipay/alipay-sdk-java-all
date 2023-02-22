package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.enterpriseconsume.openrulerelation.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 01:07:30
 */
public class AlipayEbppInvoiceEnterpriseconsumeOpenrulerelationCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2132325446177371968L;

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
