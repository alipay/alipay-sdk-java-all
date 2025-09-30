package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同同步接口
 *
 * @author auto create
 * @since 1.0, 2025-09-22 13:37:56
 */
public class AlipayBossFncGfsettleprodGfcontractcenterCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 6682517283912973491L;

	/**
	 * 用于承载合同同步信息
	 */
	@ApiField("contract_change_sync_request")
	private ContractChangeSyncRequest contractChangeSyncRequest;

	public ContractChangeSyncRequest getContractChangeSyncRequest() {
		return this.contractChangeSyncRequest;
	}
	public void setContractChangeSyncRequest(ContractChangeSyncRequest contractChangeSyncRequest) {
		this.contractChangeSyncRequest = contractChangeSyncRequest;
	}

}
