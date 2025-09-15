package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.benefit.verify.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-29 10:32:38
 */
public class AlipayMarketingBenefitVerifyCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7241618384543379815L;

	/** 
	 * 是否需要核身
	 */
	@ApiField("need_verify")
	private Boolean needVerify;

	/** 
	 * 核身口令，只有当需要核身的时候返回
	 */
	@ApiField("verify_id")
	private String verifyId;

	/** 
	 * 核身场景
	 */
	@ApiField("verify_scene")
	private String verifyScene;

	/** 
	 * 核身url,当需要核身的时候返回
	 */
	@ApiField("verify_url")
	private String verifyUrl;

	public void setNeedVerify(Boolean needVerify) {
		this.needVerify = needVerify;
	}
	public Boolean getNeedVerify( ) {
		return this.needVerify;
	}

	public void setVerifyId(String verifyId) {
		this.verifyId = verifyId;
	}
	public String getVerifyId( ) {
		return this.verifyId;
	}

	public void setVerifyScene(String verifyScene) {
		this.verifyScene = verifyScene;
	}
	public String getVerifyScene( ) {
		return this.verifyScene;
	}

	public void setVerifyUrl(String verifyUrl) {
		this.verifyUrl = verifyUrl;
	}
	public String getVerifyUrl( ) {
		return this.verifyUrl;
	}

}
