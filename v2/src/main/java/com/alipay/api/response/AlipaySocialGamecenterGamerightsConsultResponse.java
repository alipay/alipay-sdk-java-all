package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.gamecenter.gamerights.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-09 01:02:24
 */
public class AlipaySocialGamecenterGamerightsConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7474781497925437761L;

	/** 
	 * 不可触发权益原因
	 */
	@ApiField("can_not_trigger_reason")
	private String canNotTriggerReason;

	/** 
	 * 可以发放为 true，不可发放为false。
	 */
	@ApiField("can_trigger")
	private Boolean canTrigger;

	public void setCanNotTriggerReason(String canNotTriggerReason) {
		this.canNotTriggerReason = canNotTriggerReason;
	}
	public String getCanNotTriggerReason( ) {
		return this.canNotTriggerReason;
	}

	public void setCanTrigger(Boolean canTrigger) {
		this.canTrigger = canTrigger;
	}
	public Boolean getCanTrigger( ) {
		return this.canTrigger;
	}

}
