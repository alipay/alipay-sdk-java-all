package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 先采后付退款接口
 *
 * @author auto create
 * @since 1.0, 2025-07-07 15:59:07
 */
public class AlipayTradeCreditRefundModel extends AlipayObject {

	private static final long serialVersionUID = 1826481926245596184L;

	/**
	 * 信用单号
	 */
	@ApiField("credit_biz_order_id")
	private String creditBizOrderId;

	/**
	 * 退款请求的外部单号，用作幂等
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 退款金额，单位：元
	 */
	@ApiField("refund_amount")
	private String refundAmount;

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

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

}
