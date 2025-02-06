package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antlescenter.partcontract.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-14 15:48:29
 */
public class AlipayBossProdAntlescenterPartcontractInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6439993594118992196L;

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
