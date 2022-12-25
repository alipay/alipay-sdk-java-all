package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.wf.dataauthtoken.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-20 16:56:40
 */
public class MybankCreditSupplychainWfDataauthtokenSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4863734641416339354L;

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
