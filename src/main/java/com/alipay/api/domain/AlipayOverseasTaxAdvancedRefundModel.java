package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 担保退税转交易退款
 *
 * @author auto create
 * @since 1.0, 2020-07-31 17:39:20
 */
public class AlipayOverseasTaxAdvancedRefundModel extends AlipayObject {

	private static final long serialVersionUID = 7733137497777171614L;

	/**
	 * 支付宝退税资金订单号
	 */
	@ApiField("tax_refund_no")
	private String taxRefundNo;

	public String getTaxRefundNo() {
		return this.taxRefundNo;
	}
	public void setTaxRefundNo(String taxRefundNo) {
		this.taxRefundNo = taxRefundNo;
	}

}
