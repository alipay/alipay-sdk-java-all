package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.enterpriseconsume.openrulerelation.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 08:56:53
 */
public class AlipayEbppInvoiceEnterpriseconsumeOpenrulerelationCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7727475474357352332L;

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
