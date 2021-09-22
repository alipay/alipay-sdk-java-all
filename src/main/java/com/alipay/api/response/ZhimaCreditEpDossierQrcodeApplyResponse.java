package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.qrcode.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-08 21:50:22
 */
public class ZhimaCreditEpDossierQrcodeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7623953547485739181L;

	/** 
	 * 档案直跳地址，默认不返回
	 */
	@ApiField("dossier_path")
	private String dossierPath;

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

	public void setDossierPath(String dossierPath) {
		this.dossierPath = dossierPath;
	}
	public String getDossierPath( ) {
		return this.dossierPath;
	}

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
