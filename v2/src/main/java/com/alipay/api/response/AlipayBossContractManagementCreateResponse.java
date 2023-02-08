package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InterTradeStartContractApprovalResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.contract.management.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 22:37:35
 */
public class AlipayBossContractManagementCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4436879833213749626L;

	/** 
	 * 发起审批返回结果
	 */
	@ApiField("result_set")
	private InterTradeStartContractApprovalResult resultSet;

	public void setResultSet(InterTradeStartContractApprovalResult resultSet) {
		this.resultSet = resultSet;
	}
	public InterTradeStartContractApprovalResult getResultSet( ) {
		return this.resultSet;
	}

}
