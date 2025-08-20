package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业凭证退款
 *
 * @author auto create
 * @since 1.0, 2024-07-09 15:25:42
 */
public class AlipayCommerceTransportTourVoucherRefundModel extends AlipayObject {

	private static final long serialVersionUID = 8535752819777249152L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商家側退款订单ID流水号
	 */
	@ApiField("out_refund_id")
	private String outRefundId;

	/**
	 * 外部凭证id列表，传商側凭证id
	 */
	@ApiListField("out_voucher_list")
	@ApiField("string")
	private List<String> outVoucherList;

	/**
	 * 订单退款金额，单位：元，精确到小数点后两位
	 */
	@ApiField("refund")
	private String refund;

	/**
	 * 用户退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutRefundId() {
		return this.outRefundId;
	}
	public void setOutRefundId(String outRefundId) {
		this.outRefundId = outRefundId;
	}

	public List<String> getOutVoucherList() {
		return this.outVoucherList;
	}
	public void setOutVoucherList(List<String> outVoucherList) {
		this.outVoucherList = outVoucherList;
	}

	public String getRefund() {
		return this.refund;
	}
	public void setRefund(String refund) {
		this.refund = refund;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
