package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.order.qrcode.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEbppOrderQrcodeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1511245673859229575L;

	/** 
	 * 用于支付相应订单子项的二维码码串，可以用二维码生成工具根据该码串值生成对应的二维码，用户扫码后会拉起收银台支付
	 */
	@ApiField("qr_code")
	private String qrCode;

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getQrCode( ) {
		return this.qrCode;
	}

}
