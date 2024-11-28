package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家审核逆向订单
 *
 * @author auto create
 * @since 1.0, 2024-09-29 16:05:51
 */
public class AlipayCommerceMedicalOrderRefundApproveModel extends AlipayObject {

	private static final long serialVersionUID = 7619876189423321264L;

	/**
	 * 退款单审批操作类型，枚举值：
【
1-同意全单退款申请 、
2-拒绝全单退款申请、 
】
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 订单号（平台订单号）
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 原因备注说明信息（商家自定义），当reason_code为1399时 必填
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 当拒绝场景必填，即action_type = 2 时 必填
	 */
	@ApiField("reason_code")
	private String reasonCode;

	/**
	 * 退款订单号（可通过退款消息推送或退款订单查询接口
获取refund_no字段的值）
	 */
	@ApiField("refund_no")
	private String refundNo;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getReasonCode() {
		return this.reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getRefundNo() {
		return this.refundNo;
	}
	public void setRefundNo(String refundNo) {
		this.refundNo = refundNo;
	}

}
