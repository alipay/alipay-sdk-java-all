package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.signup.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-05-06 17:02:25
 */
public class AlipayMarketingToolSignupQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5264194367258394567L;

	/** 
	 * 活动ID。
	 */
	@ApiField("play_id")
	private String playId;

	/** 
	 * 是否已经报名。
	 */
	@ApiField("sign_up")
	private Boolean signUp;

	public void setPlayId(String playId) {
		this.playId = playId;
	}
	public String getPlayId( ) {
		return this.playId;
	}

	public void setSignUp(Boolean signUp) {
		this.signUp = signUp;
	}
	public Boolean getSignUp( ) {
		return this.signUp;
	}

}
