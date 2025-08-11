package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 电子借条信息同步
 *
 * @author auto create
 * @since 1.0, 2024-05-28 17:07:54
 */
public class AlipayEcoContractsLoanInfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7438964522335122953L;

	/**
	 * 合约信息列表
	 */
	@ApiListField("contracts")
	@ApiField("eco_contract_info")
	private List<EcoContractInfo> contracts;

	/**
	 * 同步请求id，幂等使用
	 */
	@ApiField("sync_request_id")
	private String syncRequestId;

	public List<EcoContractInfo> getContracts() {
		return this.contracts;
	}
	public void setContracts(List<EcoContractInfo> contracts) {
		this.contracts = contracts;
	}

	public String getSyncRequestId() {
		return this.syncRequestId;
	}
	public void setSyncRequestId(String syncRequestId) {
		this.syncRequestId = syncRequestId;
	}

}
