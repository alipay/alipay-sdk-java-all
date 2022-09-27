package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.auth.gettoken response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-23 14:42:18
 */
public class AlipayMobilePublicAuthGettokenResponse extends AlipayResponse {

	private static final long serialVersionUID = 7764552528488594357L;

	/** 
	 * 返回码。处理成功：200；处理失败：请参考返回码。
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 支付宝返回的处理结果说明，请参考返回码
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 跳转到授权页面需要的Token
	 */
	@ApiField("token")
	private String token;

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

	public void setToken(String token) {
		this.token = token;
	}
	public String getToken( ) {
		return this.token;
	}

}
