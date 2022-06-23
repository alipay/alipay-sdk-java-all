package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.enterpriseconsume.openrulerelation.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-21 10:01:44
 */
public class AlipayEbppInvoiceEnterpriseconsumeOpenrulerelationCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4459948786913376214L;

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
