package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 先采后付退款查询
 *
 * @author auto create
 * @since 1.0, 2025-09-30 17:08:44
 */
public class AlipayTradeCreditRefundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1429176357431431988L;

	/**
	 * 信用支付单号
	 */
	@ApiField("credit_biz_order_id")
	private String creditBizOrderId;

	/**
	 * 退款请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getCreditBizOrderId() {
		return this.creditBizOrderId;
	}
	public void setCreditBizOrderId(String creditBizOrderId) {
		this.creditBizOrderId = creditBizOrderId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
