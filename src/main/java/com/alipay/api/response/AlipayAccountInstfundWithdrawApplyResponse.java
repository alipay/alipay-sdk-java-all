package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.instfund.withdraw.apply response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-28 17:19:04
 */
public class AlipayAccountInstfundWithdrawApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1886113967384581444L;

	/** 
	 * 资金指令唯一标识
	 */
	@ApiField("instruction_no")
	private String instructionNo;

	public void setInstructionNo(String instructionNo) {
		this.instructionNo = instructionNo;
	}
	public String getInstructionNo( ) {
		return this.instructionNo;
	}

}
