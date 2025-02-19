package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.codec.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 21:44:26
 */
public class ZhimaCreditEpCodecCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4221244219723662276L;

	/** 
	 * 二维码地址
	 */
	@ApiField("codec_img_url")
	private String codecImgUrl;

	/** 
	 * 二维码生码订单号
	 */
	@ApiField("order_no")
	private String orderNo;

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

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setToken(String token) {
		this.token = token;
	}
	public String getToken( ) {
		return this.token;
	}

}
