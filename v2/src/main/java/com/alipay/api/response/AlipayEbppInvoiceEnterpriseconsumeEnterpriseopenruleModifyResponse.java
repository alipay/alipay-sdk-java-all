package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.enterpriseconsume.enterpriseopenrule.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-03 13:41:59
 */
public class AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6816983885118985685L;

	/** 
	 * success
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
