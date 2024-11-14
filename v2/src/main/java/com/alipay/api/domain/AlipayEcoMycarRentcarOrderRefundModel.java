package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝租车订单退款
 *
 * @author auto create
 * @since 1.0, 2024-07-19 20:30:15
 */
public class AlipayEcoMycarRentcarOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 1436595543133858487L;

	/**
	 * 支付宝用户开放平台id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 外部请求号，即商户请求车生活发起退款的流水号，车生活侧通过此字段进行幂等控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 退款金额，单位分
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public Long getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
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
