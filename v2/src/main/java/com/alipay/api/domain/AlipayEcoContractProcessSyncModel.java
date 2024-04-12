package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签署平台合同流程同步
 *
 * @author auto create
 * @since 1.0, 2023-01-30 10:26:17
 */
public class AlipayEcoContractProcessSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8634458948481912146L;

	/**
	 * MCCCode
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 流程信息
	 */
	@ApiListField("flows")
	@ApiField("contract_manager_process_sync_request")
	private List<ContractManagerProcessSyncRequest> flows;

	/**
	 * 签署平台的代码
	 */
	@ApiField("sign_platform_code")
	private String signPlatformCode;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public List<ContractManagerProcessSyncRequest> getFlows() {
		return this.flows;
	}
	public void setFlows(List<ContractManagerProcessSyncRequest> flows) {
		this.flows = flows;
	}

	public String getSignPlatformCode() {
		return this.signPlatformCode;
	}
	public void setSignPlatformCode(String signPlatformCode) {
		this.signPlatformCode = signPlatformCode;
	}

}
