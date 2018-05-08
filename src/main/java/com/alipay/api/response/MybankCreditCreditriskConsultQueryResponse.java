package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.creditrisk.consult.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-02-08 14:50:47
 */
public class MybankCreditCreditriskConsultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3327325711228724878L;

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
	 * 咨询结果的描述信息
	 */
	@ApiField("consult_result_msg")
	private String consultResultMsg;

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

}
