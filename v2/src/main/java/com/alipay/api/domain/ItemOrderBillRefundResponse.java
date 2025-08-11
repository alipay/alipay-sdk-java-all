package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单对账退款明细
 *
 * @author auto create
 * @since 1.0, 2024-07-17 19:59:01
 */
public class ItemOrderBillRefundResponse extends AlipayObject {

	private static final long serialVersionUID = 1325971312757628298L;

	/**
	 * 退款金额，单位：元，精确到小数点后两位
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * 订单对账退款类型
	 */
	@ApiField("refund_type")
	private String refundType;

	public String getRefundFee() {
		return this.refundFee;
	}
	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public String getRefundType() {
		return this.refundType;
	}
	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}

}
