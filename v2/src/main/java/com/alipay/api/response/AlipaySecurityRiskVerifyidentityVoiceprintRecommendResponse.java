package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.verifyidentity.voiceprint.recommend response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-08 17:32:49
 */
public class AlipaySecurityRiskVerifyidentityVoiceprintRecommendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6318853365187429637L;

	/** 
	 * is_success=FALSE时返回
	 */
	@ApiField("err_code")
	private String errCode;

	/** 
	 * 错误信息，is_success=FALSE时返回
	 */
	@ApiField("err_msg")
	private String errMsg;

	/** 
	 * 只有TRUE,FALSE。接口调用是否成功，为FALSE时表示调用失败，会同时返回err_code和err_msg
	 */
	@ApiField("is_success")
	private String isSuccess;

	/** 
	 * 推荐详情页URL，recommend_type=render且is_success=TRUE时返回
	 */
	@ApiField("open_url")
	private String openUrl;

	/** 
	 * 是否推荐开通声纹，recommend_type=consult时返回。
	 */
	@ApiField("recommendable")
	private String recommendable;

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	public String getErrCode( ) {
		return this.errCode;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public String getErrMsg( ) {
		return this.errMsg;
	}

	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setOpenUrl(String openUrl) {
		this.openUrl = openUrl;
	}
	public String getOpenUrl( ) {
		return this.openUrl;
	}

	public void setRecommendable(String recommendable) {
		this.recommendable = recommendable;
	}
	public String getRecommendable( ) {
		return this.recommendable;
	}

}
