package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退款明细
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class RefundDetailRequest extends AlipayObject {

	private static final long serialVersionUID = 5199866891336967815L;

	/**
	 * 商品子订单号
	 */
	@ApiField("item_order_no")
	private String itemOrderNo;

	/**
	 * 退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	public String getItemOrderNo() {
		return this.itemOrderNo;
	}
	public void setItemOrderNo(String itemOrderNo) {
		this.itemOrderNo = itemOrderNo;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

}
