package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.apple.activity.consult response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-17 14:01:12
 */
public class AlipayMarketingCampaignAppleActivityConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 8474468673875862645L;

	/** 
	 * 活动参与状态
可参与/不可参与
	 */
	@ApiField("activity_status")
	private String activityStatus;

	/** 
	 * 苹果绑定状态+已绑定/未绑定
	 */
	@ApiField("bind_status")
	private String bindStatus;

	/** 
	 * 错误码
系统异常code
系统返回
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果描述
错误码对应的文字描述
系统返回
	 */
	@ApiField("result_desc")
	private String resultDesc;

	/** 
	 * 操作成功标识【true：成功；false：失败】
	 */
	@ApiField("success")
	private String success;

	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}
	public String getActivityStatus( ) {
		return this.activityStatus;
	}

	public void setBindStatus(String bindStatus) {
		this.bindStatus = bindStatus;
	}
	public String getBindStatus( ) {
		return this.bindStatus;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
