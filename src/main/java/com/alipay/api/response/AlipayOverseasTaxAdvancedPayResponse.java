package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.tax.advanced.pay response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-31 17:39:00
 */
public class AlipayOverseasTaxAdvancedPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 6227596151319225818L;

	/** 
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 支付宝退税资金订单号
	 */
	@ApiField("tax_refund_no")
	private String taxRefundNo;

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setTaxRefundNo(String taxRefundNo) {
		this.taxRefundNo = taxRefundNo;
	}
	public String getTaxRefundNo( ) {
		return this.taxRefundNo;
	}

}
