package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.repaybill.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 21:07:55
 */
public class AlipayTradeRepaybillCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2329352819394252328L;

	/** 
	 * 支付宝账单编号
	 */
	@ApiField("bill_no")
	private String billNo;

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

}
