package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antarchive.face.identify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:52:42
 */
public class AlipayUserAntarchiveFaceIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3844656455187661931L;

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
