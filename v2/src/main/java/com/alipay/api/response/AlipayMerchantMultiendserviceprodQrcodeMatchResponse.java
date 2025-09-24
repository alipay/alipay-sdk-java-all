package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.multiendserviceprod.qrcode.match response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-27 11:37:28
 */
public class AlipayMerchantMultiendserviceprodQrcodeMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 3255766254754566891L;

	/** 
	 * 是否支持支付宝缴费
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
