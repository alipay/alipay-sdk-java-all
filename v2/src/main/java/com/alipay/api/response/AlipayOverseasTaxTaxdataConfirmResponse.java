package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.tax.taxdata.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-19 11:11:26
 */
public class AlipayOverseasTaxTaxdataConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 7685449347855625872L;

	/** 
	 * 退税支付宝流水号
	 */
	@ApiField("refund_order_no")
	private String refundOrderNo;

	public void setRefundOrderNo(String refundOrderNo) {
		this.refundOrderNo = refundOrderNo;
	}
	public String getRefundOrderNo( ) {
		return this.refundOrderNo;
	}

}
