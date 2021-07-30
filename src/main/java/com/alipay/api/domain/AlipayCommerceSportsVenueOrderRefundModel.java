package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商发起订单退款
 *
 * @author auto create
 * @since 1.0, 2021-04-28 19:05:56
 */
public class AlipayCommerceSportsVenueOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 8618663961761481496L;

	/**
	 * 退款原因
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 支付宝业务订单唯一ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 服务商内部唯一订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 退款金额(单位：元)
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

}
