package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.zmgo.agreement.unsign response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-15 11:15:06
 */
public class ZhimaCreditPeZmgoAgreementUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 8871913134329544147L;

	/** 
	 * 支付宝系统中用以唯一标识用户签约记录的编号。
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 调用芝麻GO结算受理接口时，需要传入该值
	 */
	@ApiField("withhold_plan_no")
	private String withholdPlanNo;

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementId( ) {
		return this.agreementId;
	}

	public void setWithholdPlanNo(String withholdPlanNo) {
		this.withholdPlanNo = withholdPlanNo;
	}
	public String getWithholdPlanNo( ) {
		return this.withholdPlanNo;
	}

}
