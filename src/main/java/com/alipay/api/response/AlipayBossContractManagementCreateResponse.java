package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InterTradeStartContractApprovalResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.contract.management.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-13 14:26:33
 */
public class AlipayBossContractManagementCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7482827457223566651L;

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
