package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SalesForceContractStatusSyncResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.sfcontractstatus.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-09 14:17:53
 */
public class AnttechOceanbaseObglobalSfcontractstatusSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6585199562195485626L;

	/** 
	 * 结果对象
	 */
	@ApiField("result")
	private SalesForceContractStatusSyncResult result;

	public void setResult(SalesForceContractStatusSyncResult result) {
		this.result = result;
	}
	public SalesForceContractStatusSyncResult getResult( ) {
		return this.result;
	}

}
