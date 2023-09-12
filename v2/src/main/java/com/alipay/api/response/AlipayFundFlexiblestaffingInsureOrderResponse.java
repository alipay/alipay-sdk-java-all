package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.flexiblestaffing.insure.order response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-07 11:06:43
 */
public class AlipayFundFlexiblestaffingInsureOrderResponse extends AlipayResponse {

	private static final long serialVersionUID = 1394376279164753449L;

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
