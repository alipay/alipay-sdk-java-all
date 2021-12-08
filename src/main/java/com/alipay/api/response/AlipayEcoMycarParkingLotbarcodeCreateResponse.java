package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.lotbarcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-12-31 11:36:15
 */
public class AlipayEcoMycarParkingLotbarcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3375427855373489718L;

	/** 
	 * 返回二维码链接地址
	 */
	@ApiField("qrcode_url")
	private String qrcodeUrl;

	/** 
	 * 返回状态：1为成功，0为失败
	 */
	@ApiField("status")
	private String status;

	public void setQrcodeUrl(String qrcodeUrl) {
		this.qrcodeUrl = qrcodeUrl;
	}
	public String getQrcodeUrl( ) {
		return this.qrcodeUrl;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
