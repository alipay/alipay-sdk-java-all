package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ContractBasicInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.contract.userhistory.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class ZhimaCreditPeContractUserhistoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4378982473893719853L;

	/** 
	 * 用户历史签约信息
	 */
	@ApiListField("contract_history")
	@ApiField("contract_basic_info")
	private List<ContractBasicInfo> contractHistory;

	public void setContractHistory(List<ContractBasicInfo> contractHistory) {
		this.contractHistory = contractHistory;
	}
	public List<ContractBasicInfo> getContractHistory( ) {
		return this.contractHistory;
	}

}
