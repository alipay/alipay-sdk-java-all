package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OpenID转换工单状态信息
 *
 * @author auto create
 * @since 1.0, 2023-03-09 16:51:29
 */
public class OpenIdOrder extends AlipayObject {

	private static final long serialVersionUID = 1751589889626934587L;

	/**
	 * 工单唯一标识
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * INIT：初始状态，此状态下上传用户ID，最后提交
AUDIT：审核中
REFUSE：已驳回，原因请查看refuse_reason
RUNNING：数据转换中
CANCEL：已取消
FINISH：完成，此状态可查询openid
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 审核人员填写的驳回原因
	 */
	@ApiField("refuse_reason")
	private String refuseReason;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getRefuseReason() {
		return this.refuseReason;
	}
	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}

}
