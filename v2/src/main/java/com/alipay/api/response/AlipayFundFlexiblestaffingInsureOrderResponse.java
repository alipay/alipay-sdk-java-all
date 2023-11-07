package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.flexiblestaffing.insure.order response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-16 21:06:46
 */
public class AlipayFundFlexiblestaffingInsureOrderResponse extends AlipayResponse {

	private static final long serialVersionUID = 4842944472947794365L;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
