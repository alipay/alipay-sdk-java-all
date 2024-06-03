package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝租车商户通知续租确认结果接口
 *
 * @author auto create
 * @since 1.0, 2024-04-29 09:59:11
 */
public class AlipayEcoMycarRentcarOrdermodifyConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 5472225831564255819L;

	/**
	 * 若拒绝修改，则车生活会取消修改订单并给用户退款
	 */
	@ApiField("confirm_result")
	private String confirmResult;

	/**
	 * 修改单的商户侧订单号
	 */
	@ApiField("modified_out_order_no")
	private String modifiedOutOrderNo;

	/**
	 * 支付宝用户开放id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 发起修改订单的租车单的商户侧订单号
	 */
	@ApiField("parent_out_order_no")
	private String parentOutOrderNo;

	/**
	 * 用于向用户展示修改订单失败的原因，当confirm_result为REJECT时必传
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getConfirmResult() {
		return this.confirmResult;
	}
	public void setConfirmResult(String confirmResult) {
		this.confirmResult = confirmResult;
	}

	public String getModifiedOutOrderNo() {
		return this.modifiedOutOrderNo;
	}
	public void setModifiedOutOrderNo(String modifiedOutOrderNo) {
		this.modifiedOutOrderNo = modifiedOutOrderNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getParentOutOrderNo() {
		return this.parentOutOrderNo;
	}
	public void setParentOutOrderNo(String parentOutOrderNo) {
		this.parentOutOrderNo = parentOutOrderNo;
	}

	public String getRejectReason() {
		return this.rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
