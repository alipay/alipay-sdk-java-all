package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.paysharingprod.sharepeerpay.apply response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-21 22:28:50
 */
public class AlipayPayPaysharingprodSharepeerpayApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8611819266531221162L;

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
