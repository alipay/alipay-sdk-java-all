package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡充值详情
 *
 * @author auto create
 * @since 1.0, 2026-02-25 14:44:39
 */
public class CardRechargeDetail extends AlipayObject {

	private static final long serialVersionUID = 5627741236455173353L;

	/**
	 * 充值订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 充值失败信息
	 */
	@ApiField("recharge_fail_msg")
	private String rechargeFailMsg;

	/**
	 * 充值费用，单位：分
	 */
	@ApiField("recharge_fee")
	private Long rechargeFee;

	/**
	 * 充值流量，单位MB
	 */
	@ApiField("recharge_flow")
	private String rechargeFlow;

	/**
	 * 充值状态
	 */
	@ApiField("recharge_status")
	private String rechargeStatus;

	/**
	 * 充值时间
	 */
	@ApiField("recharge_time")
	private Date rechargeTime;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getRechargeFailMsg() {
		return this.rechargeFailMsg;
	}
	public void setRechargeFailMsg(String rechargeFailMsg) {
		this.rechargeFailMsg = rechargeFailMsg;
	}

	public Long getRechargeFee() {
		return this.rechargeFee;
	}
	public void setRechargeFee(Long rechargeFee) {
		this.rechargeFee = rechargeFee;
	}

	public String getRechargeFlow() {
		return this.rechargeFlow;
	}
	public void setRechargeFlow(String rechargeFlow) {
		this.rechargeFlow = rechargeFlow;
	}

	public String getRechargeStatus() {
		return this.rechargeStatus;
	}
	public void setRechargeStatus(String rechargeStatus) {
		this.rechargeStatus = rechargeStatus;
	}

	public Date getRechargeTime() {
		return this.rechargeTime;
	}
	public void setRechargeTime(Date rechargeTime) {
		this.rechargeTime = rechargeTime;
	}

}
