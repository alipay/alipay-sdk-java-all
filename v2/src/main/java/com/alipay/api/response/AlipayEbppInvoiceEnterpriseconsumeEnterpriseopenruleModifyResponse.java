package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.enterpriseconsume.enterpriseopenrule.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-15 17:03:19
 */
public class AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4629865788566378759L;

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
