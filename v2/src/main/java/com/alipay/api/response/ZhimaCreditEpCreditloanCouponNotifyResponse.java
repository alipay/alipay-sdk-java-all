package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.creditloan.coupon.notify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-04 13:43:51
 */
public class ZhimaCreditEpCreditloanCouponNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6329918393139383384L;

	/** 
	 * 返回结果。结构视financial_code的不同而定
	 */
	@ApiField("result_content")
	private String resultContent;

	public void setResultContent(String resultContent) {
		this.resultContent = resultContent;
	}
	public String getResultContent( ) {
		return this.resultContent;
	}

}
