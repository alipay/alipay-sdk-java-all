package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.travel.partner.trigger response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-14 11:37:09
 */
public class AlipayCloudCloudpromoTravelPartnerTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 1152366892138164432L;

	/** 
	 * 伴游状态，WAITING、OPEN、CLOSE
	 */
	@ApiField("assist_status")
	private String assistStatus;

	public void setAssistStatus(String assistStatus) {
		this.assistStatus = assistStatus;
	}
	public String getAssistStatus( ) {
		return this.assistStatus;
	}

}
