package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.creditlinkloan.authorder.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 23:01:45
 */
public class ZhimaCreditEpCreditlinkloanAuthorderSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 7226862291416325917L;

	/** 
	 * 商户单号，正常调用返回的数据和入参中的商户单号保持一致
	 */
	@ApiField("merchant_biz_no")
	private String merchantBizNo;

	public void setMerchantBizNo(String merchantBizNo) {
		this.merchantBizNo = merchantBizNo;
	}
	public String getMerchantBizNo( ) {
		return this.merchantBizNo;
	}

}
