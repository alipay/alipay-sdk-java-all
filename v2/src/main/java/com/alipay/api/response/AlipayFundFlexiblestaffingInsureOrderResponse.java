package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.flexiblestaffing.insure.order response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-28 00:27:03
 */
public class AlipayFundFlexiblestaffingInsureOrderResponse extends AlipayResponse {

	private static final long serialVersionUID = 4223989772735696812L;

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
