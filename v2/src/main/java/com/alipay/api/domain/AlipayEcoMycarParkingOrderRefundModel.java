package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车代扣退款接口
 *
 * @author auto create
 * @since 1.0, 2020-12-21 17:54:40
 */
public class AlipayEcoMycarParkingOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 8521866169324526441L;

	/**
	 * 代扣时返回的支付宝支付交易流水号，系统唯一
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * ISV代扣订单号，ISV唯一
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 外部申请退款请求流水，ISV唯一
	 */
	@ApiField("out_refund_no")
	private String outRefundNo;

	/**
	 * 退款金额，保留小数点后两位
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * 退款理由
	 */
	@ApiField("refund_reason")
	private String refundReason;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutRefundNo() {
		return this.outRefundNo;
	}
	public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
	}

	public String getRefundFee() {
		return this.refundFee;
	}
	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

}
