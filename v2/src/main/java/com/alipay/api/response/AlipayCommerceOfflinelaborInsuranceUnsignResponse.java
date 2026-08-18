package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.offlinelabor.insurance.unsign response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-28 15:42:50
 */
public class AlipayCommerceOfflinelaborInsuranceUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 8419175741875817496L;

	/** 
	 * 外部业务单号
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
