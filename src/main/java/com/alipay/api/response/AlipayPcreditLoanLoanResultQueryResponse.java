package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.loan.result.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayPcreditLoanLoanResultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1458573437655991897L;

	/** 
	 * 贷款申请状态，取值{SUBMITTED, LENDING, USING, OVD, CLEAR, FAILED}：SUBMITTED-已提交; LENDING-放款中; USING-使用中; OVD-已逾期; CLEAR-已结清; FAILED-已失败
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/** 
	 * 贷款申请拒绝码
	 */
	@ApiField("reject_code")
	private String rejectCode;

	/** 
	 * 贷款申请拒绝说明
	 */
	@ApiField("reject_message")
	private String rejectMessage;

	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}
	public String getApplyStatus( ) {
		return this.applyStatus;
	}

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

}
