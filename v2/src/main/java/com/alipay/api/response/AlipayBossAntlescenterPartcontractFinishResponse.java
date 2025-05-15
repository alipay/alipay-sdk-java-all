package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.antlescenter.partcontract.finish response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-14 15:52:06
 */
public class AlipayBossAntlescenterPartcontractFinishResponse extends AlipayResponse {

	private static final long serialVersionUID = 4251699613244759185L;

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
