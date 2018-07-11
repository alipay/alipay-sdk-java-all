package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.agreement.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-08-25 17:10:19
 */
public class AlipayEcoMycarParkingAgreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2218611513461739643L;

	/** 
	 * 车牌代扣状态，0：为支持代扣，1：为不支持代扣
	 */
	@ApiField("agreement_status")
	private String agreementStatus;

	public void setAgreementStatus(String agreementStatus) {
		this.agreementStatus = agreementStatus;
	}
	public String getAgreementStatus( ) {
		return this.agreementStatus;
	}

}
