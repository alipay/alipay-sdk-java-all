package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.movie.activity.notify response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-21 19:52:08
 */
public class AlipayMobileMovieActivityNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7777822939878257273L;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
