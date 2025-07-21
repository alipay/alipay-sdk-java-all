package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.gamecenter.gamerights.trigger response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-09 01:02:24
 */
public class AlipaySocialGamecenterGamerightsTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 8217356617869933267L;

	/** 
	 * 不可触发权益原因
	 */
	@ApiField("can_not_trigger_reason")
	private String canNotTriggerReason;

	/** 
	 * 发放为 true，未发放为false。
	 */
	@ApiField("trigger_success")
	private Boolean triggerSuccess;

	public void setCanNotTriggerReason(String canNotTriggerReason) {
		this.canNotTriggerReason = canNotTriggerReason;
	}
	public String getCanNotTriggerReason( ) {
		return this.canNotTriggerReason;
	}

	public void setTriggerSuccess(Boolean triggerSuccess) {
		this.triggerSuccess = triggerSuccess;
	}
	public Boolean getTriggerSuccess( ) {
		return this.triggerSuccess;
	}

}
