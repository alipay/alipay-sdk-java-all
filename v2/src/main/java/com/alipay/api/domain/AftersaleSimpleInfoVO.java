package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-16 15:12:54
 */
public class AftersaleSimpleInfoVO extends AlipayObject {

	private static final long serialVersionUID = 3166246255397853392L;

	/**
	 * 售后单的创建方式
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 平台售后单号
	 */
	@ApiField("aftersale_id")
	private String aftersaleId;

	/**
	 * 售后单发起原因
	 */
	@ApiField("aftersale_reason")
	private String aftersaleReason;

	/**
	 * 申请退款金额，单位：元，精确到小数点后两位
	 */
	@ApiField("apply_refund_amount")
	private String applyRefundAmount;

	/**
	 * 售后单创建时间，yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部售后单号
	 */
	@ApiField("out_aftersale_id")
	private String outAftersaleId;

	/**
	 * 售后状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 售后单类型
	 */
	@ApiField("type")
	private String type;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getAftersaleId() {
		return this.aftersaleId;
	}
	public void setAftersaleId(String aftersaleId) {
		this.aftersaleId = aftersaleId;
	}

	public String getAftersaleReason() {
		return this.aftersaleReason;
	}
	public void setAftersaleReason(String aftersaleReason) {
		this.aftersaleReason = aftersaleReason;
	}

	public String getApplyRefundAmount() {
		return this.applyRefundAmount;
	}
	public void setApplyRefundAmount(String applyRefundAmount) {
		this.applyRefundAmount = applyRefundAmount;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutAftersaleId() {
		return this.outAftersaleId;
	}
	public void setOutAftersaleId(String outAftersaleId) {
		this.outAftersaleId = outAftersaleId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
