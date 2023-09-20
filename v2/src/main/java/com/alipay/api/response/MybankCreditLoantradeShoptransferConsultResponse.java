package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.shoptransfer.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:43:36
 */
public class MybankCreditLoantradeShoptransferConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6651574287918835556L;

	/** 
	 * 咨询结果,allow(允许转让)/refuse(拒绝)
	 */
	@ApiField("consult_result")
	private String consultResult;

	/** 
	 * 拒绝码
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	/** 
	 * 拒绝文案
	 */
	@ApiField("refuse_desc")
	private String refuseDesc;

	public void setConsultResult(String consultResult) {
		this.consultResult = consultResult;
	}
	public String getConsultResult( ) {
		return this.consultResult;
	}

	public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}
	public String getRefuseCode( ) {
		return this.refuseCode;
	}

	public void setRefuseDesc(String refuseDesc) {
		this.refuseDesc = refuseDesc;
	}
	public String getRefuseDesc( ) {
		return this.refuseDesc;
	}

}
