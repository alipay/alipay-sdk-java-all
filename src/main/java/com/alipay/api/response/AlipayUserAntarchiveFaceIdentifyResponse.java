package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antarchive.face.identify response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 05:44:59
 */
public class AlipayUserAntarchiveFaceIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2129634781293378976L;

	/** 
	 * 比对分值
	 */
	@ApiField("score")
	private String score;

	public void setScore(String score) {
		this.score = score;
	}
	public String getScore( ) {
		return this.score;
	}

}
