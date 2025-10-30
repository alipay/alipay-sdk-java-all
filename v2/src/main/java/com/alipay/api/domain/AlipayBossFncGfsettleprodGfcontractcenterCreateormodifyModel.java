package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同同步接口
 *
 * @author auto create
 * @since 1.0, 2025-10-21 15:04:15
 */
public class AlipayBossFncGfsettleprodGfcontractcenterCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 1543989811137378912L;

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
