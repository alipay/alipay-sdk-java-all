package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账户明细
 *
 * @author auto create
 * @since 1.0, 2025-08-29 10:29:55
 */
public class LoanAccountQueryDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 7443239173935444473L;

	/**
	 * 本次操作金额,单位:元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 机构ID
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 入金时间
	 */
	@ApiField("inst_in_time")
	private String instInTime;

	/**
	 * 流水单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 单据状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 归属人主体ID
	 */
	@ApiField("principal_user_id")
	private String principalUserId;

	/**
	 * 剩余可操作金额;单位:元
	 */
	@ApiField("remain_amount")
	private String remainAmount;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInstInTime() {
		return this.instInTime;
	}
	public void setInstInTime(String instInTime) {
		this.instInTime = instInTime;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPrincipalUserId() {
		return this.principalUserId;
	}
	public void setPrincipalUserId(String principalUserId) {
		this.principalUserId = principalUserId;
	}

	public String getRemainAmount() {
		return this.remainAmount;
	}
	public void setRemainAmount(String remainAmount) {
		this.remainAmount = remainAmount;
	}

}
