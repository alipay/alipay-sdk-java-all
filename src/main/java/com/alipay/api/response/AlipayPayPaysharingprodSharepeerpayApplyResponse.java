package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.paysharingprod.sharepeerpay.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-03 15:20:34
 */
public class AlipayPayPaysharingprodSharepeerpayApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1226262274771736453L;

	/** 
	 * 代付单号
	 */
	@ApiField("peerpay_order_no")
	private String peerpayOrderNo;

	public void setPeerpayOrderNo(String peerpayOrderNo) {
		this.peerpayOrderNo = peerpayOrderNo;
	}
	public String getPeerpayOrderNo( ) {
		return this.peerpayOrderNo;
	}

}
