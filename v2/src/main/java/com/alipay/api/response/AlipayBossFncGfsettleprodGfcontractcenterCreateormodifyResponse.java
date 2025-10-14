package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ContractSyncResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfsettleprod.gfcontractcenter.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-22 13:42:39
 */
public class AlipayBossFncGfsettleprodGfcontractcenterCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1821284347874581339L;

	/** 
	 * 返回合同信息同步结果
	 */
	@ApiField("contract_sync_response")
	private ContractSyncResponse contractSyncResponse;

	public void setContractSyncResponse(ContractSyncResponse contractSyncResponse) {
		this.contractSyncResponse = contractSyncResponse;
	}
	public ContractSyncResponse getContractSyncResponse( ) {
		return this.contractSyncResponse;
	}

}
