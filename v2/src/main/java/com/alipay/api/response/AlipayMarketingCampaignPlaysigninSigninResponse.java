package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PrizeSendInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.playsignin.signin response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:00
 */
public class AlipayMarketingCampaignPlaysigninSigninResponse extends AlipayResponse {

	private static final long serialVersionUID = 7511856224546376338L;

	/** 
	 * 签到发奖流水
	 */
	@ApiListField("prize_send_list")
	@ApiField("prize_send_info")
	private List<PrizeSendInfo> prizeSendList;

	/** 
	 * 签到的错误码描述
	 */
	@ApiField("trigger_error_code")
	private String triggerErrorCode;

	/** 
	 * 签到失败的说明
	 */
	@ApiField("trigger_error_message")
	private String triggerErrorMessage;

	/** 
	 * true触发成功，false触发失败
	 */
	@ApiField("trigger_result")
	private Boolean triggerResult;

	public void setPrizeSendList(List<PrizeSendInfo> prizeSendList) {
		this.prizeSendList = prizeSendList;
	}
	public List<PrizeSendInfo> getPrizeSendList( ) {
		return this.prizeSendList;
	}

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
