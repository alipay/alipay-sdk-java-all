package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.inner.experience.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-12 10:26:30
 */
public class AlipayOpenMiniInnerExperienceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2773328592658723785L;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 结果码
	 */
	@ApiField("msg")
	private String msg;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}
