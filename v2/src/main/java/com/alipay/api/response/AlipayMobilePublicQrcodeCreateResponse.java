package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.qrcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-12 06:57:52
 */
public class AlipayMobilePublicQrcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4649955252998938221L;

	/** 
	 * 返回结果码，如200，标识成功
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 图片地址
	 */
	@ApiField("code_img")
	private String codeImg;

	/** 
	 * 码过期时间，单位：秒
	 */
	@ApiField("expire_second")
	private Long expireSecond;

	/** 
	 * 结果吗描述信息
	 */
	@ApiField("msg")
	private String msg;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setCodeImg(String codeImg) {
		this.codeImg = codeImg;
	}
	public String getCodeImg( ) {
		return this.codeImg;
	}

	public void setExpireSecond(Long expireSecond) {
		this.expireSecond = expireSecond;
	}
	public Long getExpireSecond( ) {
		return this.expireSecond;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}
