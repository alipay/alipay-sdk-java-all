package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.flexiblestaffing.insure.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-03 11:52:09
 */
public class AlipayFundFlexiblestaffingInsureApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5396912921237882326L;

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
