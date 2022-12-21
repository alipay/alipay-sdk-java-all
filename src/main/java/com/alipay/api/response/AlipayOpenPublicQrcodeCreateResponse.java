package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.qrcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 18:39:02
 */
public class AlipayOpenPublicQrcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7257432719186958388L;

	/** 
	 * 二维码图片地址，可跳转到实际图片
	 */
	@ApiField("code_img")
	private String codeImg;

	/** 
	 * 二维码有效时间，单位（秒）。永久码暂时忽略该信息
	 */
	@ApiField("expire_second")
	private String expireSecond;

	public void setCodeImg(String codeImg) {
		this.codeImg = codeImg;
	}
	public String getCodeImg( ) {
		return this.codeImg;
	}

	public void setExpireSecond(String expireSecond) {
		this.expireSecond = expireSecond;
	}
	public String getExpireSecond( ) {
		return this.expireSecond;
	}

}
