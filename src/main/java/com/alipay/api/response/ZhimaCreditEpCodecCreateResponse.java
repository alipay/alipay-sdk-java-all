package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.codec.create response.
 * 
 * @author auto create
 * @since 1.0, 2018-07-03 15:20:00
 */
public class ZhimaCreditEpCodecCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3797161574457725424L;

	/** 
	 * 二维码地址
	 */
	@ApiField("codec_img_url")
	private String codecImgUrl;

	/** 
	 * 二维码码值
	 */
	@ApiField("token")
	private String token;

	public void setCodecImgUrl(String codecImgUrl) {
		this.codecImgUrl = codecImgUrl;
	}
	public String getCodecImgUrl( ) {
		return this.codecImgUrl;
	}

	public void setToken(String token) {
		this.token = token;
	}
	public String getToken( ) {
		return this.token;
	}

}
