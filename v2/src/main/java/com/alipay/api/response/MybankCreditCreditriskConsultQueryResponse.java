package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.creditrisk.consult.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:36
 */
public class MybankCreditCreditriskConsultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8578835889816599368L;

	/** 
	 * 可贷额度，单位元
	 */
	@ApiField("available_amt")
	private String availableAmt;

	/** 
	 * 咨询结果，根据具体的场景约定不同的值。
授信前准入场景，返回1表示准入，0表示不准入
	 */
	@ApiField("consult_result_code")
	private String consultResultCode;

	/** 
	 * 咨询结果的描述信息。reason_code_list：不准入原因,can_manual_review:是否人工审核
	 */
	@ApiField("consult_result_msg")
	private String consultResultMsg;

	/** 
	 * 授信额度，单位元
	 */
	@ApiField("creditlmt_amt")
	private String creditlmtAmt;

	/** 
	 * 贷款年化利率
	 */
	@ApiField("loan_int_rate")
	private String loanIntRate;

	public void setAvailableAmt(String availableAmt) {
		this.availableAmt = availableAmt;
	}
	public String getAvailableAmt( ) {
		return this.availableAmt;
	}

	public void setConsultResultCode(String consultResultCode) {
		this.consultResultCode = consultResultCode;
	}
	public String getConsultResultCode( ) {
		return this.consultResultCode;
	}

	public void setConsultResultMsg(String consultResultMsg) {
		this.consultResultMsg = consultResultMsg;
	}
	public String getConsultResultMsg( ) {
		return this.consultResultMsg;
	}

	public void setCreditlmtAmt(String creditlmtAmt) {
		this.creditlmtAmt = creditlmtAmt;
	}
	public String getCreditlmtAmt( ) {
		return this.creditlmtAmt;
	}

	public void setLoanIntRate(String loanIntRate) {
		this.loanIntRate = loanIntRate;
	}
	public String getLoanIntRate( ) {
		return this.loanIntRate;
	}

}
