package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.antlescenter.partcontract.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 12:47:36
 */
public class AlipayBossAntlescenterPartcontractCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 8828498755429661731L;

	/** 
	 * 合同编号
	 */
	@ApiField("contract_no")
	private String contractNo;

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	public String getContractNo( ) {
		return this.contractNo;
	}

}
