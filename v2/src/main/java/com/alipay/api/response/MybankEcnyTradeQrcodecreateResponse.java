package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.ecny.trade.qrcodecreate response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:52:42
 */
public class MybankEcnyTradeQrcodecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2743897659842338593L;

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
