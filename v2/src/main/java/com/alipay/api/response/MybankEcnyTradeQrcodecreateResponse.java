package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.ecny.trade.qrcodecreate response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-20 14:46:24
 */
public class MybankEcnyTradeQrcodecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2647579981593555661L;

	/** 
	 * 商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/** 
	 * 生成的二维码值
	 */
	@ApiField("qr_code")
	private String qrCode;

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantId( ) {
		return this.merchantId;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getQrCode( ) {
		return this.qrCode;
	}

}
