package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务包列表查询退款内容字段
 *
 * @author auto create
 * @since 1.0, 2026-04-10 16:25:07
 */
public class ServicepackageRefundInfo extends AlipayObject {

	private static final long serialVersionUID = 8274722162421533426L;

	/**
	 * 退款发起角色:
1-用户主动发起
2-运营
3-医生拒单
41-医生超时未接单
42-服务包过期
	 */
	@ApiField("operator_role")
	private Long operatorRole;

	/**
	 * 退款金额(单位分)
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/**
	 * 退款状态:
23-退款中
32-已完成退款
33-部分退款
45-退款失败
	 */
	@ApiField("refund_status")
	private Long refundStatus;

	public Long getOperatorRole() {
		return this.operatorRole;
	}
	public void setOperatorRole(Long operatorRole) {
		this.operatorRole = operatorRole;
	}

	public Long getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}

	public Long getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(Long refundStatus) {
		this.refundStatus = refundStatus;
	}

}
