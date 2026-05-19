package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.antlescenter.partcontract.finish response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-30 15:57:43
 */
public class AlipayBossAntlescenterPartcontractFinishResponse extends AlipayResponse {

	private static final long serialVersionUID = 6252512444592363825L;

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
