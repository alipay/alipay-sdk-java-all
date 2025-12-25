package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.thirdpartybill.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-15 16:12:33
 */
public class AlipayEbppCommunityThirdpartybillCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7131886369444955121L;

	/** 
	 * 支付宝内部生成账单流水号。
	 */
	@ApiField("alipay_biz_no")
	private String alipayBizNo;

	public void setAlipayBizNo(String alipayBizNo) {
		this.alipayBizNo = alipayBizNo;
	}
	public String getAlipayBizNo( ) {
		return this.alipayBizNo;
	}

}
