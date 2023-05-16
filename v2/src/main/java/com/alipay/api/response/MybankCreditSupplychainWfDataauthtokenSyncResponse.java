package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.wf.dataauthtoken.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 05:11:57
 */
public class MybankCreditSupplychainWfDataauthtokenSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3349378447371146331L;

	/** 
	 * 请求受理成功与否
	 */
	@ApiField("status")
	private Boolean status;

	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Boolean getStatus( ) {
		return this.status;
	}

}
