package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 售后单创建
 *
 * @author auto create
 * @since 1.0, 2024-06-04 20:13:32
 */
public class AlipayCloudCloudpromoMallRenfundorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3277771996143237821L;

	/**
	 * 分销子订单id
	 */
	@ApiField("order_line_id")
	private String orderLineId;

	/**
	 * 退款原因ID
	 */
	@ApiField("reason_text_id")
	private String reasonTextId;

	/**
	 * 退货数量
	 */
	@ApiField("refund_count")
	private Long refundCount;

	/**
	 * 退款金额（单位：分）
	 */
	@ApiField("refund_fee")
	private Long refundFee;

	public String getOrderLineId() {
		return this.orderLineId;
	}
	public void setOrderLineId(String orderLineId) {
		this.orderLineId = orderLineId;
	}

	public String getReasonTextId() {
		return this.reasonTextId;
	}
	public void setReasonTextId(String reasonTextId) {
		this.reasonTextId = reasonTextId;
	}

	public Long getRefundCount() {
		return this.refundCount;
	}
	public void setRefundCount(Long refundCount) {
		this.refundCount = refundCount;
	}

	public Long getRefundFee() {
		return this.refundFee;
	}
	public void setRefundFee(Long refundFee) {
		this.refundFee = refundFee;
	}

}
