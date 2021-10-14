package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.experience.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-11-24 16:30:39
 */
public class AlipayOpenMiniExperienceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1699995995489692879L;

	/** 
	 * 小程序体验版二维码地址
	 */
	@ApiField("exp_qr_code_url")
	private String expQrCodeUrl;

	/** 
	 * 体验版打包状态。状态枚举如下：
expVersionPackged：体验版打包成功；
expVersionPackaging：体验版打包中；
notExpVersion：非体验版。
	 */
	@ApiField("status")
	private String status;

	public void setExpQrCodeUrl(String expQrCodeUrl) {
		this.expQrCodeUrl = expQrCodeUrl;
	}
	public String getExpQrCodeUrl( ) {
		return this.expQrCodeUrl;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
