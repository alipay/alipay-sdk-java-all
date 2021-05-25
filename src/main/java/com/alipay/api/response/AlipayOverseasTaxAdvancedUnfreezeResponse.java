package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.tax.advanced.unfreeze response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-08 11:25:36
 */
public class AlipayOverseasTaxAdvancedUnfreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1817164411817699972L;

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
