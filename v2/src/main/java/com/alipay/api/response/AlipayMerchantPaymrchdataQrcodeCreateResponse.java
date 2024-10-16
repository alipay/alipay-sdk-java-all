package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.paymrchdata.qrcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-11 15:37:12
 */
public class AlipayMerchantPaymrchdataQrcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3179546611675672475L;

	/** 
	 * 经营码开通结果
	 */
	@ApiField("open_result")
	private Boolean openResult;

	public void setOpenResult(Boolean openResult) {
		this.openResult = openResult;
	}
	public Boolean getOpenResult( ) {
		return this.openResult;
	}

}
