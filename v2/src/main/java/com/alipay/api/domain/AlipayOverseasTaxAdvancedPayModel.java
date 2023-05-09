package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 担保退税转交易
 *
 * @author auto create
 * @since 1.0, 2023-01-31 17:59:54
 */
public class AlipayOverseasTaxAdvancedPayModel extends AlipayObject {

	private static final long serialVersionUID = 3826395253397681583L;

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

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getTaxRefundNo() {
		return this.taxRefundNo;
	}
	public void setTaxRefundNo(String taxRefundNo) {
		this.taxRefundNo = taxRefundNo;
	}

}
