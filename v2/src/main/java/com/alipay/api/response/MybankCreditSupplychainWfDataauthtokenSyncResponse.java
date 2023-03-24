package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.wf.dataauthtoken.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 00:31:41
 */
public class MybankCreditSupplychainWfDataauthtokenSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3336578295934295436L;

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
