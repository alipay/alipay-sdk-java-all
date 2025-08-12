package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.repay.result.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:09:54
 */
public class AlipayPcreditLoanRepayResultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6132924352286934128L;

	/** 
	 * 还款申请拒绝码
	 */
	@ApiField("reject_code")
	private String rejectCode;

	/** 
	 * 还款申请拒绝描述
	 */
	@ApiField("reject_message")
	private String rejectMessage;

	/** 
	 * 还款申请状态，取值{I, F, S}：I-初始化, F-还款失败; S-还款成功;
	 */
	@ApiField("repay_status")
	private String repayStatus;

	public void setRejectCode(String rejectCode) {
		this.rejectCode = rejectCode;
	}
	public String getRejectCode( ) {
		return this.rejectCode;
	}

	public void setRejectMessage(String rejectMessage) {
		this.rejectMessage = rejectMessage;
	}
	public String getRejectMessage( ) {
		return this.rejectMessage;
	}

	public void setRepayStatus(String repayStatus) {
		this.repayStatus = repayStatus;
	}
	public String getRepayStatus( ) {
		return this.repayStatus;
	}

}
