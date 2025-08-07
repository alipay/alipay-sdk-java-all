package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 先采后付退款查询
 *
 * @author auto create
 * @since 1.0, 2025-07-07 15:59:01
 */
public class AlipayTradeCreditRefundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6281391155816232976L;

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
