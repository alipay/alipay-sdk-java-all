package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.point.order.add response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:36
 */
public class AlipayPointOrderAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 1686693853921484192L;

	/** 
	 * 支付宝集分宝发放流水号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/** 
	 * 此参数已废弃。
	 */
	@ApiField("result_code")
	private Boolean resultCode;

	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}
	public String getAlipayOrderNo( ) {
		return this.alipayOrderNo;
	}

	public void setResultCode(Boolean resultCode) {
		this.resultCode = resultCode;
	}
	public Boolean getResultCode( ) {
		return this.resultCode;
	}

}
