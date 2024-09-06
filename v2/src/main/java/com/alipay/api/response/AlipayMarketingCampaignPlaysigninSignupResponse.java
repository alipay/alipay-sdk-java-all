package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.playsignin.signup response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-14 16:41:45
 */
public class AlipayMarketingCampaignPlaysigninSignupResponse extends AlipayResponse {

	private static final long serialVersionUID = 4272713861633596393L;

	/** 
	 * 签到报名错误码
	 */
	@ApiField("trigger_error_code")
	private String triggerErrorCode;

	/** 
	 * 对于签到报名失败的说明
	 */
	@ApiField("trigger_error_message")
	private String triggerErrorMessage;

	/** 
	 * true:签到报名触发成功 false:签到报名触发失败
	 */
	@ApiField("trigger_result")
	private Boolean triggerResult;

	public void setTriggerErrorCode(String triggerErrorCode) {
		this.triggerErrorCode = triggerErrorCode;
	}
	public String getTriggerErrorCode( ) {
		return this.triggerErrorCode;
	}

	public void setTriggerErrorMessage(String triggerErrorMessage) {
		this.triggerErrorMessage = triggerErrorMessage;
	}
	public String getTriggerErrorMessage( ) {
		return this.triggerErrorMessage;
	}

	public void setTriggerResult(Boolean triggerResult) {
		this.triggerResult = triggerResult;
	}
	public Boolean getTriggerResult( ) {
		return this.triggerResult;
	}

}
