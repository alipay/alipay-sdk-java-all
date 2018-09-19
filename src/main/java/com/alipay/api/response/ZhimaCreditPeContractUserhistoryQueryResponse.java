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
 * @since 1.0, 2018-07-27 18:11:01
 */
public class ZhimaCreditPeContractUserhistoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7194327435835339941L;

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
