package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.qrcode.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-28 11:55:31
 */
public class ZhimaCreditEpDossierQrcodeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2418229423114816621L;

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
