package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.signup.submit response.
 * 
 * @author auto create
 * @since 1.0, 2020-05-06 17:35:09
 */
public class AlipayMarketingToolSignupSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 5251185472629296366L;

	/** 
	 * 玩法ID。
	 */
	@ApiField("play_id")
	private String playId;

	public void setPlayId(String playId) {
		this.playId = playId;
	}
	public String getPlayId( ) {
		return this.playId;
	}

}
