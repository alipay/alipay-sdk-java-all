package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车主系统退款子订单请求
 *
 * @author auto create
 * @since 1.0, 2021-06-05 19:36:10
 */
public class SubOrderRefundRequest extends AlipayObject {

	private static final long serialVersionUID = 3791791364861283631L;

	/**
	 * 子订单退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款分润基数。注意：如果不传，计收费系统默认分润基数为该子订单所属主订单的总金额，当传错或不传，可能会导致不符合预期，该规则请联系解释业务或解决方案。
	 */
	@ApiField("refund_applets_service_amount")
	private String refundAppletsServiceAmount;

	/**
	 * 该子订单的退款说明。如果无说明，请填入：无
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 车主系统退款子订单编号，商户同步订单到车主系统后，同步响应结果的子订单编号
	 */
	@ApiField("sub_alipay_order_no")
	private String subAlipayOrderNo;

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundAppletsServiceAmount() {
		return this.refundAppletsServiceAmount;
	}
	public void setRefundAppletsServiceAmount(String refundAppletsServiceAmount) {
		this.refundAppletsServiceAmount = refundAppletsServiceAmount;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getSubAlipayOrderNo() {
		return this.subAlipayOrderNo;
	}
	public void setSubAlipayOrderNo(String subAlipayOrderNo) {
		this.subAlipayOrderNo = subAlipayOrderNo;
	}

}
