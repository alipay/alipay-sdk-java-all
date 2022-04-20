package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antarchive.face.identify response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:13:24
 */
public class AlipayUserAntarchiveFaceIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1219539924156386879L;

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
