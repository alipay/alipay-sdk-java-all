package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.creditlinkloan.authorder.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:25:20
 */
public class ZhimaCreditEpCreditlinkloanAuthorderInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 8255884712626976812L;

	/** 
	 * 商户单号，请与授权申请时的单号保持一致
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
