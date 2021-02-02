package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.tax.advanced.refund response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-31 17:39:20
 */
public class AlipayOverseasTaxAdvancedRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 8177516577392613821L;

	/** 
	 * 支付宝退税资金订单号
	 */
	@ApiField("tax_refund_no")
	private String taxRefundNo;

	public void setTaxRefundNo(String taxRefundNo) {
		this.taxRefundNo = taxRefundNo;
	}
	public String getTaxRefundNo( ) {
		return this.taxRefundNo;
	}

}
