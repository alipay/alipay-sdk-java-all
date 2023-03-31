package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.instfund.withdraw.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 16:48:03
 */
public class AlipayAccountInstfundWithdrawApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4186479533413336244L;

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
