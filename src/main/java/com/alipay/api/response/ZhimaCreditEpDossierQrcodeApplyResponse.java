package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.qrcode.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-26 14:17:35
 */
public class ZhimaCreditEpDossierQrcodeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8594524171441743742L;

	/** 
	 * 二维码到期时间，
标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("expiration_time")
	private String expirationTime;

	/** 
	 * 企业档案页二维码图片地址
	 */
	@ApiField("qr_code")
	private String qrCode;

	public void setExpirationTime(String expirationTime) {
		this.expirationTime = expirationTime;
	}
	public String getExpirationTime( ) {
		return this.expirationTime;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getQrCode( ) {
		return this.qrCode;
	}

}
