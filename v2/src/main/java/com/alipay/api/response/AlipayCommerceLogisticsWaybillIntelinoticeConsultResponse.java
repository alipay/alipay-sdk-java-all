package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.waybill.intelinotice.consult response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-01 20:17:55
 */
public class AlipayCommerceLogisticsWaybillIntelinoticeConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 8572719164713463538L;

	/** 
	 * 是否能支持智能通知
	 */
	@ApiField("can_intelinotice")
	private Boolean canIntelinotice;

	/** 
	 * 发送短信手机号后四位
	 */
	@ApiField("sms_number")
	private String smsNumber;

	public void setCanIntelinotice(Boolean canIntelinotice) {
		this.canIntelinotice = canIntelinotice;
	}
	public Boolean getCanIntelinotice( ) {
		return this.canIntelinotice;
	}

	public void setSmsNumber(String smsNumber) {
		this.smsNumber = smsNumber;
	}
	public String getSmsNumber( ) {
		return this.smsNumber;
	}

}
