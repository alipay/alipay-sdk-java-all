package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.waybill.intelinotice.consult response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-29 15:02:49
 */
public class AlipayCommerceLogisticsWaybillIntelinoticeConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6528481378743853872L;

	/** 
	 * 是否能支持智能通知
	 */
	@ApiField("can_intelinotice")
	private Boolean canIntelinotice;

	public void setCanIntelinotice(Boolean canIntelinotice) {
		this.canIntelinotice = canIntelinotice;
	}
	public Boolean getCanIntelinotice( ) {
		return this.canIntelinotice;
	}

}
